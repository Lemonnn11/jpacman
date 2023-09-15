package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class BoardTest {

    @Test
    void testBoard(){
        BasicSquare sq1 = new BasicSquare();
        BasicSquare sq2 = new BasicSquare();
        Square[][] grid = {{sq1}, {sq2}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
        assertThat(board.squareAt(0,0)).isEqualTo(sq1);
    }

    @Test
    void testNullSquare(){
        BasicSquare sq1 = new BasicSquare();
        Square[][] grid = {{sq1}, {null}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isFalse();
        assertThat(board.squareAt(1,0)).isEqualTo(null);
    }

}
