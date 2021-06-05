package edu.escuelaing.stats;

import junit.framework.*;

public class TestStatistics extends TestCase{

    /**
     * Test that mean is calculated correctly
     */
    public void testMean1(){
        String path= "./Resources/Test/dataSet1.txt";
        Statistics.main(new String[]{path});
        assertEquals(550.6, Statistics.mean, 0.1);
    }

    /**
     * Test that mean is calculated correctly
     */
    public void testMean2(){
        String path= "./Resources/Test/dataSet2.txt";
        Statistics.main(new String[]{path});
        assertEquals(60.32, Statistics.mean, 0.1);
    }
     
    /**
     * Test that Standard Deviation is calculated correctly 
     */
    public void testStandardDeviation1(){
        String path= "./Resources/Test/dataSet1.txt";
        Statistics.main(new String[]{path});
        assertEquals(572.03, Statistics.stdarDeviation, 0.1);
    }

    /**
     * Test that Standard Deviation is calculated correctly 
     */
    public void testStandardDeviation2(){
        String path= "./Resources/Test/dataSet2.txt";
        Statistics.main(new String[]{path});
        assertEquals(62.26, Statistics.stdarDeviation, 0.1);
    }
}