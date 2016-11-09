/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i14020
 */
public class USD  extends MataUang{
    public double konversiIDR(double nominal){
        return nominal*11740.0000;
    }
    
    public double konversiJPY(double nominal){
        return nominal*103.8710;
    }
    
    public double konversiUSD(double nominal){
        return nominal;
    }
}
