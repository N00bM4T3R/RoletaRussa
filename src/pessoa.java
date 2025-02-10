public  abstract  class pessoa {
    private  String nome;
    protected  Double RendaAnual;
    
    public pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        RendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return RendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        RendaAnual = rendaAnual;
    }

    public abstract  double   imposto();

    
    
}
