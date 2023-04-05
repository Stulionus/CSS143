public class Car {
    private int mileage;
    private String model;
    private String make ;

    public Car (String Make, String Model, int Mileage){
        make = Make;
        model = Model;
        mileage = Mileage;

    }
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getMileage(){
        return mileage;
    }


    public static void main(String[] args) {
        Car cr1 = new Car("Ford", "Focus", 15023);
        Car cr2 = new Car("Honda", "Accord", 47923);

        System.out.println("Car 1");
        System.out.println("Make: " + cr1.getMake());
        System.out.println("Model: " + cr1.getModel());
        System.out.println("Mileage: " + cr1.getMileage());

        System.out.println();

        System.out.println("Car 2");
        System.out.println("Make: " + cr2.getMake());
        System.out.println("Model: " + cr2.getModel());
        System.out.println("Mileage: " + cr2.getMileage());

    }
}
