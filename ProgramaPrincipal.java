package controle;

import modelo.Modelo;
import visao.JanelaPrincipal;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		JanelaPrincipal j= new JanelaPrincipal();
		j.setVisible(true);
		Modelo m = new Modelo();
		Controle conLog = new Controle(j, m);
	}
}
