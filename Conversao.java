import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Conversao {
    public String conversao(int opcao, String moeda, double valorEscolhido){
        URI conversao = URI.create("https://v6.exchangerate-api.com/v6/INCLUA AQUI SUA KEY/latest/" + moeda);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(conversao)
                .build();

        try{
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Map<String, Object> jsonMap = gson.fromJson(response.body(), Map.class);
            Map<String, Double> conversaoRates = (Map<String, Double>) jsonMap.get("conversion_rates");
            OpcaoDeMoedasConvertida escolha = new OpcaoDeMoedasConvertida();
            String escolha2 = escolha.escolha(opcao);
            Double taxaDeConversao = conversaoRates.get(escolha2);
            double valorConvertido = valorEscolhido * taxaDeConversao;

            return "Valor " + valorEscolhido + "[" + moeda + "]" + " corresponde ao valor final de =>>> " + String.format("%.2f", valorConvertido) + "[" + escolha2 + "]";

        } catch (Exception e){
            throw new RuntimeException("Erro ao converter moeda");
        }
    }
}
