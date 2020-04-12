
package sistemahospitalar;
public class usuario {

    
    String nome;
    double cpf;
    String rua;
    float cep;
    float numerocasa;        
    double telefone;
    double celular;
    String consulta;    
    
    
    
    public void cadestagio(String nome,String rua,String telefone,String cep,String cpf,String numerodacasa){
        
     System.out.println("DADOS CADASTRAIS:"+nome+rua+telefone+cep+cpf+numerodacasa);
        
     
    }
    
     
    public void setNome(String nome){
        this.nome =nome;
    }
    public String getnome(){
        return nome;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
    public double getcpf() {
        return cpf;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return rua;
    }

    public void setCep(float cep) {
        this.cep = cep;
    }
    public float getCep() {
        return cep;
    }

    public void setNumerocasa(float numerocasa) {
        this.numerocasa = numerocasa;
    }

    
    public float getNumerocasa() {
        return numerocasa;
    }
    
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    
    public double getTelefone() {
        return telefone;
    }
    
    public void setCelular(double celular) {
        this.celular = celular;
    }
    
    public double getCelular() {
        return celular;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    
    public String getConsulta() {
        return consulta;
    }
    
    public void setnome(String nome){
        this.nome=nome;
    }
    
   

    public String getNome() {
        return nome;
    }

    

    

    




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
