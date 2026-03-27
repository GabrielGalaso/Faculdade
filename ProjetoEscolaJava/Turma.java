package Faculdade.ProjetinhoEscola;

public class Turma {
    private String disciplina;
    private Professor professor;
    private Aluno listaAlunos[] = new Aluno[3];


    public Turma(String disciplina, Professor professor, Aluno[] listaAlunos) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.listaAlunos = listaAlunos;
    }

    public void exibirPauta(){
        System.out.println("Nome da disciplina: " + this.getDisciplina());
        System.out.println("Professor: " + this.professor.getNome()); 
        System.out.println("Lista de Alunos:");
    
        for (int i = 0; i < this.listaAlunos.length; i++) {
            if (this.listaAlunos[i] != null) {
            System.out.println("- " + this.listaAlunos[i].getNome());
            
        }
    }
    }


    public String getDisciplina() {
        return disciplina;
    }


    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    public Professor getProfessor() {
        return professor;
    }


    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public Aluno[] getListaAlunos() {
        return listaAlunos;
    }


    public void setListaAlunos(Aluno[] listaAlunos) {
        this.listaAlunos = listaAlunos;
    } 
    
}
