/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ya_test;

import java.lang.reflect.Array;
import java.util.Random;
import ya_test.TriangleImpl;

public final class RtriangleProvider {
    
    private static final Random rand = new Random();
    private static final int limit = 15;
      
    private static float getLength (int x1, int y1, int x2, int y2) {
        return (float) Math.sqrt(Math.pow((y1-y2), 2)+Math.pow((x1-x2), 2));
    }
    
    public static Rtriangle getRtriangle() {     
        //generate coordinates
        int x1, y1,  x2,  y2, x3, y3;
        float l1,l2,l3;
        do { // make sure that no points are on the same line
            x1 = rand.nextInt(limit);
            y1 = rand.nextInt(limit);

            x2 = rand.nextInt(limit);
            y2 = rand.nextInt(limit);

            x3 = rand.nextInt(limit);
            y3 = rand.nextInt(limit);
            
            l1 = getLength(x1, y1, x2, y2);
            l2 = getLength(x3, y3, x1, y1);
            l3 = getLength(x2, y2, x1, y1);
        } while (!(l1 > l2 + l3) 
                && !(l2 > l3+l1) 
                && !(l3>l2+l1)
                && l1==0
                && l2==0
                && l3==0);
        return new TriangleImpl(x1, y1,  x2,  y2, x3, y3);
    }
    
    public static Rtriangle getRtriangle(int n) {   
        switch (n) {
            case 1:
                return new TriangleImpl(3,7,3,15,8,7);
            case 2:
                return new TriangleImpl(8,5,13,5,13,9);
            case 3:
                return new TriangleImpl(8,10,8,13,12,13);
            case 4:
                return new TriangleImpl(13,14,13,18,17,14);
                
        }
        //generate coordinates
        int x1, y1,  x2,  y2, x3, y3;
        do { // make sure that no points are on the same line
            x1 = rand.nextInt(limit);
            y1 = rand.nextInt(limit);

            x2 = rand.nextInt(limit);
            y2 = rand.nextInt(limit);

            x3 = rand.nextInt(limit);
            y3 = rand.nextInt(limit);
        } while (!((x2 - x1) * (y3 - y1) == (y2 - y1) * (x3 - x1)));
        return new TriangleImpl(x1, y1,  x2,  y2, x3, y3);
    }
}