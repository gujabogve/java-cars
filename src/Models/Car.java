package Models;

public class Car implements Comparable<Car> {
    private String name, model, brand, plate, type, fuelType;
    private Double door, seat, gear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Double getDoor() {
        return door;
    }

    public void setDoor(Double door) {
        this.door = door;
    }

    public Double getSeat() {
        return seat;
    }

    public void setSeat(Double seat) {
        this.seat = seat;
    }

    public Double getGear() {
        return gear;
    }

    public void setGear(Double gear) {
        this.gear = gear;
    }


    public void print() {
        System.out.printf("name : %s, \n model :  %s ,\n brand %s ,\n plate %s,\n type %s,\n fuelType %s,\n door %s,\n seat %s,\n gear %s \n ##### \n ",
                getName(),
                getModel(),
                getBrand(),
                getPlate(),
                getType(),
                getFuelType(),
                getDoor(),
                getSeat(),
                getGear()
        );
    }

    @Override
    public int compareTo(Car car2) {
        return this.name.compareTo(car2.name);
    }
}
