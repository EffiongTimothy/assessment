import java.util.Scanner;

public class LargestNumber {
  private  static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int largest=0;
        int secondLargest=largest;
        while (true) {
            System.out.println("enter multiple numbers press stop to end");
            String number = scanner.nextLine();
             if(number.equalsIgnoreCase("stop")){
                break;
            }
            else if (Integer.parseInt(number)>largest){
                largest = Integer.parseInt(number);
            }
            else if (largest > Integer.parseInt(number)) {
            secondLargest = Integer.parseInt(number);
            }
        }
        System.out.println("largest number is "+largest+" second largest "+secondLargest);
    }
}
