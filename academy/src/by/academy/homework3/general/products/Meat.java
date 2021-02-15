package by.academy.homework3.general.products;

public class Meat extends Product {
    private String nameOfAnimal;
    private int weight;

    public Meat() {
        super();
    }

    public Meat(String name, Double price, String manufacture, Integer quantity, String nameOfAnimal, int weight) {
        super(name, price, manufacture, quantity);
        this.nameOfAnimal = nameOfAnimal;
        this.weight = weight;
    }

    @Override
    public double discount() {
        if (getQuantity() > 20) {
            return 0.9;
        } else {
            return 1;
        }
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Мясо{");
        sb.append("наименование - ").append(getName());
        sb.append(", цена - ").append(getPrice()).append("$");
        sb.append(", производитель - ").append(getManufacture());
        sb.append(", количество - ").append(getQuantity()).append(" шт.");
        sb.append(", мясо животного - ").append(nameOfAnimal);
        sb.append(", вес - ").append(weight).append(" гр.");
        sb.append('}');
        return sb.toString();
    }
}