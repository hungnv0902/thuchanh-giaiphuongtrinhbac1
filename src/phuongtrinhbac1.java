import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");

        float a = scanner.nextFloat();
        System.out.println("Nhap b: ");
        float b = scanner.nextFloat();
        if(a == 0) {
            if(b == 0) {
                System.out.println("PHương trình vô số nghiệm x");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm là " + (-b/a));
        }
    }
}
