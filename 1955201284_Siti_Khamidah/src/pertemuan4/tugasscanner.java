/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;
/**
 *
 * @author OWNER
 */
public class tugasscanner {


    public static void main(String[] args) {
        int rt, rw = 0;
        int NOrumah, NObaju, NOsandal= 0;
        
        System.out.println("rt anda berapa?");
        Scanner inputUser  = new Scanner(System.in);
        rt = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("rw anda berapa?");
        Scanner inputData = new Scanner(System.in);
        rw = Integer.parseInt(inputUser.nextLine());

        System.out.println("no rumah anda berapa?");
        Scanner Scanner = new Scanner(System.in); //<editor-fold defaultstate="collapsed" desc="comment">
        NOrumah = Integer.parseInt(inputUser.nextLine());
        
       System.out.println("no baju anda berapa?");
       Scanner //<editor-fold defaultstate="collapsed" desc="comment">
//</editor-fold>
  = new Scanner(System.in);
        NObaju = Integer.parseInt(inputUser.nextLine()); 
        
        System.out.println("no sandal anda berapa?");
        Scanner //<editor-fold defaultstate="collapsed" desc="comment">
            
//</editor-fold>
  = new Scanner(System.in);
        NOsandal = Integer.parseInt(inputUser.nextLine());
        
        //menampilkan nama
        System.out.println("rt : " +rt);
        System.out.println("rw : " + rw);
        System.out.println("no rumah : " + NOrumah);
        System.out.println("no baju : " + NObaju);
        System.out.println("no sandal : " + NOsandal);
        
          
    }
}
