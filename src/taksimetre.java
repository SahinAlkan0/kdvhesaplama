


import java.util.Scanner;

public class taksimetre {
    public static void main(String[]args) {


double kmbasıtutar = 2.2 , acılıs = 10 , mesafe , toplamtuttar ;

Scanner input = new Scanner(System.in);
System.out.print("Gidilecek Mesafeyi Giriniz = ");
mesafe = input.nextDouble();

toplamtuttar = (acılıs + (mesafe * kmbasıtutar));

if(toplamtuttar<20){
    toplamtuttar = 20;
} else{}

System.out.println("Ödeyeceğiniz Tutar = "+toplamtuttar);

    }
}
