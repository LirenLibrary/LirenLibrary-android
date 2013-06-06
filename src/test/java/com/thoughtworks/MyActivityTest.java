package com.thoughtworks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {

    @Test
    public void should_HomeActivity_show_first() throws Exception {
        String appName = new HomeActivity().getString(R.string.app_name);
        assertEquals(appName, "LirenLibrary");
    }
}
