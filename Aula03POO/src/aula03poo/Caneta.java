package aula03poo;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada == false){
            System.out.println("Rabiscou");
        }else{
            System.out.println("ERRO! Destampe antes de rabiscar");
        }
    }
    
    public void escrever(){
        if (this.tampada == false){
            System.out.println("Escreveu");
        }else{
            System.out.println("ERRO! Destampe antes de escrever");
        }
    }
     
    public void pintar(){
        if (this.tampada == false){
            System.out.println("Pintou");
        }else{
            System.out.println("ERRO! Destampe antes de pintar");
        }
    }
    
    private void tampar(){
        this.tampada = true;
    }
    
    private void destampar(){
        this.tampada = false;
    }
}
