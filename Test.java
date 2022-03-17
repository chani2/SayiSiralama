import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayi : ");
        a = input.nextInt();

        System.out.println("2. Sayi : ");
        b = input.nextInt();

        System.out.println("3. Sayi : ");
        c = input.nextInt();

        if ( (a < c) && (a < b)){
            if ( b < c){
                System.out.println(a + " < " + b + " < " + c);
            }else{
                System.out.println(a + " < " + c + " < " + b);
            }
        }else if ( ( c < a) && (c < b)){
            if (b < a){
                System.out.println(c + " < " + b + " < " + a);
            }else{
                System.out.println(c + " < " + a + " < " + b);
            }
        }else if ( (b < a) && ( b < c)){
            if ( a < c){
                System.out.println(b + " < " + a + " < " + c);
            }else{
                System.out.println(b + " < " + c + " < " + a);
            }
        }

















































    }
}
