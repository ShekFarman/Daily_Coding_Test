import java.util.Scanner;
public class SwitchEx{
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a Char : ");
        String vow = scan.nextLine();
        char res = vow.toLowerCase().charAt(0);

        switch (res){
            case 'a':
                System.out.println("'A ' is a vowel .");
                break;
            
            case 'e':
                System.out.println(" 'E 'is a vowel .");
                break;
            
            case 'i':
                System.out.println(" 'I' is a vowel .");
                break;

            case 'o':
                System.out.println("'O' is a vowel .");
                break;

            case 'u':
                System.out.println(" 'U' is a vowel");
                break;

            default:
                System.out.println("you have entered '"+res+ "'  its not a vowel");

        }
    }
}