package Lesson_1;

public class Main {
    public static void main(String[] args) {
        JumpRunnable[] players = {
                new Human("Ivan", 2, 500),
                new Cat("Barsik", 4, 150),
                new Robot("Bender", 0, 3000),
                new Human("Petr", 2, 700),
                new Cat("Muezik", 3, 200),
        };

        ObstaclesJumpRunnable[] Obstacles = {
                new Treadmill(200),
                new Treadmill(450),
                new Wall(1)
        };

        for (ObstaclesJumpRunnable Obstacle : Obstacles) {
            System.out.println("Start obstacle");
            for (JumpRunnable player : players) {
                if (player.isInGame())
                    Obstacle.nextObstacle(player);
            }
            System.out.println();
        }

        int count = 0;
        for (JumpRunnable player : players) {
            if (player.isInGame())
                ++count;
        }

        System.out.println(count + " players reached the finish line!");

    }
}
