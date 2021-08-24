public class Endereco {
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(){
        
    }
    public Endereco(String bairro, String cidade,String estado){
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String imprimirEndereco(){
        return  "\nBairro: "+bairro
                +"\nCidade: "+cidade
                +"\nEstado: "+estado;
    }
}
