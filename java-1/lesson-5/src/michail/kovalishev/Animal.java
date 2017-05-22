package michail.kovalishev;

public class Animal {
    public final int maxRunSpeed;
    public final int maxSweamPath;
    public final double maxJumpHeight;

    public Animal() {
        this(0, 0, 0);
    }

    public Animal(int runSpeed, int sweamPath, double jumpHeight) {
        this.maxRunSpeed = runSpeed;
        this.maxSweamPath = sweamPath;
        this.maxJumpHeight = jumpHeight;
    }

    public boolean run(int speed) {
        return this.maxRunSpeed >= speed;
    }

    public boolean sweam(int path) {
        return this.maxSweamPath >= path;
    }

    public boolean jump(double height) {
        return this.maxJumpHeight >= height;
    }
}
