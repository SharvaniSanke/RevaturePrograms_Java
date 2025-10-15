import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        int input=80;
        if(input>=90&&input<=100)
        {
            System.out.println("A Grade");
        }
        else if(input>=80&&input<90){
            System.out.println("B Grade");
        }
        else if(input>=70&&input<80){
            System.out.println("C Grade");
        }
        else if(input>=60&&input<70) {
            System.out.println("D Grade");
        }
        else{
            System.out.println("Fails the test");
        }
    }
}
