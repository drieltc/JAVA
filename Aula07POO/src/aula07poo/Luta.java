package aula07poo;

import java.util.Random;

public class Luta {
    
    //Attributes
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Public Methods
    public void lutar(){
        if (this.getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("======= RESULTADO DA LUTA======");
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: //Desafiante Ganhou
                    System.out.println(this.getDesafiante().getNome() + " é o vencedor");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2: //Desafiado Ganhou
                    System.out.println(this.getDesafiado().getNome() + " é o vencedor");
                    this.getDesafiante().perderLuta();
                    this.getDesafiado().ganharLuta();
                    break;
            }
            System.out.println("=======================");
        }
    }
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    
    //Special Methods
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
