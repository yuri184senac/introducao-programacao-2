# Sistema Acadêmico

![UML](https://i.imgur.com/aNiFIqJ.png)

## Descrição do Projeto

Este projeto é um sistema acadêmico que gerencia informações de pessoas, alunos e professores, além de suas respectivas regras de negócio. A estrutura é representada pela UML acima.

## Entidades

### Pessoa (classe abstrata)

A `Pessoa` é uma classe abstrata que serve como base para outras classes no sistema. Ela possui os seguintes atributos:
- **nome**
- **cpf**
- **matrícula**
- **telefone**
- **e-mail**
- **endereço**

### Aluno (classe filha de Pessoa)

A classe `Aluno` herda de `Pessoa` e pode ser especializada em dois tipos:

#### Regras de negócio dos Alunos

- Podem se inscrever em disciplinas.
- Solicitar boletos.
- Solicitar históricos.

#### Aluno Graduação (filha de Aluno)

Um aluno de graduação possui regras de negócio específicas:
- **Duração do curso:** 5 semestres.
- **Projeto integrador:** 5 semestres.

#### Aluno Pós-graduação (filha de Aluno)

Um aluno de pós-graduação possui regras de negócio específicas:
- **Duração do curso:** 6 módulos (cada módulo = 2 meses).
- **Projeto integrador:** N/A.

### Professor (filha de Pessoa)

A classe `Professor` herda de `Pessoa` e possui as seguintes regras de negócio:
- Lançar notas para as avaliações.
- Lançar frequência dos alunos.

## Diagrama UML

O diagrama UML acima representa a estrutura das entidades e suas relações no sistema.
