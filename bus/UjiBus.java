/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author MASTER 10
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini = new Bus();
        busMini.penumpang = 5;
        busMini.maxpenumpang = 5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang+5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang-2;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang+8;
    }
    
}
