import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String texto = scanner.nextLine();
        String textoInvertido = inverterString(texto);
        System.out.println("A string invertida é: " + textoInvertido);
    }

    public static String inverterString(String s) {
        String resultado = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            resultado += s.charAt(i);
        }
        return resultado;
    }
}
