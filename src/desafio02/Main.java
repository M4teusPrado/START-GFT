package desafio02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        
        do  {

            int numero = random.nextInt(7);
            System.out.printf("Digite um numero \n");
            int numerousuario = Integer.parseInt(scanner.nextLine());

            if(numero == numerousuario) {
                System.out.printf("voce acertou!!\n");
                flag = 1;
            } else  {
                System.out.printf("Tente outro numero!\n");
            }
        }while(flag == 0);    
        
        scanner.close();
        
    }
}
