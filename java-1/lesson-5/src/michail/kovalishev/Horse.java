package michail.kovalishev;

public class Horse extends Animal {
    public Horse() {
        super(18, 300, 1.1);
    }

    public Horse(int runSpeed, int sweamPath, double jumpHeight) {
        super(runSpeed, sweamPath, jumpHeight);
    }
}
