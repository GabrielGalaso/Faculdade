package exercicios.ProjetoAcademia;

import java.util.ArrayList;

public class Academia {
    private String nome;
    private String endereco;
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    //Métodos
    public void matricularAluno(Aluno aluno){
        listaAlunos.add(aluno);
        System.out.println("Bem-vindo à academia " + this.nome + ", " + aluno.getNome() + " Matrícula realizada.");
    }

    public void realizarPagamento(String nomeAluno, double valor){
        boolean encontrado = false;
        for (Aluno aluno : this.listaAlunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                aluno.pagarMensalidade(valor);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
        System.out.println("Aluno " + nomeAluno + " não encontrado!");
         }
    }

    public void atribuirTreino(String nomeAluno, Treino novoTreino){
        boolean encontrado = false;
        for (Aluno aluno : listaAlunos) {
             if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                aluno.setTreino(novoTreino);
                System.out.println("Treino de " + aluno.getTreino().getMusculoAlvo() + " atribuído ao aluno " + aluno.getNome());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
        System.out.println("Aluno " + nomeAluno + " não encontrado!");
        }
    }

    public void listarAlunos() {
    for (Aluno alunos : listaAlunos) {
        alunos.detalhes();
    }

    }
    //Construtor
    public Academia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
    public void setListaagetListaAlunos(ArrayList<Aluno> listagetListaAlunos) {
        this.listaAlunos = listagetListaAlunos;
    }

    
}
