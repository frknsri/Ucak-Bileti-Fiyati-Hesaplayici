import java.util.Scanner;

public class bilet {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int age;
        double km, costPerKm = 0.1, recipe, total;
        boolean isError = false;
        //----------
        System.out.print("Mesafe Giriniz :");
        km = inp.nextInt();
        //----------
        System.out.print("Yaşınızı Giriniz :");
        age = inp.nextInt();
        //---------
        System.out.println("Yolculuk tipini giriniz\n1-Tek Yön\n2-Gidiş Dönüş");
        recipe = inp.nextInt();
        total = km * costPerKm;

        ///----12 yaş ----
        if (age < 12) {
            total *= 0.5;

        ///--12-24-yaş-arası--
        } else if (age >= 12 && age <= 24) {
            total *= 0.9;

        ///--65-yaşından-büyük---
        } else if (age > 65) {
            total *= 0.7;

        ///--tarife-seçime---
        }if(recipe==1 && recipe<3 ){
            total =total ;
            isError = true;
        }else if (recipe==2){
            total *=0.8;
        ///--km--hatası-----
        if (!(km >= 0)) {
            isError = true;
        }
        if (isError == true) {
            System.out.println("Hatalı Veri Girdiniz !!!");
        } else {
            System.out.println("Toplam Tutar :" + total + "TL");
        }


    }
}