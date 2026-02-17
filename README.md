# JavaAssignment2

Below is a **clean, final, GitHub-ready `README.md`** for the **best combined version** of your Vehicle program.
No emojis, no filler, no meta text. You can paste this directly into GitHub.

---

# Vehicle Management System (Java – Command Line)

## Overview

This project is a **menu-driven Vehicle Management System** developed using **Java**.
It allows users to store vehicle details, calculate mileage based on distance and fuel consumption, display vehicle information, and compute the average mileage of all vehicles.

The application follows **object-oriented programming principles** and is designed for beginners to understand class design, encapsulation, arrays of objects, and user interaction through the command line.

---

## Features

* Add multiple vehicles
* Store vehicle details such as brand, model, manufacturing year, and engine capacity
* Calculate mileage using distance travelled and fuel consumed
* Display details of all vehicles
* Calculate and display average mileage
* Menu-driven interface for repeated operations

---

## Project Structure

### Vehicle Class

The `Vehicle` class represents a vehicle entity and contains the following:

**Data Members**

* `brand` – vehicle brand
* `model` – vehicle model
* `year` – manufacturing year
* `engineCapacity` – engine capacity in cc
* `mileage` – fuel efficiency in km/l

**Methods**

* `calculateMileage(double distance, double fuel)` – calculates mileage using the formula
  mileage = distance / fuel
* `getMileage()` – returns the calculated mileage
* `displayDetails()` – displays all vehicle details

---

### VehicleApp Class

The `VehicleApp` class contains the `main` method and controls program execution.

Responsibilities:

* Displays a menu to the user
* Accepts user input using the `Scanner` class
* Stores multiple `Vehicle` objects in an array
* Performs operations based on user choice
* Ensures smooth program flow using a loop

---

## Menu Options

1. Add Vehicle
2. Calculate Mileage
3. Display All Vehicles
4. Display Average Mileage
5. Exit

---

## How the Application Works

1. The user adds vehicle details.
2. The user selects a vehicle and enters distance travelled and fuel used.
3. Mileage is calculated in km/l.
4. Vehicle details can be displayed at any time.
5. The average mileage of all vehicles can be calculated.
6. The program continues until the user chooses to exit.

---

## How to Run the Program

### Prerequisites

* Java Development Kit (JDK) installed
* Terminal or Command Prompt

### Steps

1. Compile the program:

```
javac VehicleApp.java
```

2. Run the program:

```
java VehicleApp
```

3. Follow the on-screen menu instructions.

---

## Sample Output

```
MENU
1. Add Vehicle
2. Calculate Mileage
3. Display All Vehicles
4. Display Average Mileage
5. Exit

Enter choice: 1
Enter brand: Honda
Enter model: City
Enter manufacturing year: 2020
Enter engine capacity (cc): 1498
Vehicle added successfully.
```

---

## Concepts Used

* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Arrays of Objects
* Menu-driven programs
* Conditional statements
* Loops
* User input handling using Scanner

---

## Future Enhancements

* Input validation using exception handling
* Dynamic data structures instead of fixed-size arrays
* File handling to store vehicle data permanently
* Graphical user interface (GUI)
* Support for additional vehicle statistics

---

## License

This project is licensed under the MIT License.
You are free to use, modify, and distribute this software.

---

If you want, next I can:

1. Add JavaDoc comments
2. Convert this into a multi-file project
3. Prepare viva or lab explanations

Just tell me.
