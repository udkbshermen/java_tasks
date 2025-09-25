//base class Vehicle with the following attributes
public class Vehicle {
    String make, model;
    int year;

    public static void main(String[] args) {
        //created instance of car with set values for it's attributes
        Car newCar = new Car("Toyota", "Camry", 2022, 4);
        newCar.displayDetails();
    }
}

//derived class Car with additional attribute
class Car extends Vehicle {

    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    //method that will print/display the details of the car including its attributes
    public void displayDetails(){
        System.out.println(
            "\nCar Details:" + 
            "\nMake: " + make +
            "\nModel: " + model +
            "\nYear: " + year +
            "\nNumber of Doors: " + numberOfDoors
        );
    }
}