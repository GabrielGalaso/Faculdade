package exercicios.ProjetoAcademia;

public class Aluno extends Pessoa{

    private int matricula;
    private boolean mensalidadeEmDia;
    private Treino treino;
    
    //Métodos
    public void pagarMensalidade(double valor) {
    if (valor >= 100.0) {
        this.setMensalidadeEmDia(true);
        System.out.println("Pagamento de R$" + valor + " processado. Mensalidade em dia!");
    } else {
        System.out.println("Valor R$" + valor + " é insuficiente. A mensalidade custa R$100,00.");
    }
}

    //Construtor
    public Aluno(String nome, int idade, String sexo, int matricula) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.mensalidadeEmDia = false;
    }

    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public boolean isMensalidadeEmDia() {
        return mensalidadeEmDia;
    }
    public void setMensalidadeEmDia(boolean mensalidadeEmDia) {
        this.mensalidadeEmDia = mensalidadeEmDia;
    }
    
       public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }


    //Polimorfismo Sobrescrita
    @Override
    public void detalhes() {
        System.out.println("---------- DADOS DO ALUNO ----------");
       System.out.println("Nome: " + this.getNome() + "\n" +
                        "Idade: " + this.getIdade() + "\n" + 
                        "Sexo: " + this.getSexo() + "\n" + 
                        "Número da matrícula: " + this.getMatricula() + "\n" +
                        "Mensalidade ta em dia? " + this.isMensalidadeEmDia());
        
        if (this.isMensalidadeEmDia()) {
            System.out.println("Status: EM DIA");
        } else {
        System.out.println("Status: PENDENTE");
        }
        
        if (this.getTreino() != null) {
        System.out.println("Treino Atual: " + this.getTreino().getMusculoAlvo());
        } else {
        System.out.println("Treino: Não atribuído.");
        }
    }


    
}
