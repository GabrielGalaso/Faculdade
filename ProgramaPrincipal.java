package exercicios.ProjetoAcademia;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno1 = new Aluno("Gabriel", 20, "M", 031112);
        Treinador treinador = new Treinador("Leonardo", 20, null, null, 0);
        Exercicio exercicio = new Exercicio("Supino Reto", 4, 12, 25f);
        Exercicio exercicio2 = new Exercicio("Supino Inclinado", 4, 12, 20f);
        Treino treino = new Treino("A, B", "Peito e Tríceps");
        Academia academia = new Academia("GalaTechNoFit", "Rua Barão Andrades, Número: 78");
        academia.matricularAluno(aluno1);
        academia.atribuirTreino(aluno1.getNome(), treino);;
        aluno1.pagarMensalidade(110);
        academia.listarAlunos();;


        //Adicionando o treino no método
        // tr.adicionarExercicio(e);
        // tr.adicionarExercicio(e2);
        // //Definindo os treino para a classe Aluno
        // a.setTreino(tr);
        // //Exibindo a ficha de exercícios do Aluno e tbm os detalhes do Aluno.
        // a.detalhes();
        // a.getTreino().imprimirFicha();
    }
}
