package task3;

public class Price {

    String name;
    String shopName;
    double price;

    public Price (String name, String shopName, double price){
        this.name = name;
        this.shopName = shopName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getShopName() {
        return shopName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Продукт: " + this.name + "; Магазин: " + this.shopName + "; Ціна: " + this.price;
    }
}

