public class Pessoafj {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected int cnpj;
    protected String razaoSocial;

    public Pessoafj(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
    }

    public Pessoafj(String name, int cnpj, String razaoSocial){
        this.nome = name;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
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

    public int getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
   
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public String toString(){
        String saida = "--------------";
		saida +=  "\n" + this.nome;
		saida += "\n" + this.sobrenome;
		saida += "\n" + this.cpf;
        saida += "\n" + this.cnpj;
        saida += "\n" + this.razaoSocial;
		saida += "\n-------------";
        return saida;
    }
}
