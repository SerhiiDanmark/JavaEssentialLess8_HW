package task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Price[] prices = new Price[2];

        Scanner input = new Scanner (System.in);

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Продукт: ");
            String name = input.next();
            System.out.println("Магазин: ");
            String shopName = input.next();
            System.out.println("Ціна: ");
            double price = 0;
            try {
                price = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Error");
            }
            System.out.println("----------------");

        prices[i] = new Price(name, shopName, price);
        }
        Arrays.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                int name = o1.getName().compareTo(o2.getName());

                return name;
            }
        });
            System.out.println(Arrays.toString(prices));

        System.out.println("Введіть назву магазину: ");
        String shopName = input.next();
        boolean shop = false;
        for (int i = 0; i < prices.length; i++) {
            String name = prices[i].shopName;

            if (shopName.equals(name)){
                System.out.println(prices[i].toString());
                shop = true;
            }
        }
        if (!shop) {
            throw new ShopNotFoundException ("Даного магазину не існує!");
        }
    }
}
