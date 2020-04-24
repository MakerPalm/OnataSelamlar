/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RASTGELEKISIURET;

/**
 *
 * @author marsh
 */
public class SimpleRandom {
    private int max;
    private int last; 
    
    public SimpleRandom(int max){   
    this.max = max;
    last = (int)(System.currentTimeMillis() % max);   
}
public int nextInt(){
    
    last = (last * 32719 + 3) % 32749;
    return last % max;
}
}
