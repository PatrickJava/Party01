import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число дня недели:   ");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("Понедельник");
            } else if (a==2){
                System.out.println("Вторник");
            } else if (a==3){
                System.out.println("Среда");
            } else if (a==4){
                System.out.println("Четверг");
            } else if (a==5){
                System.out.println("Пятница");
            } else if (a==6){
                System.out.println("Суббота");
            } else if (a==7){
                System.out.println("Воскресенье");
            } else {
                System.out.println("Такого дня недели нет");
            }
        }
    }
}

