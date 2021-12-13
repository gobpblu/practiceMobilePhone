package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num;
            SimCard[] simCards = new SimCard[2];
            simCards[0] = new SimCard("O!");
            simCards[1] = new SimCard("Megacom");
            MobilePhone mobilePhone = new MobilePhone("Redmi Note 4X", "Black", simCards);
            do {
                System.out.println("Нажмите на одну из цифр, чтобы выполнить действия:\n" +
                        "0 - выключить телефон. \n" +
                        "1 - позвонить. \n" +
                        "2 - отправить сообщение. \n" +
                        //Добавить ввести номер
                        "3 - использовать интернет. \n");
                num = scan.nextInt();
                switch(num) {
                    case 0:
                        System.out.println("Завершение программы!");
                        break;
                    case 1:
                        simCards[0].callTo(550);
                        break;
                    case 2:
                        simCards[0].messageTo(550);
                        break;
                    case 3:
                        simCards[0].internetUse();
                        break;
                    default:
                        System.out.println("Вы ввели неправильную команду");
                        break;
                }
            } while(num != 0);
        }
}
