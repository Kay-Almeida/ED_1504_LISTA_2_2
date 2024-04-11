package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;

public class TelefoneController {

	public TelefoneController () {
		super();
	}
	
	public void insereLigacao (Fila f, String numerotelefone) {
		f.insert(numerotelefone);
		JOptionPane.showMessageDialog(null, "Número inserido com sucesso!");
	}
	
	public void consultaLigacoes (Fila f) {
		try {
			if (f.isEmpty()) {
                throw new Exception("Não há chamadas perdidas.");
            }
			
			JOptionPane.showMessageDialog(null, "Chamadas Perdidas");
			
			while(!f.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Número: "+ f.remove());
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
}
