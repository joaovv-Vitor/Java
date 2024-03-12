package cap2;

import java.util.Scanner;//o import precisa ser feito antes da public class

public class Comparison {
    

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numb1;
            int numb2;

            System.out.printf("%s%n$s", "Digite dois numero", "Digite o Primeiro Número: ");
            numb1 = input.nextInt();

            System.out.println("Digite o Segundo Número: ");
            numb2 = input.nextInt();

            if (numb1>numb2) {
                System.out.printf("%d%s%d%n", numb1, ">", numb2);
            }
            if (numb1<numb2) {
                System.out.printf("%d%s%d%n", numb1, "<", numb2);
            }
            if (numb1==numb2) {
                //System.out.printf("%d%s%d%n", numb1, "=", numb2);
                System.out.printf("%d == $d%n", numb1, numb2);
            }
            if (numb1>=numb2) {
                System.out.printf("%d%s%d%n", numb1, ">=", numb2);
            }
            if (numb1<=numb2) {
                System.out.printf("%d%s%d%n", numb1, "<=", numb2);
            }
        }

        

    }


}
