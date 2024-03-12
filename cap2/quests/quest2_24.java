/**
 * (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
    no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo
 */

package cap2.quests;

import java.util.Scanner;

public class quest2_24 {
    //Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb1;
        int numb2;
        int numb3;
        int numb4;
        int numb5;

        System.out.println("Digite 5 numeros: ");
        numb1 = input.nextInt();
        numb2 = input.nextInt();
        numb3 = input.nextInt();
        numb4 = input.nextInt();
        numb5 = input.nextInt();
   
        if (numb1==numb2 && numb1==numb3 && numb1 == numb4 && numb1 == numb5) {
            System.out.println("São iguais");
        }
        else{
            if (numb1>numb2 && numb1>numb3 && numb1 > numb4 && numb1 > numb5) {
                System.out.printf("%s%d%s%n", "O Número ", numb1, " é o maior");
            }
            if(numb2>numb1 && numb2>numb3 && numb2 > numb4 && numb2 > numb5){
                System.out.printf("%s%d%s%n", "O Número ", numb2, "é o maior");
            }
            if(numb3>numb1 && numb3>numb2 && numb3 > numb4 && numb3 > numb5){
                System.out.printf("%s%d%s%n", "O Número ", numb3, "é o maior");
            }
            if(numb4>numb1 && numb4>numb3 && numb4 > numb2 && numb4 > numb5){
                System.out.printf("%s%d%s%n", "O Número ", numb4, "é o maior");
            }
            if(numb5>numb1 && numb5>numb3 && numb5 > numb4 && numb5 > numb2){
                System.out.printf("%s%d%s%n", "O Número ", numb5, "é o maior");
            }
            if (numb1<numb2 && numb1<numb3 && numb1 < numb4 && numb1 < numb5) {
                System.out.printf("%s%d%s%n", "O Número ", numb1, " é o maior");
            }
            if (numb1<numb2 && numb1<numb3 && numb1 < numb4 && numb1 < numb5) {
                System.out.printf("%s%d%s%n", "O Número ", numb1, " é o menor");
            }
            if (numb2<numb1 && numb2<numb3 && numb2 < numb4 && numb2 < numb5) {
                System.out.printf("%s%d%s%n", "O Número ", numb2, " é o menor");
            }
            if (numb3<numb2 && numb3<numb1 && numb3 < numb4 && numb3 < numb5) {
                System.out.printf("%s%d%s%n", "O Número ", numb3, " é o menor");
            }
            if (numb4<numb2 && numb4<numb3 && numb4 < numb1 && numb4 < numb5) {
                System.out.printf("%s%d%s%n", "O Número ", numb4, " é o menor");
            }
            if (numb5<numb2 && numb5<numb3 && numb5 < numb4 && numb5 < numb1) {
                System.out.printf("%s%d%s%n", "O Número ", numb5, " é o menor");
            }
        } 

    }

}
/**
 * 
 * Por está limitado aos conhecimentos mostrados no capítulo, essa foi uma das diversas possíbilidas que pensei para esse problema.
 * Acredito que exista uma forma melhor para a resolução, porem escolhir essa pela facilidade na escrita.
 * 
 */