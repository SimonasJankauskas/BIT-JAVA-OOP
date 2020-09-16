package lt.simonasjankauskas.app;

import java.util.Scanner;

public class Oop {
    public static void main(String[] args) {
        Cars carTypes = new Cars();
        carTypes.setCarName();
        carTypes.setCarYear();
        carTypes.setCarPrice();
        System.out.println("\nAutomobilio pavadinimas: " + carTypes.getCarName()
                        + "\nAutomobilio pagaminimo metai: " + carTypes.getCarYear() +"m"
                        + "\nAutomobilio kaina: " + carTypes.getCarPrice() + "eu");
    }
}
class Cars {
    private String carName;
    private int carYear;
    private double carPrice;
    Scanner keyboard = new Scanner(System.in);
    public Cars(String n, int y, double p) {
        this.carName = n;
        this.carYear = y;
        this.carPrice = p;
    }
    public Cars() {
    }
    public String getCarName() {
        return this.carName;
    }
    public void setCarName() {
        System.out.println("Įveskite automobilio pavadinimą: ");
        String carName = keyboard.nextLine();
        this.carName = carName;
    }
    public int getCarYear() {
        return this.carYear;
    }
    public void setCarYear() {
        System.out.println("Įveskite automobilio pagaminimo metus: ");
        int carYear = keyboard.nextInt();
        this.carYear = carYear;
    }
    public double getCarPrice() {
        return carPrice;
    }
    public void setCarPrice() {
        System.out.println("Įveskite automobilio kainą: ");
        double carPrice = keyboard.nextDouble();
        this.carPrice = carPrice;
    }
}

