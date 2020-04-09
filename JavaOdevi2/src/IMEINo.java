import javaodevi2.JavaOdevi2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marsh
 */
public class IMEINo extends denem1{
    public void imei(){
        JavaOdevi2 random = new JavaOdevi2(17);
    int pos;
    int [] str = new int[15];
    int sum = 0;
    int final_digit = 0;
    int t = 0;
    int len_offset = 0;
    int len = 15;
    int issuer;
    String[] rbi = {"01","10","30","33","35","44","45","49","50","51","52","53","54","86","91","98","99"};//16
    int[] arr = new int [Integer.parseInt(rbi[random.nextInt()])];
    str[0] = arr[0];
    str[1] = arr[1];
    pos = 2;
    
    
    while(pos<len-1){
        str[pos++]=(random.nextInt()*10)%10;
    }
     len_offset = (len + 1) % 2;
    for (pos = 0; pos < len - 1; pos++) {
        if ((pos + len_offset) % 2>0) {
            t = str[pos] * 2;
            if (t > 9) {
                t -= 9;
            }
            sum += t;
        }
        else {
            sum += str[pos];
        }
    }
    final_digit = (10 - (sum % 10)) % 10;
    str[len - 1] = final_digit;
    }
}
