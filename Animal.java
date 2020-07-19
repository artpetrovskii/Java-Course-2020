package ru.geekbrains.java.lesson4;

class Animal {
    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();
    }
}

class Cat extends Animal {
    protected boolean swim;
    int jump;
    public Cat(String name, int run, boolean swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public void catInfo() {
        System.out.println("CatName: " + name + ". RunLimit: " + run+ " meters." + " Swim: " + swim + ". Jump: " +jump+ " meters.");
    }
}

class Dog extends Animal {
    public double jump;
    public int swim;
    public Dog(String name, int run, int swim, double jump ) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + ". RunLimit: " + run+ " meters." + " Swim: " + swim + ". Jump: " +jump+ " meters.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("CatsCategory");
        Cat cat = new Cat("Barsik", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Sharik", 500, 10, 0.5);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
    }
}
