import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;

        switch (operation) {
            case 1: System.out.println("Your addition value is " + sum);
                break;
            case 2: System.out.println("Your subtraction value is " + diff);
                break;
            case 3:  System.out.println("Your multiplication value is " + mul);
                break;
            case 4: System.out.println("Your division value is " + div);
                break;
            default: System.out.println("Invalid Button");
        }

    }
    
}