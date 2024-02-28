public class SmallestOfThree {
    public static int smallestOfThree(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        int smallest = smallestOfThree(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);
    }
}
