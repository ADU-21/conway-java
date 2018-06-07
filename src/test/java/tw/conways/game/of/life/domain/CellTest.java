package tw.conways.game.of.life.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void ShouldShowPointWhenInactive() {
        Cell cell = new Cell();
        cell.die();
        assertEquals('.', cell.show());
    }

    @Test
    public void ShouldShowOWhenActive() {
        Cell cell = new Cell();
        cell.live();
        assertEquals('o', cell.show());
    }
}