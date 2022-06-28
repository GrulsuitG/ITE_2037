package polymorphism;

public class Product {
    private int price;
    private int bounsPoint;

    public Product(int price){
        this.price = price;
        bounsPoint = (int) (price/10.0);
    }

    public Product() {
        price = 0;
        bounsPoint = 0;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBounsPoint() {
        return bounsPoint;
    }

    public void setBounsPoint(int bounsPoint) {
        this.bounsPoint = bounsPoint;
    }
}
