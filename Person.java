package umubyeyi;

public class Person {


String name;
int age;
String city;
double height;


static int totalPeople = 0;


public void displayInfo() {
    System.out.println("=== Person Information ===");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("City: " + city);
    System.out.println("Height: " + height + " m");
    System.out.println();
}


public void setHeight(double h) {
    double oldHeight = height; // local variable
    height = h;
    System.out.println("Height changed from " + oldHeight + " to " + height + " m");
}


public void haveBirthday() {
    age++;
    System.out.println(name + " had a birthday! Now " + age + " years old.");
}


public static void showTotalPeople() {
    System.out.println("Total people created: " + totalPeople);
}
}

