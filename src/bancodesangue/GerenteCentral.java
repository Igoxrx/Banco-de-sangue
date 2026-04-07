package bancodesangue;

import java.util.ArrayList;
import java.util.List;



class GerenteCentral implements Gestordedoacoes, Gerenciadordebancos {
    private List<Hemocentro> hemocentroS;
    // Colocar um Hemocentro dentro do grupo de banco de sangue
    @Override
    public void inserirHemocentro(Hemocentro hemocentro) {
    	hemocentroS.add(hemocentro);
        System.out.println("Hemocentro " + hemocentro.getNome() + " incluido.");
    }
    // Retirar um Hemocentro de um grupo de banco de sangue
    @Override
    public void excluirHemocentro(Hemocentro hemocentro) {
    	hemocentroS.remove(hemocentro);
        System.out.println("Hemocentro " + hemocentro.getNome() + " retirado.");
    }


    @Override
    public void alterarHemocentro(Hemocentro hemocentro) {
        for (Hemocentro banco : hemocentroS) {
            if (banco.equals(hemocentro)) {
                banco.setNome(hemocentro.getNome());
                System.out.println("Hemocentro " + banco.getNome() + " alterado.");
                return;
            }
        }
        System.out.println("Hemocentro não encontrado.");
    }
    
    public GerenteCentral() {
        this.hemocentroS = new ArrayList<>();
    }

    @Override
    public void Doarioinserir(Doario doario) {
        for (Hemocentro banco : hemocentroS) {
            banco.Doarioinserir(doario);
        }
    }
    @Override
    public void Doarioalterar(Doario doario) {
        for (Hemocentro banco : hemocentroS) {
            banco.Doarioalterar(doario);
        }
    }

    @Override
    public void Doarioexcluir(Doario doario) {
        for (Hemocentro banco : hemocentroS) {
            banco.Doarioexcluir(doario);
        }
    }

    @Override
    public void Ver_Estoque() {
        for (Hemocentro banco : hemocentroS) {
            System.out.println("Hemocentro: " + banco.getNome());
            banco.Ver_Estoque();
        }
    }
    
    @Override
    public void Doariotransferir(Hemocentro origem, Hemocentro para, String grupo_sanguíneo) {
        origem.Doariotransferir(origem, para, grupo_sanguíneo);
    }
}

interface Gerenciadordebancos {
    void inserirHemocentro(Hemocentro hemocentro);
    void excluirHemocentro(Hemocentro hemocentro);
    void alterarHemocentro(Hemocentro hemocentro);
}

interface Gestordedoacoes {
    void Doarioinserir(Doario doario);
    void Doarioexcluir(Doario doario);
    void Doarioalterar(Doario doario);
    void Doariotransferir(Hemocentro origem, Hemocentro para, String grupo_sanguíneo);
    void Ver_Estoque();
}
