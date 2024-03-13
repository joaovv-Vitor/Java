import java.util.Scanner;
public class AccountTest{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        //Exibir o nome inicial
        System.out.printf("O nome inicialmente é: %s%n%n", myAccount.getName() );

        System.out.println( "Digite o nome para aconta: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println( " ");

        System.out.printf( "O nome da conta é: %n%s%n", myAccount.getName());
        
        


    }

}
