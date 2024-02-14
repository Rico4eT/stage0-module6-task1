package com.epam.mjc.stage0;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paw = " paws";
        String fur = " and a fur.";
        if (!hasFur)
            fur = " and no fur.";
        if (numberOfPaws == 1)
            paw = " paw";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + paw + fur;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
