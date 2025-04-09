public class Car {
    String model;
    String color;
    int year;

    //method to display car details
    public void displayDetails(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }

    //main method
    public static void main(String[] args) {
        Car car = new Car();

        car.model = "Toyota";
        car.color = "White";
        car.year = 2023;
        car.displayDetails();
    }
}
