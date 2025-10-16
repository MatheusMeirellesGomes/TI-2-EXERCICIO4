import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class TextAnalyticsExample {
    public static void main(String[] args) throws Exception {
        // Substitua pelos seus dados
        String endpoint = "https://exercicio-4-ti2.cognitiveservices.azure.com/";
        String apiKey = "minha-chave-aqui";
        String path = "/text/analytics/v3.0/sentiment";

        // Texto para análise
        String json = "{ \"documents\": [ { \"id\": \"1\", \"language\": \"pt\", \"text\": \"Eu adoro estudar na PUC Minas!\" } ] }";

        // Monta a URL
        URL url = new URL(endpoint + path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Ocp-Apim-Subscription-Key", apiKey);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        // Envia o JSON
        OutputStream os = conn.getOutputStream();
        byte[] input = json.getBytes(StandardCharsets.UTF_8);
        os.write(input, 0, input.length);

        // Lê a resposta
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
        StringBuilder response = new StringBuilder();
        String responseLine;
        while ((responseLine = br.readLine()) != null) {
            response.append(responseLine.trim());
        }

        // Mostra o resultado
        System.out.println("Resposta da API:");
        System.out.println(response.toString());

        // Fecha conexões
        br.close();
        os.close();
        conn.disconnect();
    }
}