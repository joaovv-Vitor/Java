/**
 * (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */
package cap2.quests;
import java.util.Scanner;

public class quest2_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numb;
        System.out.println("Digite um Número Inteiro para verificar se ele é par ou impar: ");
        numb = input.nextInt();
        
        if (numb%2 == 0) {
            System.out.println("É Par");
        }
        else{
            System.out.println("É Impar");
        }

    }
}
/**
 * Nesse problema, acredito que essa seja a manera mais facil de se resolver.
 */