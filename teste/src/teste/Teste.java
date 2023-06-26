/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

/**
 *
 * @author Adriel
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println(String.format("%d %d %d",v0, v1, v2));
    }
    
}
