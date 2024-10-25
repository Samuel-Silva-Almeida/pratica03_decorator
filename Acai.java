public class Acai implements Adicional {
    private String descricao = "Açaí simples";
    private Tamanho tamanho;
    
    public String getDescricao() {
        return descricao;
    }
    
    public double custo() {
        return 5.00;
    }

    public Acai(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getDescricao() {
        return descricao + " " + tamanho.toString().toLowerCase();
    }
    
    public double custo() {
        switch (tamanho) {
            case PEQUENO: return 5.00;
            case MEDIO: return 7.00;
            case GRANDE: return 9.00;
            default: return 5.00;
        }
    }
}