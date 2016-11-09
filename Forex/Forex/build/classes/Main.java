
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i14020
 */
public class Main {
    public static void main(String[] args) {
        MataUang mu;
        String mataUangAsal;
        //Double no;
        Double nominal;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Masukan mata uang asal: ");
        nominal = sc.nextDouble();
        mataUangAsal = sc.next();
        mu = getMataUang(mataUangAsal);
        
        System.out.println(String.format("%.4f", nominal)  + " " + mataUangAsal + " " + "dalam IDR = " +String.format("%.4f",mu.konversiIDR(nominal)));
        System.out.println(String.format("%.4f", nominal)  + " " + mataUangAsal + " " + "dalam JPY = " +String.format("%.4f",mu.konversiJPY(nominal)));
        System.out.println(String.format("%.4f", nominal)  + " " + mataUangAsal + " " + "dalam USD = " +String.format("%.4f",mu.konversiUSD(nominal))); 
        
        sc.close();
        
    }
    
    private static MataUang getMataUang(String mataUangAsal) {
        if (mataUangAsal.equals("USD")) {
            return new USD();
        }
        if (mataUangAsal.equals("IDR")) {
            return new IDR();
        }
        if(mataUangAsal.equals("JPY")){
            return new JPY();
        }
        else {
            return new MataUang();

        }
    }
}
