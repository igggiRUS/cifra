package hw03;

import java.util.Scanner;
/**
 * Задание 3
Написать программу, которая предлагает пользователю
выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
ответ показывает, какие звуки издает выбранное животное.
В списке должно быть не менее 10 животных.
 * @author misha
 *
 */

public class task03 {
public static void main(String[] args) {
    System.out.println("Животное: ");
    Scanner str = new Scanner(System.in);
    String animals = str.nextLine();
    str.close();

    String cow = "Корова";
    String horse = "Лошадка";
    String pig = "Свинья";
    String rooster = "Петух";
    String chicken = "Курица";
    String duck = "Утка";
    String goat = "Коза";
    String dog = "Собака";
    String cat = "Кошка";
    String rat = "Крыса";
    String parrot = "Попугай";

    if (animals.equals(cow)) {
        System.out.println("Мууууу");
    } else if (animals.equals(horse)) {
        System.out.println("Игого");
    } else if (animals.equals(pig)) {
        System.out.println("Хрю");
    } else if (animals.equals(rooster)) {
        System.out.println("Кукареку");
    } else if (animals.equals(chicken)) {
        System.out.println("Кококо");
    } else if (animals.equals(duck)) {
        System.out.println("Кря");
    } else if (animals.equals(goat)) {
        System.out.println("Бееее");
    } else if (animals.equals(rat)) {
        System.out.println("Пи-пи-пи");
    } else if (animals.equals(cat)) {
        System.out.println("Мяу");
    } else if (animals.equals(dog)) {
        System.out.println("Гаф");
    } else if (animals.equals(parrot)) {
        System.out.println("Иваныч опять пьян");
    } else {
        System.out.println("Нет такого животного");
    }
}
}