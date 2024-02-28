public class DescendingOrder {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        int num3 = 30;

        System.out.println("Before sorting:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        // Sorting logic
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("\nAfter sorting in descending order:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }
}
