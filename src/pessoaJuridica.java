public final  class pessoaJuridica extends  pessoa{

    private int Nfuncionarios;

    public pessoaJuridica(String nome, Double rendaAnual, int nfuncionarios) {
        super(nome, rendaAnual);
        Nfuncionarios = nfuncionarios;
    }

    public int getNfuncionarios() {
        return Nfuncionarios;
    }

    public void setNfuncionarios(int nfuncionarios) {
        Nfuncionarios = nfuncionarios;
    }

    @Override
    public double imposto() {
        if (Nfuncionarios >= 10) {
            return RendaAnual * 0.14;

        }
        else {
            return  RendaAnual * 0.16;
        }
       
    }

  
    

}