package aula04poo;
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){
        this.setTampada(true);
        this.setCor(c);
        this.setPonta(p);
        this.setModelo(m);
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
}
