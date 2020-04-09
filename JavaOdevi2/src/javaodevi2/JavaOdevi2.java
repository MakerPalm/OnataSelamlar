
package javaodevi2;

/**
 *
 * @author marsh
 */

public class JavaOdevi2 {
    private int max;
    private int last; 
    
    public JavaOdevi2(int max){   
    this.max = max;
    last = (int)(System.currentTimeMillis() % max);   
}
public int nextInt(){
    
    last = (last * 32719 + 3) % 32749;
    return last % max;
}
}
