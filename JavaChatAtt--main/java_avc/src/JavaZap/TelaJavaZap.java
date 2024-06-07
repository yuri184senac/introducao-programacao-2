package JavaZap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.BorderFactory;

public class TelaJavaZap extends JFrame implements ActionListener {

    private JTextField inputTextField;
    private JTextArea chatArea;
    private JButton sendButton;
    private Socket clientSocket;
    private PrintStream outputStream;
    private String clientId; 

    public TelaJavaZap(String serverAddress, int serverPort) throws UnknownHostException, IOException {
    	//Cabecalho
        super("WhatsApp 2");      
        ImageIcon icon = new ImageIcon("./src/image/zapicone.png");
        Image image = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(image);      
        setSize(400, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); //Controla a posição dos componentes

        JPanel contentPane = new JPanel(null) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
              // Carregue a imagem
              ImageIcon icon = new ImageIcon("./src/image/tron.gif"); 
              Image image = icon.getImage();
              g.drawImage(image, 0, 0, getWidth(), getHeight(), this); // Desenha a imagem
            }
        };
        

        // Mostra as Mensagens
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setForeground(Color.white); // Define a cor do texto da área de mensagens como branca
        chatArea.setOpaque(false); // Define a área de mensagens como transparente
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setBounds(10, 10, 370, 450); // Define a posição e o tamanho da área de mensagens
        scrollPane.setOpaque(false); // Define o scrollPane como transparente
        scrollPane.getViewport().setOpaque(false); //viewport do scrollPane como transparente
        contentPane.add(scrollPane);

        // Caixa de texto de entrada + botão 
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputTextField = new JTextField(25);
        inputTextField.setForeground(Color.black); // Define a cor do texto do campo de entrada como branca
        sendButton = new JButton("Enviar");
        sendButton.setPreferredSize(new Dimension(100, 40)); 
        sendButton.setBackground(Color.BLUE);
        sendButton.setForeground(Color.white);
        sendButton.addActionListener(this);
        sendButton.setBorder(BorderFactory.createBevelBorder(10)); //Botao em baixo do campo pesquisa
        inputPanel.add(inputTextField);
        inputPanel.add(sendButton);
        inputPanel.setOpaque(false);
        inputPanel.setBounds(10, 470, 370, 60); // Define a posição e o tamanho dos componentes
        contentPane.add(inputPanel);
        setContentPane(contentPane);
        
        // Gere um identificador único para o cliente
        clientId = UUID.randomUUID().toString();

        new Thread(() -> {
            try {
                // Conexão com o servidor 
                clientSocket = new Socket(serverAddress, serverPort);
                System.out.println("Conectado ao servidor!");
                outputStream = new PrintStream(clientSocket.getOutputStream());

                // Envie o identificador do cliente para o servidor
                outputStream.println(clientId); // Envie o identificador na primeira linha

                Scanner input = new Scanner(clientSocket.getInputStream());
                while (input.hasNextLine()) {
                    String message = input.nextLine();
                    chatArea.append(message + "\n");
                }
            } catch (IOException e) {
                System.err.println("Erro na comunicação com o servidor: " + e.getMessage());
            } finally {
                try {
                    if (clientSocket != null) {
                        clientSocket.close();
                    }
                } catch (IOException e) {
                    System.err.println("Erro ao fechar a conexão com o servidor: " + e.getMessage());
                }
            }
        }).start();

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton) {
            String message = inputTextField.getText();
            if (!message.isEmpty()) {
                chatArea.append("Matheus: " + message + "\n");               
                outputStream.println(message); // Envia a mensagem para o servidor
                inputTextField.setText("");
            }
        }
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        new TelaJavaZap("192.168.0.10", 12000);
    }
}