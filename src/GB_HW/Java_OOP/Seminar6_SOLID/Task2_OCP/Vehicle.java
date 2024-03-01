package GB_HW.Java_OOP.Seminar6_SOLID.Task2_OCP;
/*2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }
​
        return 0.0;
    }
}
public class Vehicle {
    int maxSpeed;
    String type;
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }
}*/

// Решение: Создал абстрактный класс к неу наследуем потомков с переопределеными методами по вычеслению скорости
public abstract class Vehicle {
    int maxSpeed;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public abstract double calculateAllowedSpeed(Vehicle vehicle);
}