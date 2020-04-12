
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
public class IMEINo extends denem1 {
        JavaOdevi2 random = new JavaOdevi2(18);
        JavaOdevi2 random2 = new JavaOdevi2(18);
        JavaOdevi2 random3 = new JavaOdevi2(10);
        JavaOdevi2 random4 = new JavaOdevi2(10);
        int pos;
        int[] str;
        int sum = 0;
        int final_digit = 0;
        int t = 0;
        int len_offset = 0;
        int len = 15;
        int issuer;
    public void imei() {
    
        
        str = new int[15];
        
        int[] rbi = {01, 10, 30, 33, 35, 44, 45, 49, 50, 51, 52, 53, 54, 86, 91, 98, 99};//
        int arr = rbi[random.nextInt()];
        str[0] = rbi[random.nextInt()%10];
        str[1] = rbi[random2.nextInt()%10];
        
        for (int pos = 2; pos < len-1; pos++) {
            str[pos] = random.nextInt()%10;
        }
        len_offset = (len + 1) % 2;

        for (pos = 2; pos < len - 1; pos++) {
            if ((pos + len_offset) % 2 == 1) {
                t = str[pos] * 2;
                if (t > 9) {
                    t -= 9;
                }
                sum += t;
            } else {
                sum += str[pos];
            }
        }
        final_digit = (10 - (sum % 10)) % 10;
        str[len - 1] = final_digit;

        for (int i = 0; i < str.length; i++) {
            str[i] = t++;
        }
        for (int i = 0; i < str.length - 1; i++) {
            System.out.print(str[i]);
        }
    }
}
