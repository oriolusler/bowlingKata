package com.drpicox.bowlingKata;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    @Test
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
}
