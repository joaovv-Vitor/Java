/**
 * ) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado. 
 * [Dica: utilize o operador de resto.]
 */
package cap_2.quests;
import java.util.Scanner;

public class quest2_26 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        int numb1;
        int numb2;

        System.out.println("Digite o Dois Números: ");
        numb1 = input.nextInt();
        numb2 = input.nextInt();

        if (numb1%numb2 == 0) {// sendo o resuldado do resto for 0, é multiplo
            System.out.println("O Primeiro é multiplo do Segundo \n");
        }
        else{
            System.out.println("O Primeiro é não multiplo do Segundo \n");
        }
        System.out.printf("%s%d", "A multiplicação entre eles é: ", numb1*numb2);
    }
}
/**
 * No caso dessa questão acretido que essa a maneira mais tranquila de resolver.
 */