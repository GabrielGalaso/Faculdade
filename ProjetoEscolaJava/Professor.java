package Faculdade.ProjetinhoEscola;

public class Professor extends Pessoa{
    private int siape;
    private String departamento;
    private double salario;
    private String disciplinasMinistradas;


    public void lancarNota(Aluno aluno, int indice, double nota) {
        System.out.println("Professor " + getNome() + " lançando nota no índice " + indice + " para: " + aluno.getNome());
        aluno.adicionarNota(indice, nota);
    }

    public void darAual(String materia){
        this.setdisciplinasMinistradas(materia);
        System.out.println("O professor " + this.getNome() + " está ministrando aula de " + this.getdisciplinasMinistradas());
    }

    public void planejarAula(){
        System.out.println("O professor " + this.getNome() + "está planejando a próxima aula.");
    }

    public int getSiape() {
        return siape;
    }
    public void setSiape(int siape) {
        this.siape = siape;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getdisciplinasMinistradas() {
        return disciplinasMinistradas;
    }
    public void setdisciplinasMinistradas(String disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    
}
