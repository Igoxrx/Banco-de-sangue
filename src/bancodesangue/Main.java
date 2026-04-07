package bancodesangue;

public class Main {
    public static void main(String[] args) {
    	GerenteCentral gestor = new GerenteCentral();

        Hemocentro banco1 = new BancoSangueImpl("Hemomias");
        Hemocentro banco2 = new BancoSangueImpl("Hemoce");

        gestor.inserirHemocentro(banco1);
        gestor.inserirHemocentro(banco2);

        Concessor concessor1 = new Concessor("Luciano Sousa Morais", "120.032.125-45");
        Concessor concessor2 = new Concessor("Maria Ketclen Smith", "245.472.384-24");

        Doario doario1 = new Doario(1, "A+", concessor1);
        Doario doario2 = new Doario(2, "B-", concessor2);

        gestor.Doarioinserir(doario1);
        gestor.Doarioinserir(doario2);

        gestor.Ver_Estoque();

        gestor.alterarHemocentro(banco2);
        gestor.excluirHemocentro(banco1);

        gestor.Ver_Estoque();

        gestor.Doariotransferir(banco2, banco1, "A+");

        gestor.Ver_Estoque();
    }
}
