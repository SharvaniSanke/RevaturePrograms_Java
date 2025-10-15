import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        String name = inputs.nextLine();
        int ageInt = inputs.nextInt();
        inputs.nextLine();
        String address = inputs.nextLine();

        System.out.println("              Details           ");
        System.out.println("----------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+ageInt);
        System.out.println("Address: "+address);
    }
}
