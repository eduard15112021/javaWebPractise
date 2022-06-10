package dz;

import java.util.Scanner;

public class Car {
    private String mark;
    private int maxSpeed;
    private boolean isRun = false;

    public Car() {
    }

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void StartCar(Car car) {
        if (!car.isRun) {
            car.isRun = true;
            System.out.println("машина: " + car.mark + " завелась");
        } else {
            System.out.println("машина: " + car.mark + " уже заведена");
        }
    }

    public void gasPedal (Car car){
        Scanner scanner = new Scanner(System.in);
        System.out.println("какую скорость хотите развить? ");
        int speed = scanner.nextInt();
        if (car.isRun) {
            if (car.maxSpeed < speed) {
                System.out.println("ваше авто: " + car.mark + " не может разогнаться до такой скорости");
            } else {
                System.out.println("ваше авто: " + car.mark + " сейчас едет со скоростью " + speed);
            }
        }else {
            System.out.println("сперва заведите машину!");
        }
    }
}
