# ContaBanco

Este projeto Java simula a criação de uma conta bancária, onde o usuário pode inserir informações como número da agência, número da conta, nome do cliente e saldo inicial, e recebe uma mensagem formatada com essas informações.

## Atributos da Conta

| Atributo       | Tipo     | Exemplo       |
|----------------|----------|---------------|
| Numero         | Inteiro  | 1021          |
| Agencia        | Texto    | 067-8         |
| Nome Cliente   | Texto    | Limber Jhonathan |
| Saldo          | Decimal  | 237.48        |

## Getting Started

Bem-vindo ao projeto ContaBanco! Este guia irá ajudá-lo a começar a escrever código Java usando o Visual Studio Code.

### Prerequisites

Antes de começar, certifique-se de ter instalado:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Visual Studio Code](https://code.visualstudio.com/)

### Folder Structure

A estrutura de pastas do projeto é a seguinte:
- `src`: Contém os arquivos de código-fonte Java.
- `lib`: Pode conter bibliotecas de terceiros (opcional).
- `bin`: Diretório onde os arquivos compilados serão gerados.

## Usage

Para executar o projeto:
1. Clone este repositório ou baixe o arquivo ZIP.
2. Abra o projeto no Visual Studio Code.
3. Compile e execute o código usando a extensão Java no VS Code.

### Running the Application

- Abra o arquivo `ContaTerminal.java`.
- Execute a classe `ContaTerminal` pressionando `F5` ou através do comando `Run` no VS Code.
- Siga as instruções no terminal para inserir o número da agência, número da conta, nome do cliente e saldo inicial.

### Example

Suponha que você insira os seguintes valores:
- Número da Agência: 1234
- Número da Conta: 4567
- Nome do Cliente: Limber Jhonathan
- Saldo Inicial: 987456.85

A saída será:

```java
Olá Limber Jhonathan, obrigado por criar uma conta em nosso banco,
sua agência é 123-4, conta 4567 e seu saldo R$ 987.456,85 já está disponível para saque.
