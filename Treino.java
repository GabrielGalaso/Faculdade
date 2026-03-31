package exercicios.ProjetoAcademia;

import java.util.ArrayList;

public class Treino {
    private String tipo;
    private String MusculoAlvo;
    ArrayList<Exercicio> listaExercicios = new ArrayList<>();

    //Métodos
    public void adicionarExercicio(Exercicio e){
        listaExercicios.add(e);
    }

    public void imprimirFicha(){
        System.out.println("--------------Exercícios--------------");
        for (Exercicio exercicio : listaExercicios) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Nome do exercicio: " + exercicio.getNome() + "\n" +
                        "Series: " + exercicio.getSeries() + "\n" + 
                        "Repeticoes: " + exercicio.getRepeticoes() + "\n" +
                        "Carga: " + exercicio.getCarga() + "KG");
        }
    }

    //Construtor
    public Treino(String tipo, String musculoAlvo) {
        this.tipo = tipo;
        MusculoAlvo = musculoAlvo;
    }

    //Geterrs e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMusculoAlvo() {
        return MusculoAlvo;
    }

    public void setMusculoAlvo(String musculoAlvo) {
        MusculoAlvo = musculoAlvo;
    }

    public ArrayList<Exercicio> getListaExercicios() {
        return listaExercicios;
    }

    public void setListaExercicios(ArrayList<Exercicio> listaExercicios) {
        this.listaExercicios = listaExercicios;
    }

    
    
    
}
