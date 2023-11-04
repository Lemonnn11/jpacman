package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    /**
     * Test creating the board.
     */
    @Test
    void testBoard() {
        BasicSquare sq = new BasicSquare();
        Square[][] grid = {{sq}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
        assertThat(board.squareAt(0, 0)).isEqualTo(sq);
    }

    /**
     * Test creating the board with a null square.
     */
    @Test
    void testNullSquare() {
        Square[][] grid = {{null}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isFalse();
        assertThat(board.squareAt(0, 0)).isEqualTo(null);
        // Assert.assertEquals(null, board.squareAt(1, 0));
    }
}
