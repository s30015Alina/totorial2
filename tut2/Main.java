import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter your city");
        String city = Scanner.nextLine();
        System.out.println("enter your age");
        int age = Scanner.nextInt();
        System.out.println("is it Thursday?(true/false)");
        boolean isThursday = Scanner.nextBoolean();
        double a = 1;
        double b = 1;
        double c = 1;
        if(age < 10.0 | isThursday){
            a *= 0;
        }
        else if(!(age < 10.0) || !(isThursday)){
            a *= 1;
        }
        if (age >=10 && age <18 ){
            b *= 50;
        }
        if (city.equalsIgnoreCase("Warsaw")){
            c *= 10;
        }
        if(age > 18){
            b*=0;
        }
        System.out.println(a * (b + c) + "%");

    }
}