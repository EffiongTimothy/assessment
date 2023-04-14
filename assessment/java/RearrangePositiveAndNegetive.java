import java.util.Arrays;

public class RearrangePositiveAndNegetive {
        public static void main(String[] args) {
            int[] myArray = new int[0];
            int[] valuesToAdd = {-5, 2, -4, 1, 3};
            int oldLength = myArray.length;
            int newLength = oldLength + valuesToAdd.length;
            myArray = Arrays.copyOf(myArray, newLength);
            System.arraycopy(valuesToAdd, 0, myArray, oldLength, valuesToAdd.length);


            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length - i - 1; j++) {
                    if (myArray[j] > myArray[j + 1]) {
                        int temp = myArray[j];
                        myArray[j] = myArray[j + 1];
                        myArray[j + 1] = temp;
                    }
                }
            }

            System.out.println(Arrays.toString(myArray));
        }
    }



