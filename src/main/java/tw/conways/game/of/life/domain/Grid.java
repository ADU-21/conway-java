package tw.conways.game.of.life.domain;

public class Grid {
    private Cell[][] currentGrid;

    public Cell[][] getCurrentGrid() {
        return currentGrid;
    }

    public void setCurrentGrid(Cell[][] currentGrid) {
        this.currentGrid = currentGrid;
    }

    public Grid(Cell[][] currentGrid) {
        this.currentGrid = currentGrid;
    }

    public Grid refresh() {
        return this;
    }
}
