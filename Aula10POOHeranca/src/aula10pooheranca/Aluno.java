package aula10pooheranca;
public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    
    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
