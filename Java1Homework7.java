/**
 * Java 1 Homework 7
 *
 * @authors Sergey Leschenko
 * @version dated Jul 30, 2018
 */

import java.util.Scanner;

public class Java1Homework7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int number = 4;
        Cat cat[] = new Cat[number];
        cat[0]= new Cat("Barsik", 20,false);
        cat[1]= new Cat("Murzik", 30,false);
        cat[2]= new Cat("Mony", 30,false);
        cat[3]= new Cat("Chizik", 25,false);
        Plate plate = new Plate(100);
        plate.info();
        int i = 0;
        while(i < number) {
            int add = scanner.nextInt();
            plate.addfood(add);
            cat[i].eat(plate);
            plate.info();
            i++;
        }
    }
}

class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(food >= n){food -= n; return true;}
        else{return false;}
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addfood(int add) {
        food += add;
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite,boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p) {
        System.out.println(name + "(" + appetite + ") - " + p.decreaseFood(appetite));
    }
}
