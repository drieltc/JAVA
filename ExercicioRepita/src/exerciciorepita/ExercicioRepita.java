/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Adriel
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, qtd = 0, par = 0, impar = 0, aCem = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um Número <em>(valor 0 interrompe)</em></html>"));
            s += n;
            qtd++;
            if (n%2 == 0){
                par++;
            }else{
                impar++;
            }
            if (n >= 100) aCem++;
            
        } while (n != 0);
        qtd--;
        par--;
        
        float media = (float) s/qtd;
        JOptionPane.showMessageDialog(null,String.format("<html> Resultado final <br><hr><br> Soma %d <br> Quantidade %d <br> Pares foi %d <br> Ímpares %d <br> Acima de 100 %d <br> Media %.2f", s, qtd, par, impar, aCem, media));
    }
}
