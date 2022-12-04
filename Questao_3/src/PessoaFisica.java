public class PessoaFisica extends Pessoa {
    protected String cpf;
    protected String sobrenome;

    public PessoaFisica(String nome, String sobrenome, String cpf){
        super(nome);
        this.cpf = cpf;
        this.sobrenome = sobrenome;
    }

    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
   
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setsobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String toString(){
        return super.toString()+ this.sobrenome+ "\nSeu CPF E "+ this.cpf;
    }
}
