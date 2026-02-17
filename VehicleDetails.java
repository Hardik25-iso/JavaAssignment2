import java.util.Scanner;

class Vehicle {

    private String brand;
    private String model;
    private int year;
    private double engineCapacity;
    private double mileage;   // km per litre

    Vehicle(String brand, String model, int year, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.mileage = 0;
    }

    void calculateMileage(double distance, double fuel) {
        if (fuel > 0) {
            mileage = distance / fuel;
        } else {
            mileage = 0;
        }
    }

    double getMileage() {
        return mileage;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

public class VehicleDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Calculate Mileage");
            System.out.println("3. Display All Vehicles");
            System.out.println("4. Display Average Mileage");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count == vehicles.length) {
                        System.out.println("Vehicle list is full.");
                        break;
                    }

                    System.out.print("Enter brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter model: ");
                    String model = sc.nextLine();

                    System.out.print("Enter manufacturing year: ");
                    int year = sc.nextInt();

                    System.out.print("Enter engine capacity (cc): ");
                    double cc = sc.nextDouble();
                    sc.nextLine();

                    vehicles[count] = new Vehicle(brand, model, year, cc);
                    count++;

                    System.out.println("Vehicle added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No vehicles available.");
                        break;
                    }

                    System.out.print("Enter vehicle number (1 to " + count + "): ");
                    int num = sc.nextInt();

                    System.out.print("Enter distance travelled (km): ");
                    double distance = sc.nextDouble();

                    System.out.print("Enter fuel used (litres): ");
                    double fuel = sc.nextDouble();

                    vehicles[num - 1].calculateMileage(distance, fuel);
                    System.out.println("Mileage calculated successfully.");
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No vehicles to display.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nVehicle " + (i + 1));
                            vehicles[i].displayDetails();
                        }
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No vehicles available.");
                        break;
                    }

                    double totalMileage = 0;
                    for (int i = 0; i < count; i++) {
                        totalMileage += vehicles[i].getMileage();
                    }

                    System.out.println("Average Mileage: " + (totalMileage / count) + " km/l");
                    break;

                case 5:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
