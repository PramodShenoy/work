package laptopdb;

public class Laptop {
    private String name;
    private String brand;
    private String gpu;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getPrice() {
        return price;
    }

    public Laptop() {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", gpu='" + gpu + '\'' +
                ", price=" + price +
                '}';
    }
}