package tw.conways.game.of.life.domain;

public class Cell {
    private boolean active;

    public Cell() {
    }

    public Cell(boolean active) {
        this.active = active;
    }

    public Cell(char cell) {
        this.active = cell == 'o';
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public char show() {
        return isActive() ? 'o' : '.';
    }

    public void die() {
        setActive(false);
    }

    public void live() {
        setActive(true);
    }
}
