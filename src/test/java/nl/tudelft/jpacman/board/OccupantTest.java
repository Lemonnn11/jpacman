package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        assertThat(unit.hasSquare()).isFalse();
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        Square target = new Square() {
            @Override
            public boolean isAccessibleTo(Unit unit) {
                return false;
            }

            @Override
            public Sprite getSprite() {
                return null;
            }
        };
        unit.occupy(target);
        assertThat(unit.hasSquare()).isTrue();
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        // Remove the following placeholder:
        Square target1 = new Square() {
            @Override
            public boolean isAccessibleTo(Unit unit) {
                return false;
            }

            @Override
            public Sprite getSprite() {
                return null;
            }
        };
        Square target2 = new Square() {
            @Override
            public boolean isAccessibleTo(Unit unit) {
                return false;
            }

            @Override
            public Sprite getSprite() {
                return null;
            }
        };
        unit.occupy(target1);
        unit.occupy(target2);
        assertThat(unit.hasSquare()).isTrue();
    }
}
