

import java.util.Scanner;

public class hipotenüs {
    public static void main(String[] args){
        int a , b ;
        double c , d , e;
        Scanner girdi = new Scanner(System.in);
System.out.print("1. Kenarı Giriniz = ");
a = girdi.nextInt();
System.out.print("2. Kenarı Giriniz = ");
b = girdi.nextInt();
c = Math.sqrt((a*a)+(b*b));
System.out.println("Hipotenüs = "+c);
d = (a+b+c);
System.out.print("Çevre = "+d);



















    }


}
