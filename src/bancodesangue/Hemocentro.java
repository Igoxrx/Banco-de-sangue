package bancodesangue;
	
import java.util.ArrayList;
import java.util.List;
	
abstract class Hemocentro implements Gestordedoacoes {
	    protected List<Doario> doarios;
	    protected String nome;
	
	    public Hemocentro(String nome) {
	        this.doarios = new ArrayList<>();
	        this.nome = nome;
	    }
	
	    public String getNome() {
	        return nome;
	    }
	
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	
	    @Override
	    public void Doarioinserir(Doario doario) {
	    	doarios.add(doario);
	        System.out.println("Foi inserido a doação ao hemocentro " + nome);
	    }
	
	    @Override
	    public void Doarioexcluir(Doario doario) {
	    	doarios.remove(doario);
	        System.out.println("Foi removido a doação no hemocentro " + nome);
	    }
	    
	    @Override
	    public void Doariotransferir(Hemocentro origem, Hemocentro para, String grupo_sanguíneo) {
	        for (Doario d : origem.doarios) {
	            if (d.getGrupo_sanguíneo().equals(grupo_sanguíneo)) {
	                para.Doarioinserir(d);
	                origem.Doarioexcluir(d);
	                System.out.println("Doação feita a partir do hemocentro " + origem.getNome() + " para o hemocentro " + para.getNome());
	                return;
	            }
	        }
	        System.out.println("Não foi localizada a doação no hemocentro " + origem.getNome());
	    }
	    
	    @Override
	    public void Doarioalterar(Doario doario) {
	        for (Doario d : doarios) {
	            if (d.equals(doario)) {
	                d.setConcessor(doario.getConcessor());
	            	d.setGrupo_sanguíneo(doario.getGrupo_sanguíneo());
	                d.setQuantidadeBolsas(doario.getQuantidadeBolsas());
	                System.out.println("Doação atualizada no hemocentro " + nome);
	                return;
	            }
	        }
	        System.out.println("Não foi encontrado a doação no hemocentro " + nome);
	    }

	    @Override
	    public void Ver_Estoque() {
	        for (Doario d : doarios) {
	            System.out.println("O tipo sanguíneo: " + d.getGrupo_sanguíneo() + ", A quantidade de bolsas: " + d.getQuantidadeBolsas());
	        }
	    }
}
