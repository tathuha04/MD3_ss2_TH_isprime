import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
//        switch (number){
//            case 0:
//            case 1:
//                System.out.println(number +" is not prime");
//                break;
//            case 2:
//                System.out.println(number + " is prime");
//                break;
//            default:
//                for (int i = 2; i <= Math.sqrt(number); i++) {
//                    if(number % i == 0){
//                        System.out.println(number + " is not prime");
//                        break;
//                    }
//                    System.out.println(number+ " is prime");
//                    break;
//                }
//        }
        if (number < 2){
            System.out.println( number +" is not a prime");
        }
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " is a prime");
            }else {
                System.out.println(number + "is not a prime");
            }
        }
//        else {
//            for (int i=2; i< Math.sqrt(number); i++){
//                if (number % i==0){
//                    System.out.println(number+" is not prime");
//                    break;
//                }else {
//                    System.out.println(number+" is prime");
//                }
//            }
//        }
    }
}