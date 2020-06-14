/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author OWNER
 */
public class TugasBufferedReader {

    private static String Status;
    private static String alamat;
    private static String ibu;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here       
        String nama = "";
        String status = "";
        String alamat = "";
        int rt = 0;
        int rw = 0;
        int NOSandal = 0;
        String ibu = "";
        String ayah = "";
         // object inputStrim 
       InputStreamReader isr = new InputStreamReader(System.in);
         // object buffredReader
       BufferedReader br  = new BufferedReader(isr);
               
         // mengisi variabel nama dengan bufferedReader
        System.out.println("siapa nama anda?");  
        nama = br.readLine();
        
        System.out.println("anda masih sendiri atau sudah memiliki pasangan?");   
        Status = br.readLine();
        
                
        System.out.println("anda tinggal dimana?");
        alamat = br.readLine();
        
        
        System.out.println("siapa nama ibu anda?");
        ibu = br.readLine();
        
        System.out.println("siapa nama ayah anda?");
        ayah = br.readLine();
        
        //menampilkan nama  
        System.out.println("nama" + nama );  
        System.out.println("status " + Status);
        System.out.println("anda tinggal di " + alamat);
        
        System.out.println("nama ibu anda adalah " + ibu); 
        System.out.println("nama ayah anda adalah " + ayah);
    }
}


