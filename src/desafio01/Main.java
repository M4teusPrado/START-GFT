package desafio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        List<Atleta> atletas = new ArrayList<>();

        for(int i = 1; i <= 3; i++) {

            Atleta atleta = new Atleta();
            
            System.out.printf("Digite o nome do Atleta %d: \n", i);
            atleta.setNome(scanner.nextLine());

            System.out.printf("Digite o pais do Atleta %d: \n", i);
            atleta.setPais(scanner.nextLine());

            System.out.printf("Digite o resultado (em metros) do Atleta %d: \n", i);
            atleta.setDistancia(Integer.parseInt(scanner.nextLine()));

            atletas.add(atleta);
        }

        List<Atleta> copia = new ArrayList<>();
        copia = atletas;
        Collections.sort(copia, (a, b) -> b.getDistancia() - a.getDistancia());

        System.out.printf("Ouro: %s - %s - Resultado: %d m\n", copia.get(0).getNome(),copia.get(0).getPais(), copia.get(0).getDistancia());
        System.out.printf("Prata: %s - %s - Resultado: %d m\n", copia.get(1).getNome(),copia.get(1).getPais(), copia.get(1).getDistancia());
        System.out.printf("Bronze: %s - %s - Resultado: %d m\n", copia.get(2).getNome(),copia.get(2).getPais(), copia.get(2).getDistancia());

        scanner.close();
    }
}
