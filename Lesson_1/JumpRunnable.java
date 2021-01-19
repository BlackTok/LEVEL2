package Lesson_1;

public interface JumpRunnable extends Jumpable, Runable {
    boolean isInGame();
    void setInGame(boolean inGame);
}
