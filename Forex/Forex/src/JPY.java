/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i14020
 */
public class JPY extends MataUang {
    public double konversiIDR(double nominal){
        return nominal*113.0238;
    }
    
    public double konversiJPY(double nominal){
        return nominal;
    }
    
    public double konversiUSD(double nominal){
        return nominal*0.0096;
    }
}
