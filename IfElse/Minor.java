import java.util.*;
class Minor{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();

        if(age>18) {
            System.out.println("You're Legal");
        }
        else{
            System.out.println("Shut up, Minor");
        }
    }
}

