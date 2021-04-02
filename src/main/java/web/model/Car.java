package web.model;

import org.springframework.context.annotation.Bean;


public class Car {
    private int series;
    private int id;
    private String model;

    public Car() {
    }

    public Car(int series, int id, String model) {
        this.series = series;
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
