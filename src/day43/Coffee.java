package day43;

public class Coffee {
    private String type;
    private int caffeineLevel;
    private double price;
    // getters and setters here omitted
    // no arg constructor
    public Coffee(){
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }


    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }

    // 2 args constructor to set type and caffine level
    public Coffee(String type, int caffeineLevel,double price) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
//        if (price > 0) {
//            this.price = price;
//        } else {
//            this.price = 1;
//        }
        setPrice(price);



    }


}

// WAKE UP TASK TO CREATE 3 ARGS CONSTRUCTOR
// DO NOT LET THE PRICE GO BELOW 0
// IF IT's less than 0 make it 1$