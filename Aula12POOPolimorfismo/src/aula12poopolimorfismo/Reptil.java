package aula12poopolimorfismo;
public class Reptil extends Animal{
    private String corEscama;
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("COmenfo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de réptil");
    }
    
}
