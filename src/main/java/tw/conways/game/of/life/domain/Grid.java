package tw.conways.game.of.life.domain;

public class Grid {
    private String[][] currentGrid;

    public Grid(String[][] currentGrid) {
        this.currentGrid = currentGrid;
    }

    public String[][] refresh() {
        return this.currentGrid;
    }
}
