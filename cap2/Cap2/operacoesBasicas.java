package cap2.Cap2;

//import java.util.*;
import java.util.Scanner;

public class operacoesBasicas {
    /**
     * soma +
     * sub -
     * div /
     * mult *
     * resto %
     * 
     * nextline != nextint
     * 
     * nextline pega pega a prox string
     * nextint pega o prox int
     * 
     */

    


    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numb1;
            int numb2;
   
            System.out.println("Primeiro numero: ");
            numb1 = input.nextInt();

            System.out.println("Segundo nuemro: ");
            numb2 = input.nextInt();

            System.out.printf("%s%d%n","A soma é: ", numb1+numb2);
            System.out.printf("%s%d%n","A subs é: ", numb1-numb2);
            System.out.printf("%s%d%n", "A multi é: ", numb1*numb2);
            if (numb2 != 0) {
                System.out.printf("%s%d%n", "A div é: ", numb1/numb2);
                System.out.printf("%s%d%n", "o resto da div é: ", numb1%numb2);    
            }
            else{
                System.out.println("erro, Segundo numero é 0\n");
            }
        }
        

        






    }


}

