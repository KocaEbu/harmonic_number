import java.util.Scanner;

public class num_harmonic_finder {

    public static void main(String[] args) {
        double n;
        double sum=0;

        Scanner input= new Scanner(System.in);

        System.out.print("Harmonik alinacak tam sayiyi (n) giriniz : ");
        n= input.nextInt();

        while( n!=0 ){

            sum=sum+(1/n);
            n--;

        }

        System.out.println("Harmonic Total : "+sum);








    }
}
