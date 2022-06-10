package dz;

import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private List<Car> carList;

    public Person() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCarList() {
        return carList;
    }
    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }


    public Car chooseTheCar(){
        Car chooseCar = new Car();
        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int i=1;
        System.out.println("Выберите машину из списка:");
        for (Car car:
             carList) {
            System.out.println(i+") mark: "+car.getMark()+" maxSpeed: "+car.getMaxSpeed());
            i++;
        }
        System.out.println("номер выбранной машины");
        i=scanner.nextInt();
        while (flag) {
            switch (i) {
                case (1):
                    chooseCar = carList.get(i - 1);
                    flag=false;
                    break;
                case (2):
                    chooseCar = carList.get(i - 1);
                    flag=false;
                    break;
                case (3):
                    chooseCar = carList.get(i - 1);
                    flag=false;
                    break;
                case (4):
                    chooseCar = carList.get(i - 1);
                    flag=false;
                    break;
                case (5):
                    chooseCar = carList.get(i - 1);
                    flag=false;
                    break;
                default:
                    System.out.println("введите другое число");
            }
        }
        return chooseCar;
  }
}
