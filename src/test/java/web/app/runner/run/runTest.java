package web.app.runner.run;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class runTest {

    @BeforeEach
    void setUp() {
        System.out.printf("Setup\n");
    }

    @AfterEach
    void tearDown() {
        System.out.printf("TearDown\n");
    }

    @Test
    void testToString() {
        run run = new run();
        String expected = "run{" +
                "id=0" +
                ", name='null'" +
                ", startTime=null" +
                ", endTime=null" +
                ", distance=0" +
                '}';
        assertEquals(expected, run.toString());
        System.out.printf("assertEquals: \"%s\"\n\"%s\"\n", expected, run);
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getStartTime() {
    }

    @Test
    void setStartTime() {
    }

    @Test
    void getEndTime() {
    }

    @Test
    void setEndTime() {
    }

    @Test
    void getDistance() {
    }

    @Test
    void setDistance() {
    }
}