package tw.conways.game.of.life.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GridTest {

    @Test
    public void ShouldShowEmptyGridWhenInputGridIsEmpty() {
        Cell deadCell = new Cell(false);
        Cell[][] initGrid = {{deadCell, deadCell, deadCell},
                {deadCell, deadCell, deadCell},
                {deadCell, deadCell, deadCell},};
        Cell[][] nextGrid = {{deadCell, deadCell, deadCell},
                {deadCell, deadCell, deadCell},
                {deadCell, deadCell, deadCell},};
        Grid grid = new Grid(initGrid);
        Cell[][] newGrid = grid.refresh();
        assertThat(newGrid, is(nextGrid));
    }
}