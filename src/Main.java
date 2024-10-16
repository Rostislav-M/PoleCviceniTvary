import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
        char [][] pole1 = new char[3][3];
    int i;



        for ( i = 0; i < pole1.length; i++) {

            for (int j = 0; j < pole1[0].length; j++) {
                pole1[0][1]='X';

                System.out.print(pole1[i][j]);
            }System.out.println();

        }
    }
}



*/
        boolean opakuj = true;

        while (opakuj) {


        System.out.println("Zadej cislo ze seznamu:" +  "\n" +
                "1 - ŠIKMÁ ČÁRA"+ " " + "\n" +
                "2 - PRAVÁ POLOVINA PYRAMIDY" + "\n"+
                "3 - CELÁ PYRAMIDA" + "\n"+
                "4 - KOSOČTVEREC" + "\n"+
                "5 - ČTVEREC" + "\n"+
                "6 - PRAVY ROH TROJUHELNIKU HASTAG $");
        Scanner nacitac = new Scanner(System.in);;
        int vstup = nacitac.nextInt();


        switch (vstup) {
            case 1:
                vytisteniSikmaCara();
                break;
            case 2:
                vytisteniPravaPolovinaPyramidy();
                break;
            case 3:
                vytisteniCelePyramidy();
                break;
            case 4:
                vystisteniKosoctverce();
                break;
            case 5:
                vytisteniCtverce();
                break;
            case 6:
                pravyRohTrojuhelnik();
                break;
            default:
                System.out.println("Nezadal jsi číslo ze seznamu");
                break;
        }

            System.out.println("Chces pokracovat" + "\n" + "ano - 1" + "\n" + "ne - 0");
            int moznost= nacitac.nextInt();

            if (moznost == 0) {
                opakuj = false;
            }

       }

/*
        for(int d=2; d<3;d++){
            System.out.println("smycka se provede");


        }
        */



    }

    private static void pravyRohTrojuhelnik() {

        Scanner nacitac = new Scanner(System.in);
        System.out.println(" Format ctverce je 5x5 atd, tedy cislo x cislo, zadej prosim cislo:" );
        int nacitacCislo = nacitac.nextInt();



        while(nacitacCislo==1 || nacitacCislo==0){
            if (nacitacCislo==0){
                System.out.println("cislo nesmi byt 0, protoze 0x0 neni ctverec, zadej nove cislo");
                nacitacCislo = nacitac.nextInt();
            }
            if (nacitacCislo==1){
                System.out.println("cislo nesmi byt 1, protoze 1x1 neni ctverec, zadej nove cislo");
                nacitacCislo = nacitac.nextInt();
            }

        }

        for(int i=1;i<=nacitacCislo ;i++){
            for(int s=1;s<=i-1;s++){
                System.out.print("*  ");
            }
            for(int j=1;j<=((nacitacCislo +1)-i);j++){    //for(int i=1;i<=5;i++){
                System.out.print("$  ");
            }
            System.out.println();

        }

    }
    private static void vytisteniCtverce() {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=8;j++){
                if (i==1 || i==4 || j==1 || j==8){
                System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void vystisteniKosoctverce() {
        int u=2;

        for(int i=1;i<=3;i++){
            for(int s=1;s<=3-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2 -1;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i=1;i<=2;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+u;j++){
                System.out.print(i);
            }
            u=u-3;
            System.out.println();


        }


    }

    private static void vytisteniCelePyramidy() {
        for(int i=1;i<=3;i++){
            for(int s=1;s<=3-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2 -1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void vytisteniPravaPolovinaPyramidy() {
        for(int i=1;i<=3;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void vytisteniSikmaCara() {

        for (int i = 5; i >= 1; i--) {
            for (int s=1; s<=5-i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i-(i-1); j++) {

                System.out.print(i);//
            }

            System.out.println();
        }
    }

}


