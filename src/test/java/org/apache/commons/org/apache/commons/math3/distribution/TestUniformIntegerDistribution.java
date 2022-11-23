package org.apache.commons.org.apache.commons.math3.distribution;

import java.io.IOException;

public class TestUniformIntegerDistribution {
    public static void main(String args[]) throws IOException {
        UniformIntegerDistribution des = new UniformIntegerDistribution(2,3);
        double res = des.cumulativeProbability(3);
        if(res != 1.00){
            System.err.println("get incorrect 随机变量1");
        }
        res = des.cumulativeProbability(5);
        if(res != 1.00){
            System.err.println("get incorrect 随机变量2");
        }
        res = des.cumulativeProbability(0);
        if(res != 0.00){
            System.err.println("get incorrect 随机变量3");
        }
    }
}
