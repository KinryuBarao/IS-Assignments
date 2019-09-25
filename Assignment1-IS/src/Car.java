import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int engine_size;
    private int power;
    private int consumption;
    private String plate;
    private Owner owner;

    Car(Owner owner, int id, String brand, String model, int engine_size, int power, int consumption, String plate){
        this.owner = owner;
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine_size = engine_size;
        this.power = power;
    }

    public String toString(){
        String l = "";
        return l + id + brand + model + engine_size + power;
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @XmlElement
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @XmlElement
    public int getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(int engine_size) {
        this.engine_size = engine_size;
    }

    @XmlElement
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @XmlElement
    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    @XmlElement
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @XmlTransient
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
