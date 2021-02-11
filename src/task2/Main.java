package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {

            System.out.println("Введіть ім'я працівника: ");
            String name = input.next();
            System.out.println("Введіть посаду працівника: ");
            String position = input.next();
            System.out.println("Введіть рік початку роботи працівника: ");
            int year = 0;

            try {
                year = input.nextInt();
            } catch (Exception e) {
                System.out.println("Рік введено не у вірному форматі");
            }

            Worker worker = new Worker(name, position, year);
            workers.add(worker);
            System.out.println("------------------");

        }
        workers.sort(Comparator.comparing(Worker::getName));

        System.out.println("Введіть значення для порівняння досвіду працівника: ");
        int value = input.nextInt();

        for (Worker worker: workers) {
            if (2021 - worker.getYear() > value){
                System.out.println(worker.getName());
            } else {
                System.out.println("Не знайдено жодного працівнка, досвід роботи якого перевищує Вами введене значення!");
            }
        }
    }
}
