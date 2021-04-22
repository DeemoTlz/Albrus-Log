package com.deemo.tlz;

import static org.junit.Assert.assertTrue;

import com.deemo.tlz.debug.Debug;
import com.deemo.tlz.error.Error;
import com.deemo.tlz.info.Info;
import com.deemo.tlz.other.Other;
import com.deemo.tlz.trace.Trace;
import com.deemo.tlz.warn.Warn;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void run() throws InterruptedException {
        // OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE、 ALL
        new Trace().run();
        Thread.sleep(2000);
        new Debug().run();
        Thread.sleep(2000);
        new Info().run();
        Thread.sleep(2000);
        new Warn().run();
        Thread.sleep(2000);
        new Error().run();
        Thread.sleep(2000);
        new Other().run();
    }

    @Test
    public void additivity() throws InterruptedException {
        // OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE、 ALL
        new Other().run();
    }
}
