package tw.conways.game.of.life.service;

import org.junit.Test;
import tw.conways.game.of.life.domain.Grid;

import static org.junit.Assert.assertEquals;

public class GridFactoryTest {

    @Test
    public void ShouldReturnGridWhenGivenString() {
        String fileName = "src/test/resources/initialGrid_empty";
        Grid grid = GridFactory.load(fileName);

        assertEquals(3, grid.getCurrentGrid().length);
        assertEquals(3, grid.getCurrentGrid()[0].length);
        assertEquals(false, grid.getCurrentGrid()[0][0].isActive());
    }
}