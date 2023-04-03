import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int sicaklik = 20;
        String etkinlik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Girin :");
        sicaklik = input.nextInt();


        switch(sicaklik) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                etkinlik = "Kayak";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                etkinlik = "Sinema";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                etkinlik = "Piknik";
                break;
            default:
                etkinlik = "Yüzme";
                break;
        }
        System.out.println("Bugün için önerilen etkinlik: " + etkinlik);

    }
}