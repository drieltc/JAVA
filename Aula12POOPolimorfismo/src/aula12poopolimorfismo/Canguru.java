package aula12poopolimorfismo;
public class Canguru extends Mamifero{
    
    public void usarBolsa(){
        System.out.println("Bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
