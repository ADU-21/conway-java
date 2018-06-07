package tw.conways.game.of.life.domain;

public class Cell {
    private boolean active;

    Cell() {
    }

    private boolean isActive() {
        return active;
    }

    private void setActive(boolean active) {
        this.active = active;
    }

    String show() {
        return isActive() ? "o" : ".";
    }

    void die() {
        setActive(false);
    }

    void live() {
        setActive(true);
    }
}
