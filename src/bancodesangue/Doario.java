package bancodesangue;

class Doario {
    protected int quantidadeBolsas;
    protected String grupo_sanguíneo;
    protected Concessor consessor;

    public Doario(int quantidadeBolsas, String grupo_sanguíneo, Concessor consessor) {
        this.quantidadeBolsas = quantidadeBolsas;
        this.grupo_sanguíneo = grupo_sanguíneo;
        this.consessor = consessor;
    }

    public int getQuantidadeBolsas() {
        return quantidadeBolsas;
    }

    public void setQuantidadeBolsas(int quantidadeBolsas) {
        this.quantidadeBolsas = quantidadeBolsas;
    }

    public String getGrupo_sanguíneo() {
        return grupo_sanguíneo;
    }

    public void setGrupo_sanguíneo(String grupo_sanguíneo) {
        this.grupo_sanguíneo = grupo_sanguíneo;
    }

    public Concessor getConcessor() {
        return consessor;
    }

    public void setConcessor(Concessor consessor) {
        this.consessor = consessor;
    }
}