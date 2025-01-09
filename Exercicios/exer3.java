import org.json.JSONObject;
import java.util.Iterator;

public class Faturamento {
    public static void main(String[] args) {
        String faturamentoJson = "{"
                + "\"01\": 15000.00,"
                + "\"02\": 0.00,"
                + "\"03\": 13000.00,"
                + "\"04\": 17000.00,"
                + "\"05\": 20000.00,"
                + "\"06\": 0.00,"
                + "\"07\": 18000.00,"
                + "\"08\": 21000.00"
                + "}";

        JSONObject faturamento = new JSONObject(faturamentoJson);

        // Filtra os dias com faturamento
        double somaFaturamento = 0;
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        int diasAcimaDaMedia = 0;
        int diasComFaturamento = 0;

        Iterator<String> keys = faturamento.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            double valor = faturamento.getDouble(key);
            if (valor > 0) {
                somaFaturamento += valor;
                if (valor < menorFaturamento) menorFaturamento = valor;
                if (valor > maiorFaturamento) maiorFaturamento = valor;
                diasComFaturamento++;
            }
        }

        // Cálculo da média
        double mediaMensal = somaFaturamento / diasComFaturamento;

        // Verifica quantos dias tiveram faturamento acima da média
        keys = faturamento.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            double valor = faturamento.getDouble(key);
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento: R$" + menorFaturamento);
        System.out.println("Maior faturamento: R$" + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
