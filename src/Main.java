import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,KdvTutar,KdvliTutar, kdvOran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz = ");
        tutar = input.nextDouble();

        KdvTutar = tutar * kdvOran;
        KdvliTutar= KdvTutar + tutar;



        if(tutar>1000){
           kdvOran=8;

        } else {

        }
        System.out.println("KDV'siz Tutar = "+tutar);
        System.out.println("KDV Tutarı = "+KdvTutar);
        System.out.println("KDV Oranı = "+kdvOran);
        System.out.println("KDV'li Tutar = "+KdvliTutar);





















    }
}