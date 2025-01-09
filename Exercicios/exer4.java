public class PercentualFaturamento {
    public static void main(String[] args) {
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double totalFaturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        System.out.printf("O estado SP representa %.2f%% do faturamento total.\n", (faturamentoSP / totalFaturamento) * 100);
        System.out.printf("O estado RJ representa %.2f%% do faturamento total.\n", (faturamentoRJ / totalFaturamento) * 100);
        System.out.printf("O estado MG representa %.2f%% do faturamento total.\n", (faturamentoMG / totalFaturamento) * 100);
        System.out.printf("O estado ES representa %.2f%% do faturamento total.\n", (faturamentoES / totalFaturamento) * 100);
        System.out.printf("O estado Outros representa %.2f%% do faturamento total.\n", (faturamentoOutros / totalFaturamento) * 100);
    }
}
