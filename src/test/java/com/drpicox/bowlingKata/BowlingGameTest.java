package com.drpicox.bowlingKata;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    private Game g;

    @Before
    public void setUp() {
        g = new Game();
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }
}
