public class TestaDecorator {
    public static void main(String[] args) {
    
        Adicional acaiSimples = new Acai();
        System.out.println(acaiSimples.getDescricao() + " - R$" + acaiSimples.custo());
        
        Adicional acaiComMorango = new Morango(new Acai());
        System.out.println(acaiComMorango.getDescricao() + " - R$" + acaiComMorango.custo());
        
        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(new Acai())));
        System.out.println(acaiCompleto.getDescricao() + " - R$" + acaiCompleto.custo());
    }