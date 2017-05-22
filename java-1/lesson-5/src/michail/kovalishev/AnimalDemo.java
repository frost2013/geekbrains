package michail.kovalishev;

public class AnimalDemo {
    public static void main(String[] args) {
        int speed = 13;
        int sweam = 150;
        double jump = 1.2;

        Cat cat1 = new Cat();
        Cat cat2 = new Cat(13, 140, 2.1);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(8, 100, 0.9);

        Horse horse1 = new Horse();
        Horse horse2 = new Horse(20, 140, 0.7);

        System.out.println("Могут ли животные бежать со скоростью " + speed + " км/ч");
        System.out.println("(" + cat1.maxRunSpeed + ") Кошка 1 - " + (cat1.run(speed) ? "Да" : "Нет"));
        System.out.println("(" + cat2.maxRunSpeed + ") Кошка 2 - " + (cat2.run(speed) ? "Да" : "Нет"));

        System.out.println("(" + dog1.maxRunSpeed + ") Собака 1 - " + (dog1.run(speed) ? "Да" : "Нет"));
        System.out.println("(" + dog2.maxRunSpeed + ") Собака 2 - " + (dog2.run(speed) ? "Да" : "Нет"));

        System.out.println("(" + horse1.maxRunSpeed + ") Лошадь 1 - " + (horse1.run(speed) ? "Да" : "Нет"));
        System.out.println("(" + horse2.maxRunSpeed + ") Лошадь 2 - " + (horse2.run(speed) ? "Да" : "Нет"));
        System.out.println("");

        System.out.println("Могу ли животные проплыть " + sweam + " м.");
        System.out.println("(" + cat1.maxSweamPath + ") Кошка 1 - " + (cat1.sweam(sweam) ? "Да" : "Нет"));
        System.out.println("(" + cat2.maxSweamPath + ") Кошка 2 - " + (cat2.sweam(sweam) ? "Да" : "Нет"));

        System.out.println("(" + dog1.maxSweamPath + ") Собака 1 - " + (dog1.sweam(sweam) ? "Да" : "Нет"));
        System.out.println("(" + dog2.maxSweamPath + ") Собака 2 - " + (dog2.sweam(sweam) ? "Да" : "Нет"));

        System.out.println("(" + horse1.maxSweamPath + ") Лошадь 1 - " + (horse1.sweam(sweam) ? "Да" : "Нет"));
        System.out.println("(" + horse2.maxSweamPath + ") Лошадь 2 - " + (horse2.sweam(sweam) ? "Да" : "Нет"));
        System.out.println("");

        System.out.println("Могу ли животные прыгнуть на " + jump + " м.");
        System.out.println("(" + cat1.maxJumpHeight + ") Кошка 1 - " + (cat1.jump(jump) ? "Да" : "Нет"));
        System.out.println("(" + cat2.maxJumpHeight + ") Кошка 2 - " + (cat2.jump(jump) ? "Да" : "Нет"));

        System.out.println("(" + dog1.maxJumpHeight + ") Собака 1 - " + (dog1.jump(jump) ? "Да" : "Нет"));
        System.out.println("(" + dog2.maxJumpHeight + ") Собака 2 - " + (dog2.jump(jump) ? "Да" : "Нет"));

        System.out.println("(" + horse1.maxJumpHeight + ") Лошадь 1 - " + (horse1.jump(jump) ? "Да" : "Нет"));
        System.out.println("(" + horse2.maxJumpHeight + ") Лошадь 2 - " + (horse2.jump(jump) ? "Да" : "Нет"));
    }
}
