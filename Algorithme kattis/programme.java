/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 * @author zelmad in 02/06/2017:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader clav=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str=new StringTokenizer(clav.readLine());
        while(true){
            int a=Integer.parseInt(str.nextToken());System.out.print(a);
            
            if(a==-1){
                break;
            }
            String chain=str.nextToken();
            String verify=str.nextToken();
            System.out.print(chain);
            System.out.print(verify);
            
        }
                
    }
    
}
