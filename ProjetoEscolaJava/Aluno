package Faculdade.ProjetinhoEscola;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private double notas[] = new double[2];
   
    public void adicionarNota(int indice, double nota) {
    if (indice >= 0 && indice < this.notas.length) { 
        this.notas[indice] = nota;
        System.out.println("Nota guardada na posição " + indice + " para o aluno " + getNome());
    } else {
        System.out.println("Índice inválido! O array só tem posições 0 e 1.");
        }
    }

    public void calcularMedia(){
        double soma = this.notas[0] + this.notas[1];
        double media = soma / 2;
        System.out.println("A média do aluno " + getNome() + " é: " + media);
    }

    public void solicitarHistorico(){
        System.out.println("Nome: " + this.getNome() + "\n" +
                            "Curso: " + this.getCurso() + "\n" +
                            "Matrícula: " + this.getMatricula() + "\n" +
                            "Nota 1: " + this.notas[0]  + "\n" +
                            "Nota 2: " + this.notas[1]);
    }

    public void assistirAula(){
        System.out.println("O aluno está assistindo a aula!");
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getnotas() {
        return notas;
    }
    public void setnotas(double[] notas) {
        this.notas = notas;
    }

    
}
