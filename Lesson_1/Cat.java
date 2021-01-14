package Lesson_1;

public class Cat implements JumpRunnable {
    String name;
    private int jump, run;
    private boolean inGame = true;

    public Cat(String name, int jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public void jump(int size) {
        if (this.jump >= size) {
            System.out.println("Cat " + this.name + " jumped " + size + " meters!");
        } else {
            System.out.println("Cat " + this.name + " couldn't jump " + size + " meters!");
            this.setInGame(false);
        }
    }

    @Override
    public void run(int size) {
        if (this.run >= size) {
            System.out.println("Cat " + this.name + " ran " + size + " meters!");
        } else {
            System.out.println("Cat " + this.name + " couldn't run " + size + " meters!");
            this.setInGame(false);
        }
    }
}
