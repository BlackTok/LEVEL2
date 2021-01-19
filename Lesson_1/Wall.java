package Lesson_1;

public class Wall implements ObstaclesJumpRunnable {
    private int size;

    public Wall(int size) {
        this.size = size;
    }

    public void nextObstacle(JumpRunnable r) {
        r.jump(this.size);
    };
}
