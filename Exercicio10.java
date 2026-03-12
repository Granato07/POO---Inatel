import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtdInteira;
        int qtdMeia;

        String valorInteiraStr;
        String valorMeiaStr;

        double valorInteira;
        double valorMeia;

        double totalInteira;
        double totalMeia;
        double totalArrecadado;
        double mediaIngresso;
        int totalIngressos;

        System.out.println("Quantidade de ingressos inteiros:");
        qtdInteira = scanner.nextInt();

        System.out.println("Quantidade de meia-entrada:");
        qtdMeia = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("Valor do ingresso inteiro:");
        valorInteiraStr = scanner.nextLine();

        System.out.println("Valor da meia-entrada:");
        valorMeiaStr = scanner.nextLine();

        valorInteiraStr = valorInteiraStr.replace(",", ".");
        valorMeiaStr = valorMeiaStr.replace(",", ".");

        valorInteira = Double.parseDouble(valorInteiraStr);
        valorMeia = Double.parseDouble(valorMeiaStr);

        totalInteira = qtdInteira * valorInteira;
        totalMeia = qtdMeia * valorMeia;

        totalArrecadado = totalInteira + totalMeia;

        totalIngressos = qtdInteira + qtdMeia;

        mediaIngresso = totalArrecadado / totalIngressos;

        System.out.println("Total arrecadado com ingressos inteiros: " + totalInteira);
        System.out.println("Total arrecadado com meia-entrada: " + totalMeia);
        System.out.println("Total arrecadado na sessão: " + totalArrecadado);
        System.out.println("Valor médio por ingresso: " + mediaIngresso);

        scanner.close();
    }
}
