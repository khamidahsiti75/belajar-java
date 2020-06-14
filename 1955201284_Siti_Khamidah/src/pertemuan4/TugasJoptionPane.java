/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
 
import javax.swing.JOptionPane;



/**
 *
 * @author OWNER
 */
public class TugasJoptionPane {
    public static void main(String[] args) {
      
        String tanya = JOptionPane.showInputDialog("Dimana Anda Belajar?");
        JOptionPane.showMessageDialog(null, "Anda Belajar di " + tanya);
        
        tanya = JOptionPane.showInputDialog("Dimana Anda makan?");
        JOptionPane.showMessageDialog(null, "Anda Makan di " + tanya);
        
        tanya = JOptionPane.showInputDialog(" Apa Hobi Anda?");
        JOptionPane.showMessageDialog(null,  "Hobi Anda adalah " + tanya);
        
        tanya = JOptionPane.showInputDialog("Apa  Pekerjaan Anda?");
       JOptionPane.showMessageDialog(null, "Anda Bekerja di " + tanya);
        
        tanya = JOptionPane.showInputDialog(" Apa Makanan Faforit  Anda?");
        JOptionPane.showMessageDialog(null, "Makanan Faforit Anda adalah " + tanya);
        }  
}