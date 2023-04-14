import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = 22;
        while (true){
            System.out.println("enter birthday  date");
        int result = scanner.nextInt();
        if (result ==date) {
            System.out.println("Correct GUESS");
            break;
        }
        else{
            System.out.println("InCorrect GUESS");
        }
        }
        }
    }

