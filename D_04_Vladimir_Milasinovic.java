package Domaci;

import java.util.Scanner;

public class DomaciCetiri {

    public static void main(String[] args) {
        //1. Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina), 30cm(Ispise: M Velicina),
        //36cm (ispise: L velicina), 42cm(ispise: XL velicina) u suprotnom izbaciti gresku o nepostojecoj velicini.
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti velicinu majice 24cm, 30cm, 36cm ili 42cm");
        int x = sc.nextInt();

        switch (x){
            case 24:
                System.out.println("Izabrali ste S velicinu");
                break;
            case 30:
                System.out.println("Izabrali ste M velicinu");
                break;
            case 36:
                System.out.println("Izabrali ste L velicinu");
                break;
            case 42:
                System.out.println("Izabrali ste XL velicinu");
                break;
            default:
                System.out.println("Nepostojeca velicina");
                break;
        }



    }
}
