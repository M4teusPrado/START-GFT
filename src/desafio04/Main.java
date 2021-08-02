package desafio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        
        Scanner scanner = new Scanner(System.in);
        int multiplicando = 0, iniIntervalo = 0, fimIntervalo = 0;

        System.out.print("Digite o valor do multiplicando: ");
        multiplicando = scanner.nextInt();

        System.out.print("Digite o valor do inicio: ");
        iniIntervalo = scanner.nextInt();

        System.out.print("Digite o valor do fim: ");
        fimIntervalo = scanner.nextInt();


        if(multiplicando > 1000 ) {
            System.out.print("informações invalidas");
        }
        if ((iniIntervalo < 0||fimIntervalo < 0) ||(fimIntervalo - iniIntervalo > 10 ) || (iniIntervalo > fimIntervalo) ||  (iniIntervalo > 1000 ||fimIntervalo > 1000 )){
            System.out.print("informações invalidas");
        } 
        else {
        
            while(iniIntervalo <= fimIntervalo)
            {
                int resultado = iniIntervalo * multiplicando;
                System.out.printf("%d x %d = %d \n", multiplicando, iniIntervalo, resultado);

                iniIntervalo++;
            }

        }

        scanner.close();
    }
    
}
