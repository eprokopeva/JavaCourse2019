package com.company;
/*еуые*/
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// определяем рандомное число
        Random rand = new Random();
        int randomNumber = rand.nextInt(50);
        int interval = 5;
        int leftInterval = randomNumber-interval;
        int rightInterval = randomNumber+interval;

        System.out.println("Загаданное число " + randomNumber);

        Scanner myObj = new Scanner(System.in);
        boolean flag = true; //переменная для того, чтобы понять, когда остановить цикл

        while (flag) {
            System.out.println("Введите число от 0 до 50");
            Integer number = myObj.nextInt();

            if (number == randomNumber) {
                System.out.println("Успех");
                flag = false;
            }
             if (flag != false) {
                 if (number > rightInterval || number < leftInterval) {
                     System.out.println("Холодно");
                 } else {
                     System.out.println("Горячо");
                 }
             }

        }

    }
}
