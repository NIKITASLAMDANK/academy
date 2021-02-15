package by.academy.homework3.general.products;

public abstract class Product {
    private String name;
    private Double price;
    private String manufacture;
    private Integer quantity;

    public Product() {
        super();
    }

    public Product(String name, Double price, String manufacture, Integer quantity) {
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.quantity = quantity;
    }

    public double calcFinalPrice() {
        return quantity * price * discount();
    }

    public abstract double discount();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", manufacture='").append(manufacture).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();

    }
}