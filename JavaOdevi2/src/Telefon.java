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
public class Telefon extends denem1{
    JavaOdevi2 Secim = new JavaOdevi2(31);
    JavaOdevi2 Secim2 = new JavaOdevi2(8);
    int temp=0;
    int sayac = 0;
    int [] TelNo =new int [7];
    int [] AlanKod = {552, 553, 554, 555, 559,501, 505, 506, 507, 551,530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 561,540, 541, 542, 543, 544, 545, 546, 547, 548, 549};
    public void numara(){
        for(int i = 0;i < 31;i++){
            temp = Secim.nextInt();
            AlanKod[i] = AlanKod[temp];
        }
        for(int j = 0;j<1;j++){
            System.out.print(AlanKod[j]);
            
        }
        for(int i = 0;i<7;i++){
           temp = Secim2.nextInt()+1;
           TelNo[i]=temp;
           System.out.print(TelNo[i]);
        }
        
    }
}
