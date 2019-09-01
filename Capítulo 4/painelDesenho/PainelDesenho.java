/* Figura 4.18 : DrawPanel.java*/
// Utilizando DrawLine para conectar os cantos de um painel
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelDesenho extends JPanel {
	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g){
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);

		int largura = getWidth();// largura total
		int altura = getHeight();// altura total

		// desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0,0, largura, altura);

		// desenha uma linha a partir do canto inferior esquerdo até o canto superior direito
		g.drawLine(0,altura,largura,0);
	}
}// fim da classe PainelDesenho