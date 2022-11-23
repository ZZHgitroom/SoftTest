package org.apache.commons.org.apache.commons.math3.distribution;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniformIntegerDistributionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void cumulativeProbability1() {
        assertEquals(0.00,new UniformIntegerDistribution(2,3).cumulativeProbability(3),0.01);
    }
    @Test
    public void cumulativeProbability2() {
        assertEquals(0.00,new UniformIntegerDistribution(2,3).cumulativeProbability(5),0.01);
    }
    @Test
    public void cumulativeProbability3() {
        assertEquals(-.50,new UniformIntegerDistribution(2,3).cumulativeProbability(0),0.01);
    }


}