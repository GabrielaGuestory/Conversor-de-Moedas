import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(Moeda moedas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter escrita = new FileWriter(moedas.base_code() + ".json")) {
            escrita.write(gson.toJson(moedas));
        }
    }
}

