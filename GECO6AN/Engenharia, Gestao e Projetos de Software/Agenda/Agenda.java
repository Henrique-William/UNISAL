import java.util.*;

public class Agenda {
	public static void main(String args[]){
		new Agenda().executar();
	}
	private void executar() {
		int pos;
		List<IEvento>listaEventos = new LinkedList<IEvento>();
		
		IEvento ev;
		for(pos = 1; pos <= 5; pos++){
			ev = new EventoSocial();
			ev.setDesc("\nEvento Social " + pos);
			listaEventos.add(ev);
			
			ev = new EventoFinanceiro();
			ev.setDesc("Evento Financeiro " + pos);
			listaEventos.add(ev);
			
			ev = new EventoEsportivo();
			ev.setDesc("Evento Esportivo " + pos);
			listaEventos.add(ev);
		}
		for(IEvento e : listaEventos){
			e.mostraDesc();
		}
	}
}