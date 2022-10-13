import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> telefonLista = new HashMap<>();

        telefonLista.put("Greta", "543 3431 1533");         // Keys with values
        telefonLista.put("Karin", "634 2341 2344");
        telefonLista.put("Kevin", "324 5430 1222");


        System.out.println("Enter which name you would like to know the number from: Greta, Karin, Kevin");

            String searchNumber = input.nextLine();

            String n1 = telefonLista.get("Greta");      // String for numberSearch with names
            String n2 = telefonLista.get("Karin");
            String n3 = telefonLista.get("Kevin");

            if (searchNumber.equals("Greta")) {
                System.out.println("Gretas number is:" + n1);
                System.out.println("Would you like to enter another name?");
                input.nextLine();
            }
            if (searchNumber.equals("Karin")) {
                System.out.println("Karins number is: " + n2);
                System.out.println("Would you like to enter another name?");
                input.nextLine();
            }
            if (searchNumber.equals("Kevin")) {
                System.out.println("Kevins number is: " + n3);
                System.out.println("Would you like to enter another name?");
                input.nextLine();
            } else {
                System.exit(0);   //End

            }
        }
    }
}