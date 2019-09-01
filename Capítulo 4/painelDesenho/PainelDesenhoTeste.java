// Figura 4.19: DrawPanelTest.java
// criando um JFrame para exibir um DrawPanel.
import javax.swing.JFrame;


 public class PainelDesenhoTeste {
 	public static void main(String[] args) {
 		// cria um painel que contém nosso desenho 
 		PainelDesenho painel = new PainelDesenho();

 		// cria um novo quadro para a armazenar o painel
 		JFrame application = new JFrame();

 		// configura o frame para ser encerrado quando ele é fechado
 		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 		application.add(painel); // adiciona painel ao frame
 		application.setSize(250,250);// configura o tamanho do frame
 		application.setVisible(true);// torna o frame visivel
 	}
 } // fim da classe PainelDesenhoTeste