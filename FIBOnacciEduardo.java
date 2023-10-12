/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccieduardo;
import java.util.Scanner;

/**
 *
 * @author xmrba
 */
public class FIBOnacciEduardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner skeleeer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = skeleeer.nextInt();
        int n1 = 0;
        int n2 = 1;
        int next;
        
        for (int i = 0; i < num; i++){
        System.out.println(n1 + "");
        next = n1 + n2;
        n1 = n2;
        n2 = next;
        
       
    }
                
    }
    
}
