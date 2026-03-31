package exercicios.ProjetoAcademia;

public class Exercicio {
    private String nome;
    private int series;
    private int repeticoes;
    private double carga;

    //Métodos
    public void exibirexercicio(){
        System.out.println("Nome do exercicio: " + this.getNome() + "\n" +
                        "Series: " + this.getSeries() + "\n" + 
                        "Repeticoes: " + this.getRepeticoes() + "\n" +
                        "Carga: " + this.getCarga() + "KG");
    }
    
    //Construtor
     public Exercicio(String nome, int series, int repeticoes, double carga) {
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    public int getRepeticoes() {
        return repeticoes;
    }
    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }

    
}
