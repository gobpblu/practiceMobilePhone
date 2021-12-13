package com.company;

import java.util.Scanner;

public class SimCard {
    private String name;
    //BALANS
    //CODE
    // CALLPRICE
    // SMSPRICE
    // INTERNETPRICE

    public SimCard(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void callTo(int callToNum) {

        System.out.println("Вы звоните на номер " + callToNum);
        System.out.print("Стоимость звонка: ");
        switch (name) {
            case "O!":
                if (callToNum == 0700 || callToNum == 0701) System.out.println(0);
                else System.out.println(0.95);
                break;
            case "Beeline":
                if (callToNum == 0771 || callToNum == 0772) System.out.println(0);
                else System.out.println(1);
                break;
            case "Megacom":
                if (callToNum == 0550 || callToNum == 0555) System.out.println(0);
                else System.out.println(1.05);
                break;
        }
    }

    public void messageTo (int callToNum){
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы пишете на номер " + callToNum);
        System.out.print("Стоимость смс: ");
        switch (name) {
            case "O!":
                if (callToNum == 0700 || callToNum == 0701) System.out.println(0);
                else System.out.println(2);
                break;
            case "Beeline":
                if (callToNum == 0771 || callToNum == 0772) System.out.println(0);
                else System.out.println(1.2);
                break;
            case "Megacom":
                if (callToNum == 0550 || callToNum == 0555) System.out.println(0);
                else System.out.println(1.7);
                break;
        }
        System.out.print("Ваше сообщение: ");
        scan.nextLine();
        System.out.println("Ваше сообщение отправлено!");
    }

    public void internetUse() {
        System.out.println("Вы пользуетесь интернетом.");
        System.out.print("Стоимость 1 ГБ: ");
        switch (name) {
            case "O!":
                System.out.println(30);
                break;
            case "Beeline":
                System.out.println(30);
                break;
            case "Megacom":
                System.out.println(40);
                break;
        }
    }
}
