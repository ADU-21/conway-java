package tw.conways.game.of.life;

import tw.conways.game.of.life.domain.Grid;
import tw.conways.game.of.life.service.GridFactory;

import static java.lang.Thread.sleep;

public class Game {

    public static final int MAX_REFRESH_TIMES = 100;
    public static final String INITAIL_GRID_FILE_NAME = "src/main/resources/initialGrid";
    public static final int INTERVAL_TIME = 1;

    public static void main(String[] args) {
        int refreshTimes = 0;
        Grid grid = GridFactory.load(INITAIL_GRID_FILE_NAME);
        while (refreshTimes < MAX_REFRESH_TIMES) {
            try {
                refreshTimes ++;
                grid.refresh().print();
                sleep(INTERVAL_TIME);
                System.out.flush();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
