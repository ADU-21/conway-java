package tw.conways.game.of.life.service;

import tw.conways.game.of.life.domain.Cell;
import tw.conways.game.of.life.domain.Grid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class GridFactory {
    public static Grid load(String fileName) {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            String[] rows = stream.parallel().map(String::new)
                    .toArray(String[]::new);
            Cell[] initialGrid[] = new Cell[rows.length][];
            for (int line = 0; line < rows.length; line++) {
                Cell rowCell[] = new Cell[rows[line].length()];
                for (int index = 0; index < rows[line].length(); index++) {
                    rowCell[index] = new Cell(rows[line].charAt(index));
                }
                initialGrid[line] = rowCell;
            }
            return new Grid(initialGrid);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
