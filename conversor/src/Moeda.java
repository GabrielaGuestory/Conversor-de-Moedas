import java.util.Map;

public record Moeda(Map<String, Double> conversion_rates, String base_code, double USD, double BRL,
                    double ARS, double EUR, double BOB, double CLP, double COP) {
    public String cambio() {
        return base_code;
    }
}
