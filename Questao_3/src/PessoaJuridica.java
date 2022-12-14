public class PessoaJuridica extends Pessoa {
    protected String cnpj;
    protected String razaoSocial;

    public PessoaJuridica(String nome, String cnpj, String razaoSocial){
        super(nome);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
   
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }

    public String toString(){
        return super.toString()+ "\nO nome da sua empresa e " + this.razaoSocial + "\nNo CNPJ "+ this.cnpj;
    }
    
}
