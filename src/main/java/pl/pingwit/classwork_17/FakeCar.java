package pl.pingwit.classwork_17;

import java.io.Serializable;

/**
 * @author Pavel Radkevich
 * @since 22.03.23
 */
public class FakeCar implements Serializable {

    private String brand;
    private String model;

    public FakeCar() {
    }

    public FakeCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "FakeCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
