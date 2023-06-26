package aula09poo;
public class Livro implements Publicacao{
   private String titulo;
   private String autor;
   private int totPaginas;
   private int pagAtual;
   private boolean aberto;
   private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ",\n autor=" + autor + ",\n totPaginas=" + totPaginas + ",\n pagAtual=" + pagAtual + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + ",\n idade=" + leitor.getIdade() + ",\n sexo=" + leitor.getSexo() +'}';
    }
   
   public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setTotPaginas(totPaginas);
    this.setPagAtual(0);
    this.setAberto(false);
    this.setLeitor(leitor);
   }
   
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
   
   public String getTitulo(){
       return this.titulo;
   }
   
   public void setAutor(String autor){
       this.autor = autor;
   }
   
   public String getAutor(){
       return this.autor;
   }
   
   public void setTotPaginas(int totPaginas){
       this.totPaginas = totPaginas;
   }
   
   public int getTotPaginas(){
       return this.totPaginas;
   }
   
   public void setPagAtual(int pagAtual){
       this.pagAtual = pagAtual;
   }
   
   public int getPagAtual(){
       return this.pagAtual;
   }
   
   public void setAberto(boolean aberto){
       this.aberto = aberto;
   }
   
   public boolean getAberto(){
       return this.aberto;
   }
   
   public void setLeitor(Pessoa leitor){
       this.leitor = leitor;
   }
   
   public Pessoa getLeitor(){
       return this.leitor;
   }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.totPaginas < p){
            System.out.println("ERRO!!! O livro não tem tantas páginas. Indo para a última.");
        }
        this.setPagAtual(p);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
