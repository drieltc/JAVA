package aula12poopolimorfismo;
public class Aula12POOPolimorfismo {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
    }
}
