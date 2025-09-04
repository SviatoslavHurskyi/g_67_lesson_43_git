package dz43.task02;

import java.util.Objects;

public class Cat {

    private String color;
    private int age;
    private double weight;

    public Cat(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object inboundObject) {

        if (inboundObject == null){
            return false;
        }
        if (getClass() != inboundObject.getClass()){
          return false;
        }
        Cat anotherCat = (Cat) inboundObject;
        return age == anotherCat.age
                && Double.compare(weight, anotherCat.weight) == 0
                && Objects.equals(color, anotherCat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
