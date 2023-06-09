public class Car {
    private int mileage;
    private String model;
    private String make;

    public Car(String Make, String Model, int Mileage) {
        make = Make;
        model = Model;
        mileage = Mileage;

    }

    public Car(String Make, String Model) {
        make = Make;
        model = Model;

    }

    public Car(String Make) {
        make = Make;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String toString() {
        return make + " " + model + " " + mileage;
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


        // This (the Implicit Parameter) part of the lab

        Car cr3 = new Car("Toyota", "RAV4", 5632);
        System.out.println(cr3.toString()); // For these two to work method toString() must be deleted since it is from part 6 of the lab
        cr3.getAddress();// For these two to work method toString() must be deleted since it is from part 6 of the lab
        /*
        The address is the same because when we call it with this. and when we call it through cr3.toString()
        we refer to the same object that is stored in the same place in memory therefore the address is the same/
         */


        //6. Overriding toString() (and equals())

        System.out.println();

        Car cr4 = new Car("Subaru", "Forester", 6523);

        System.out.println(cr4.toString());

        // 8. Constructors as Methods

        Car cr5 = new Car("Nissan");
        Car cr6 = new Car("Porsche", "911");
    }


    public void getAddress(){
        System.out.println(this.toString());
    }



}
