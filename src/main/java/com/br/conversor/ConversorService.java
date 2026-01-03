package com.br.conversor;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorService {
    private static final String API_KEY = "8b59f27be54e4e214ea8f217"; // Substitua pela sua chave da API
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double getTaxa(String moedaOrigem, String moedaDestino) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(BASE_URL + moedaOrigem))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

            return conversionRates.get(moedaDestino).getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter taxa de conversão: " + e.getMessage());
        }
    }
}