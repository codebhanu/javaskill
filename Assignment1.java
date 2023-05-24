import java.util.Scanner;

public class Assignment1 {
    public static void main (String[] args) {
        Scanner aim = new Scanner(System.in);

        System.out.println("Enter three floating-point values separated by space");
        String numbers = aim.nextLine();

        String[] strFloatValue = numbers.split(" ");

        if (strFloatValue.length == 3) {
            float num1 = Float.parseFloat(strFloatValue[0]);
            float num2 = Float.parseFloat(strFloatValue[1]);
            float num3 = Float.parseFloat(strFloatValue[2]);
            float biggest;
            if (num1 >= num2 && num1 <= num3) {
                biggest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                biggest = num2;
            } else {
                biggest = num3;
            }

            System.out.println("Maximum is:" + biggest);

        } else

        {
            System.out.println("enter three floating-point values separated by space");

        }
        aim.close();

    }

}