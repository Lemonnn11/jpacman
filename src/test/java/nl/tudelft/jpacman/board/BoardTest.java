package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class BoardTest {

    @Test
    void testBoard(){
        BasicSquare sq = new BasicSquare();
        Square[][] grid = {{sq}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
        assertThat(board.squareAt(0,0)).isEqualTo(sq);
    }

    @Test
    void testNullSquare(){
        Square[][] grid = {{null}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isFalse();
        assertThat(board.squareAt(0,0)).isEqualTo(null);
//        Assert.assertEquals(null, board.squareAt(1, 0));
    }

}
