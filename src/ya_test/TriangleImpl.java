/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ya_test;

/**
 *
 * @author polina
 */
public class TriangleImpl implements Rtriangle{
    int x1, y1,  x2,  y2, x3, y3;

    public TriangleImpl(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    
    
    @Override
    public int getApexX1() {
        return x1;
    }

    @Override
    public int getApexY1() {
        return y1;
    }

    @Override
    public int getApexX2() {
        return x2;
    }

    @Override
    public int getApexY2() {
        return y2;
    }
    
    @Override
    public int getApexX3() {
        return x3;
    }
    
    @Override
    public int getApexY3() {
        return y3;
    }
}
