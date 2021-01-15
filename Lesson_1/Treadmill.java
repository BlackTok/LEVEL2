package Lesson_1;

public class Treadmill implements ObstaclesJumpRunnable {
    private int size;

    public Treadmill(int size) {
        this.size = size;
    }

    public void nextObstacle(JumpRunnable r) {
        r.run(this.size);
    };
}
