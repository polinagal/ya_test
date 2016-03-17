/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author polina
 */
import org.junit.Before;  
import org.junit.Test;  
import ya_test.Rtriangle;
import ya_test.RtriangleProvider;
  
public class Testtriangle {  
    
    private Rtriangle triangle1,
                triangle2,
                triangle3;
    
    private long getSqLength (int x1, int y1, int x2, int y2) {
        return (long) (Math.pow((y1-y2), 2)+Math.pow((x1-x2), 2));
    }
    
    private boolean isRectTriangle (Rtriangle triangle) {
        int x1 = triangle.getApexX1();
        int y1 = triangle.getApexY1();
        int x2 = triangle.getApexX2();
        int y2 = triangle.getApexY2();
        int x3 = triangle.getApexX3();
        int y3 = triangle.getApexY3();
        
        long l1 = getSqLength(x1,y1, x2, y2);  //1-2
        long l2 = getSqLength(x3,y3, x2, y2);  //2-3
        long l3 = getSqLength(x1,y1, x3, y3);  //3-1
        System.out.println("Triangle coordinates:\n"
                + "1: (" + x1 + "; " + y1 + ")\n"
                + "2: (" + x2 + "; " + y2 + ")\n"
                + "3: (" + x3 + "; " + y3 + ")\n");
        System.out.println("l1 = " + l1 + ""
                + "\nl2 = " + l2 + ""
                + "\nl3 = " + l3 +"\n");
        //long max = Math.max(Math.max(l1, l2), l3);
        boolean pyth1 = (l1 == (l2 + l3));
        boolean pyth2 = (l2 == (l1 + l3));
        boolean pyth3 = (l3 == (l2 + l1));
        
        return ((pyth1 || pyth2 || pyth3) &&
                !(pyth1&&pyth2&&pyth3));
    }
  
    @Before  
    public void setUp() {  
        triangle1 = RtriangleProvider.getRtriangle(0);  
        triangle2 = RtriangleProvider.getRtriangle(5); 
        triangle3 = RtriangleProvider.getRtriangle(15); 
    }  
  
    @Test  
    public void test1() {  
        System.out.println("test1\n");
        assert(isRectTriangle(triangle1));
    }  
    
    @Test  
    public void test2() {  
        System.out.println("test2\n");
        assert(isRectTriangle(triangle2));
    }  
    
    @Test  
    public void test3() {
        System.out.println("test3\n");
        assert(isRectTriangle(triangle3));
    }  
    
}