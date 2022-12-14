public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
            this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
            this.model = model;
        if (productionYear <= 0) {
            productionYear = 2000;
        }
            this.productionYear = productionYear;
        if (productionCountry == null || productionCountry.isEmpty()) {
            productionCountry = "default";
        }
            this.productionCountry = productionCountry;
        if (color == null || color.isEmpty()) {
            color = "white";
        }
            this.color = color;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
            this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", year of production: " + productionYear + ", assembled in: " + productionCountry +
                ", body color: " + color + ", engine volume - " + engineVolume + " l.";
    }
}
