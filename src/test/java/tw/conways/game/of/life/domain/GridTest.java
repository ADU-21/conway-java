package tw.conways.game.of.life.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GridTest {

    @Test
    public void ShouldShowEmptyGridWhenInputGridIsEmpty() {
        String[][] initGrid = {{".", ".", "."},
                {".", ".", "."},
                {".", ".", "."},};
        String[][] nextGrid = {{".", ".", "."},
                {".", ".", "."},
                {".", ".", "."},};
        Grid grid = new Grid(initGrid);
        String[][] newGrid = grid.refresh();
        assertThat(newGrid, is(nextGrid));
    }
}