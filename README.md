<h1 align="center"> Projeto Conversor de Moedas 🪙💱</h1>

<p>
  Este é um projeto de conversor de moedas desenvolvido em Java, e que utiliza a API de taxa de câmbio da <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a> para realizar conversões entre diferentes moedas (dólar, real, peso argentino, e peso colombiano).
  O sistema exibe um menu para o usuário escolher qual conversão deseja realizar e, em seguida, solicita o valor a ser convertido. A conversão é feita com base nas taxas de câmbio atuais.
</p>

<h2>⚒️ Funcionalidades</h2>

- `Funcionalidade 1`: Conversão entre Dólar (USD) e Real (BRL)
- `Funcionalidade 2`: Conversão entre Dólar (USD) e Peso Argentino (ARS)
- `Funcionalidade 2`: Conversão entre Dólar (USD) e Peso Colombiano (COP)
- `Funcionalidade 3a,b,c`: Conversão entre Real (BRL), Peso Argentino (ARS), e Peso Colombiano (COP) para Dólar (USD)

<h2>💻 Como Usar</h2>
 <p>Execute o programa Principal.java </p>
<p>No menu irá aparecer as opções:</p>

![converte](https://github.com/user-attachments/assets/368c9c14-ee3d-4245-8df2-e196783b7e8a)

<p>Usuário escolhe uma das opções, como mostrado na imagem acima, e insere o valor que queres converter, assim,
  o programa vai fazer uma requisição à API de conversão e depois exibir o resultado na tela.</p>
  <p>Veja na imagem abaixo o resultado:</p>
  
 ![convertido](https://github.com/user-attachments/assets/8ade02c1-97b5-4447-ba91-a87a08e9fac9)

<h2>⚙️ Como Executar</h2>
<li>Clone este repositório.</li>
<li>Abra o projeto em sua IDE Java de sua preferência.</li>
<li>Substitua a chave de API na URL da classe `Conversao.java` com sua chave pessoal da <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a>.</li>
<li>Compile e execute o projeto.</li>

<h2>🔡 Dependências</h2>
<p>Este projeto utiliza as bibliotecas:</p>

<li>java.net.http para fazer as requisições HTTP.</li>
<li>com.google.gson.Gson para converter a resposta JSON da API em objetos Java.</li>

<h3>Pré-requisitos</h3>
<li>JDK 11 ou superior</li>
<li>Conexão com a internet para que seja possível realizar a consulta na API de taxa de câmbio</li>
