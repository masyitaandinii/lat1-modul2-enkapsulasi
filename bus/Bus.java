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
public class Bus {
    public int penumpang, maxpenumpang;
    
    
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        
        System.out.println("Penumpang seharusnya adalah = "+maxpenumpang);
    }
}
