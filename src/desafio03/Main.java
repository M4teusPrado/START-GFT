package desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valor , impostoTotal = 0, x;
   
        ICMS icms = new ICMS();
        IPI ipi = new IPI();
        COFINS cofins = new COFINS();
        
        System.out.print("Digite um valor: ");
        valor = scanner.nextDouble();

        x = icms.calculaImposto(valor);
        impostoTotal += x;
        System.out.printf("%s: %.1f \n", icms.toString(), x);

        x = ipi.calculaImposto(valor);
        impostoTotal += x;
        System.out.printf("%s: %.1f \n", ipi.toString(), x);

        x = cofins.calculaImposto(valor);
        impostoTotal += x;
        System.out.printf("%s: %.1f \n", cofins.toString(), x);

        System.out.printf("Valor Final: %.1f", impostoTotal + valor);

        scanner.close();
    }
}
