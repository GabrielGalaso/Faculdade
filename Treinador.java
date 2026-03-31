package exercicios.ProjetoAcademia;

public class Treinador extends Pessoa{
    private String cref;
    private double salario;

    //Construtor
    public Treinador(String nome, int idade, String sexo, String cref, double salario) {
        super(nome, idade, sexo);
        this.cref = cref;
        this.salario = salario;
    }

    //Getters e Setters
    public String getCref() {
        return cref;
    }
    
    public void setCref(String cref) {
        this.cref = cref;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void detalhes() {
        System.out.println("---------- DADOS DO TREINADOR ----------");
        System.out.println("Nome: " + this.getNome() + "\n" +
                        "Idade: " + this.getIdade() + "\n" + 
                        "Sexo: " + this.getSexo() + "\n" + 
                        "Número da matrícula: " + this.getCref() + "\n" +
                        "Mensalidade ta em dia? " + this.getSalario());
    }

    
}
