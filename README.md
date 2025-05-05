<h1 align="center"> Projeto Conversor de Moedas 🪙💱</h1>

<p>
  Este é um projeto de conversor de moedas desenvolvido em Java, e que utiliza a API de taxa de câmbio da <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a> para realizar conversões entre diferentes moedas (dólar, real, peso argentino, e peso colombiano).
  O sistema exibe um menu para o usuário escolher qual conversão deseja realizar e, em seguida, solicita o valor a ser convertido. A conversão é feita com base nas taxas de câmbio atuais.
</p>

<h2>⚒️ Funcionalidades</h2>

- `Funcionalidade 1`: Conversão entre Dólar (USD) e Real (BRL)
- `Funcionalidade 2`: Conversão entre Dólar (USD) e Peso Argentino (ARS)
- `Funcionalidade 3`: Conversão entre Dólar (USD) e Peso Colombiano (COP)
- `Funcionalidade 4`: Conversão entre Dólar (USD) e Euro (EUR)
- `Funcionalidade 5`: Conversão entre Dólar (USD) e Rubllo Russo (RUB)
- `Funcionalidade 6`: Conversão entre Dólar (USD) e Iene (JPY)
- `Funcionalidade 7a,b,c,d,e,f`: Conversão entre Real (BRL), Peso Argentino (ARS), Peso Colombiano (COP), Euro (EUR), Rubllo Russo (RUB) e Iene (JPY) para Dólar (USD)

<h2>💻 Como Usar</h2>
 <p>Execute o programa Principal.java </p>
<p>No menu irá aparecer as opções:</p>

![menu](https://github.com/user-attachments/assets/77628ddf-79b3-4078-8359-19183fa93edf)


<p>Usuário escolhe uma das opções, como mostrado na imagem acima, e insere o valor que queres converter. Neste exemplo foi escolhido a opção 10 - 'converter Euro para Dólar' e o valor para conversão foi 50, assim,
  o programa vai fazer uma requisição à API de conversão e depois exibir o resultado na tela.</p>
  <p>Veja na imagem abaixo o resultado:</p>
  
![resulltado](https://github.com/user-attachments/assets/bccc174d-0d33-4fb5-9fc5-489e59ed3472)


<h2>⚙️ Como Executar</h2>
<li>Clone este repositório.</li>
<li>Abra o projeto em sua IDE Java de sua preferência. <a href="https://www.jetbrains.com/pt-br/idea/">IDE utilizada</a> para criar o projeto.</li>
<li>Substitua a chave de API na URL da classe `Conversao.java` com sua chave pessoal da <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a>.</li>
<li>A URL desta linha: 

`URI conversao = URI.create("https://v6.exchangerate-api.com/v6/SUA API KEY AQUI/latest/" + moeda);`
</li>
<li>Baixe do site <a href="https://mvnrepository.com/artifact/com.google.code.gson/gson">MVN Repository</a> o arquivo JAR (Java ARchive) mais recente, nele contém a biblioteca Gson empacotada para utilizar no projeto Java.</li>
<li>Compile e execute o projeto.</li>

<h2>🔡 Dependências</h2>
<p>Este projeto utiliza as bibliotecas:</p>

<li>java.net.http para fazer as requisições HTTP.</li>
<li>com.google.gson.Gson para converter a resposta JSON da API em objetos Java.</li>

<h3>Pré-requisitos</h3>
<li>JDK 11 ou superior</li>
<li>Conexão com a internet para que seja possível realizar a consulta na API de taxa de câmbio</li>
