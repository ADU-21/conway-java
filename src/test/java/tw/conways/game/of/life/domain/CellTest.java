package tw.conways.game.of.life.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void ShouldShowPointWhenInactive() {
        Cell cell = new Cell();
        cell.inactive();
        assertEquals(".", cell.show());
    }

    @Test
    public void ShouldShowOWhenActive() {
        Cell cell = new Cell();
        cell.active();
        assertEquals("o", cell.show());
    }
}