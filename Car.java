public class Car {
    String brand;
    String type;
    int built;
    String color;
    double motorVolume;

    public Car (String brand, String type, int built,String color, double motorVolume) {
        this.brand = brand;
        this.type = type;
        this.built = built;
        this.color = color;
        this.motorVolume = motorVolume;
    }
        public void printDescriptionCar() {
            System.out.println("Deze " + brand + " " + type + " is " + color);
        }


    }



