package Faculdade.ProjetinhoEscola;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- INÍCIO DO SEMESTRE ACADÊMICO --- \n");

        // ------------------------------------------------------------
        // 1. CRIAÇÃO DOS PERSONAGENS (Professores e Alunos)
        // ------------------------------------------------------------
        
        // Criando o Professor (Herda de Pessoa)
        Professor prof = new Professor();
        prof.setNome("Pasquale");
        prof.setemail("pasquale@gmail.com");
        prof.setCpf(12345);
        prof.setDepartamento("Tecnologia");
        prof.setSalario(5000.0);
        prof.setSiape(998877);

        // Criando os Alunos (Herdam de Pessoa)
        Aluno a1 = new Aluno();
        a1.setNome("Gabriel");
        a1.setCurso("ADS");
        a1.setemail("gabriel@gmail.com");
        a1.setCpf(11122);
        a1.setMatricula(202601);

        Aluno a2 = new Aluno();
        a2.setNome("Pedro");
        a2.setCurso("ADS");
        a2.setemail("pedro@gmail.com");
        a2.setCpf(33344);
        a2.setMatricula(202602);

        Aluno a3 = new Aluno();
        a3.setNome("Maria");
        a3.setCurso("ADS");
        a3.setemail("maria@gmail.com");
        a3.setCpf(55566);
        a3.setMatricula(202603);

        // ------------------------------------------------------------
        // 2. VALIDAÇÃO E SEGURANÇA (Métodos de Pessoa)
        // ------------------------------------------------------------
        System.out.println("--- TESTANDO SEGURANÇA ---");
        
        // Testando login do Professor (Cpf 12345 é a senha)
        prof.fazerLogin("pasquale@gmail.com", 12345); // Sucesso!
        
        // Testando alteração de email com validação @gmail.com
        a1.alterarEmail("gabriel_ads@gmail.com");

        System.out.println();

        // ------------------------------------------------------------
        // 3. MATRÍCULA E RELACIONAMENTOS (Classe Turma)
        // ------------------------------------------------------------
        System.out.println("--- 📚 CRIAÇÃO DA TURMA ---");

        // Agrupando os alunos num array tradicional de tamanho 3
        Aluno[] alunosMatriculados = {a1, a2, a3};

        // Instanciando a Turma com o Professor e a Lista de Alunos
        Turma pythonTurma = new Turma("Lógica com Python", prof, alunosMatriculados);

        // O Professor assume a matéria
        prof.darAual("Lógica com Python");

        // Exibindo a Pauta da Turma (Usa o laço FOR que corrigimos!)
        pythonTurma.exibirPauta();

        System.out.println();

        // ------------------------------------------------------------
        // 4. ROTINA ACADÊMICA (Lançamento de Notas e Médias)
        // ------------------------------------------------------------
        System.out.println("\n--- DIA DA PROVA E FECHAMENTO ---");

            // Lançando as notas para o Gabriel (índices 0 e 1)
            prof.lancarNota(a1, 0, 9.5);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            prof.lancarNota(a1, 1, 8.5);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            // Lançando as notas para o Pedro (índices 0 e 1)
            prof.lancarNota(a2, 0, 7.0);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            prof.lancarNota(a2, 1, 6.0);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            // Lançando as notas para a Maria (índices 0 e 1)
            prof.lancarNota(a3, 0, 10.0);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            prof.lancarNota(a3, 1, 9.0);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("\n--- 📊 RESULTADO DAS MÉDIAS ---");
        
        // Alunos calculam a média das notas guardadas no array estático de tamanho 2
        a1.calcularMedia();
        a2.calcularMedia();
        a3.calcularMedia();

        System.out.println();

        // ------------------------------------------------------------
        // 5. SOLICITAÇÃO DE DOCUMENTOS (Impressão do Aluno GABRIEL)
        // ------------------------------------------------------------
        System.out.println("--- 📄 EMISSÃO DE HISTÓRICO ---");
        a1.solicitarHistorico();

        System.out.println("\n--- 🎉 FIM DO SEMESTRE ---");
    }
}
