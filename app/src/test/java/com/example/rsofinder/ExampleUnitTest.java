package com.example.rsofinder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    App app;

    @Test
    public void toTest() {
        try {
           app = MainActivity.test();
        } catch(Exception e) {

        }

        Assert.assertEquals(app.RSO[0].email, "illinichessclub@hotmail.com");
    }

    @Test
    public void toTestTags() {
        String[] testTags = {"sport", "relaxed", "mental"};
        try {
            app = MainActivity.test();
        } catch(Exception e) {

        }
        Assert.assertArrayEquals(app.RSO[0].tags, testTags);
    }
}