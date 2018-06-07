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

    public void print() {
        for(int line = 0; line < this.currentGrid.length; line ++) {
            for (int numberOfCellPreLine = 0; numberOfCellPreLine < this.currentGrid[line].length; numberOfCellPreLine ++) {
                System.out.print(this.currentGrid[line][numberOfCellPreLine].show());
            }
            System.out.print("\n");
        }
    }
}
