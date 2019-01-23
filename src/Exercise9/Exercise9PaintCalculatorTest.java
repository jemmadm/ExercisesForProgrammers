package Exercise9;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Exercise9PaintCalculatorTest {

    private Exercise9PaintCalculator exercise9PaintCalculator;

    @Before
    public void setup() {
        exercise9PaintCalculator = new Exercise9PaintCalculator();
    }

    @Test

    public void noValueForWidth() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(0, 3)).isEqualTo("0 gallons of paint needed");
    }

    @Test
    public void noValueForLength() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(5, 0)).isEqualTo("0 gallons of paint needed");
    }

    @Test
    public void noValues() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(0, 0)).isEqualTo("0 gallons of paint needed");
    }

    @Test
    public void valuesOf1() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(1, 1)).isEqualTo("1 gallons of paint needed");
    }


    @Test
    public void areaIs350() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(350, 1)).isEqualTo("1 gallons of paint needed");
    }

    @Test
    public void areaIs700() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(350, 2)).isEqualTo("2 gallons of paint needed");
    }

    @Test
    public void areaIs360() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(60, 6)).isEqualTo("2 gallons of paint needed");
    }

    @Test
    public void areaIs750() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(375, 2)).isEqualTo("3 gallons of paint needed");
    }

    @Test
    public void width349Length1() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(349, 1)).isEqualTo("1 gallons of paint needed");
    }

    @Test
    public void width351Length1() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(351, 1)).isEqualTo("2 gallons of paint needed");
    }

    @Test
    public void width2264Length3() {
        assertThat(exercise9PaintCalculator.paintNeededForRectangularRoom(2263, 3)).isEqualTo("20 gallons of paint needed");
    }

    @Test
    public void roundRoomRadius0() {
        assertThat(exercise9PaintCalculator.paintNeededForRoundRoom(0)).isEqualTo("0");
    }

    @Test
    public void roundRoomRadius2() {
        assertThat(exercise9PaintCalculator.paintNeededForRoundRoom(2)).isEqualTo("13");
    }

    @Test
    public void roundRoomRadius5() {
        assertThat(exercise9PaintCalculator.paintNeededForRoundRoom(5)).isEqualTo("79");
    }
}