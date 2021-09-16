public class Engine implements Comparable<Engine> {
    private double engineCapacity;
    private double price;
    private double fuelConsumptionPer100;


    public Engine(double engineCapacity, double price, double fuelConsumptionPer100) {
        this.engineCapacity = engineCapacity;
        this.price = price;
        this.fuelConsumptionPer100 = fuelConsumptionPer100;
    }

    @Override
    public int compareTo(Engine o) {
        int oPoints = 0;
        int points = 0;
        if (engineCapacity > o.getEngineCapacity()) {
            points++;
        } else if (engineCapacity < o.getEngineCapacity()) {
            oPoints++;
        }

        if (price > o.getPrice()) {
            oPoints++;
        } else if (price < o.getPrice()) {
            points++;
        }

        if (fuelConsumptionPer100 > o.getFuelConsumptionPer100()) {
            oPoints++;
        } else if (fuelConsumptionPer100 < o.getFuelConsumptionPer100()) {
            points++;
        }

        if (oPoints > points) {
            return -1;
        } else if (oPoints == points) {
            return 0;
        } else {
            return 1;
        }
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFuelConsumptionPer100() {
        return fuelConsumptionPer100;
    }

    public void setFuelConsumptionPer100(double fuelConsumptionPer100) {
        this.fuelConsumptionPer100 = fuelConsumptionPer100;
    }
}