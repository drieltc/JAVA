package aula05poo;
public class ContaBanco {
    //Attributes
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Special Methods
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
        this.dono = "";
        this.numConta = "";
        this.tipo = "";
    }

    public String getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(String numConta){
        this.numConta = numConta;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    //Personal Methods
    public void abrirConta(String tipo, String dono, String numConta){
        this.setDono(dono);
        this.setNumConta(numConta);
        this.setStatus(true);
        if ("cc".equals(tipo)){
            this.setSaldo(this.getSaldo() + 50);
            this.setTipo(tipo);    
        } else if ("cp".equals(tipo)){
            this.setSaldo(this.getSaldo() + 150);
            this.setTipo(tipo);
        } else{
            System.out.println("ERRO!!! Tipo de conta inválido");
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println(String.format("ERRO!!! Ainda há dinheiro na conta. Faça um saque R$%.2f antes de fecha-la", this.saldo));
        } else if (this.getSaldo() < 0){
            System.out.println(String.format("ERRO!!! Existem pendências na conta. Faça um depósito de R$%.2f antes de fecha-la", this.saldo));
        }else{
            this.setStatus(false);
            System.out.println(String.format("Conta de número %s foi fechada", this.numConta));
        }
    }
    
    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println(String.format("Você depositou R$%.2f. Seu saldo agora é de R$ %.2f", valor, this.saldo));
        }else{
            System.out.println("ERRO!!! A conta não está aberta");
        }    
    }
    
    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println(String.format("Você sacou R$%.2f. Seu saldo agora é de R$ %.2f", valor, this.saldo));
            }else{
                System.out.println("ERRO!!! Saldo insuficiente");
            }
        }else{
            System.out.println("ERRO!!! A conta não está aberta");
        }    
    }
    
    public void pagarMensalidade(){
        if (this.getStatus()){
            float v = 0;
            if (this.tipo == "cc"){
                v = 12;
            }else if (this.tipo == "cp"){
                v = 20;
            }
            this.setSaldo(this.getSaldo() - v);
            System.out.println(String.format("Com o pagamento da mensalidade seu saldo é de R$%.2f", this.getSaldo()));
        }else{
            System.out.println("ERRO!!! A conta não está aberta");
        }
        
    }
    
    public void estadoAtual(){
        System.out.println("-----------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
