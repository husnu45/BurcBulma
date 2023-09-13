
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner getData = new Scanner (System.in);
        
        System.out.print("Dogdugunuz Ay'i Giriniz : ");
        
        int ay = getData.nextInt();
        
        System.out.print("Dogdugunuz Gunu Giriniz : ");
        
        int gun = getData.nextInt();
        
        String burc;
        
        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) { // Or Operatörü ile burçdaki farklı gün ve ay aralıklarını kontrol ediyoruz...
            burc = "Koc Burcusunuz...";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            burc = "Boga Burcusunuz...";
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            burc = "Ikizler Burcusunuz...";
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            burc = "Yengec Burcusunuz...";
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            burc = "Aslan Burcusunuz...";
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            burc = "Basak Burcusunuz...";
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            burc = "Terazi Burcusunuz...";
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            burc = "Akrep Burcusunuz....";
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            burc = "Yay Burcusunuz...";
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            burc = "Oglak Burcusunuz...";
        } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            burc = "Kova Burcusunuz...";
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            burc = "Balik Burcusunuz...";
        } else {
            burc = "Gecersiz bir zaman araligi girdiniz....";
        }

        System.out.println(burc);

        getData.close();
        
        
        
        
        
        
        
    }
    
}
