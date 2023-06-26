package aula11pooheranca;
public class Aula11POOHeranca {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Informatica");
        a1.setMatricula("1111");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Adriel");
        b1.setIdade(21);
        b1.setSexo("M");
        b1.setCurso("BTI");
        b1.setMatricula("2023006725");
        b1.setBolsa(2000);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
