package view;

import javax.swing.JOptionPane;
import controller.TelefoneController;
import br.edu.fateczl.filaobj.Fila;

public class Principal {
	public static void main(String[] args) {
		
		Fila f = new Fila(); 
		TelefoneController tf = new TelefoneController(); 
		int opc = 0; 
		
		while(opc!=3) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu\nIdentificador de chamadas\n 1- Inserir Ligação \n 2- Consultar Ligações\n 3- Encerrar Programa")); 

			switch(opc) {
			case 1: 
			String numerotelefone = JOptionPane.showInputDialog("Digite o número de Telefone: ");
			tf.insereLigacao(f, numerotelefone); 
				break; 
			case 2: tf.consultaLigacoes (f);
				break; 
			case 3: 
				JOptionPane.showMessageDialog(null,"Encerrando Programa...");
				break;
             default: JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
			
			
		}
		
		
	}

}
