public class Main {

    static boolean asalMi(int sayi) {
        int sayac = 0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        if(asalMi(6)) { // asalMi(sayi) == true
            System.out.println("Girilen sayi asal bir sayidir.");
        }
        else {
            System.out.println("Girilen sayi asal bir sayi degildir.");
        }
    }
}
