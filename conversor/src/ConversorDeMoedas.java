import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoedas {

    public Moeda converteMoeda(String apiKey) {

        URI moedaUri = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD");


        HttpRequest request = HttpRequest.newBuilder()
                .uri(moedaUri)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a partir dessa moeda selecionada.", e);
        }
    }

    private void currencyNames() {
    }
}
