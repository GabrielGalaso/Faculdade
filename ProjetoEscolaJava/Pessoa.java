package Faculdade.ProjetinhoEscola;

public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    private String email;

    public void fazerLogin(String email, int cpf){
    if (email.equals(this.email) && cpf == this.cpf) {
        System.out.println(nome + " Logado com sucesso");
    } else {
        System.out.println("Falha no login!");
    }
}
    
    public void alterarEmail(String novoEmail){
        if (novoEmail.contains("@gmail.com")) {
            setemail(novoEmail);
            System.out.println("Seu novo email é " + novoEmail);
        }
        else{
            System.out.println("Seu email deve conter @gmail.com");
        }
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }

    
}
