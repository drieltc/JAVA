package aula07poo;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public void apresentar(){
        System.out.println("------------------");
        System.out.println("Chegou a hora!!!!!!!!");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com" + this.getIdade() + " anos e "+ this.getAltura() + "m ");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void status(){
        System.out.println("-----------------");
        System.out.println(this.getNome() + "é um peso " + this.getCategoria());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias() + " vezes");
        System.out.println("Perdeu: " + this.getDerrotas() + " vezes");
        System.out.println("Empatou: " + this.getEmpates() + " vezes");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    // Getter and Setter for nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter and Setter for nacionalidade
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    // Getter and Setter for idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter and Setter for altura
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Getter and Setter for peso
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }

    // Getter and Setter for categoria
    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria(float peso){
        String cat;
        if (peso < 52.2) {
            cat = "Inválido";
        } else if (peso <= 70.3) {
            cat = "Leve";
        } else if (peso <= 83.9) {
            cat = "Médio";
        } else if (peso <= 120.2) {
            cat = "Pesado";
        } else {
            cat = "Inválido";
        }
        this.categoria = cat;
    }

    // Getter and Setter for vitorias
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    // Getter and Setter for derrotas
    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    // Getter and Setter for empates
    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
