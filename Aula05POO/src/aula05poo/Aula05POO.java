package aula05poo;
public class Aula05POO {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("cc", "Jubileu", "1111-2");
        p1.depositar(300);
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("cp", "Creuza", "1111-3");
        p2.depositar(500);
        p2.sacar(1000);
        p2.estadoAtual();
        
        p1.fecharConta();
        p1.sacar(350);
        p1.fecharConta();
    }
}
