package JavaZap;

public class TesteJavaZap {
    public static void main(String[] args) {
        // Inicializa o servidor em uma thread separada
        new Thread(() -> {
            try {
                new Servidor(12000); // Use a porta padrão
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // Aguarda o servidor iniciar
        try {
            Thread.sleep(2000); // Aguarda 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Inicializa o cliente em uma thread separada
        new Thread(() -> {
            try {
                new TelaJavaZap("10.136.64.34", 12000); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
