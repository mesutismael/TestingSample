package com.oops.testingsample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by i24sm on 11/14/2016.
 */
public class MainActivityTest {
    @Test
    public void convertCelcius2Fahrenhiet() throws Exception {

        double input=100;
        double output;
        double expected=212;
        double delta= .1;

        MainActivity mainActivity= new MainActivity();
        output=mainActivity.convertCelcius2Fahrenhiet(input);

        assertEquals(expected,output,delta);
    }

    @Test
    public void convertFahrenhiet2Celcius() throws Exception {
        double input=212;
        double output;
        double expected=100;
        double delta= .1;

        MainActivity mainActivity= new MainActivity();
        output=mainActivity.convertFahrenhiet2Celcius(input);

        assertEquals(expected,output,delta);
    }

}