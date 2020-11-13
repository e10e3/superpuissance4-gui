/*
 * 
 * Émile ROYER
 * TP 3, v1.4
 * 
 */
package superpuissance4;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Émile ROYER
 */
public class CelluleGraphique extends JButton {
	
	Cellule celluleAssociee;
	ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
	
	public CelluleGraphique(Cellule laCellule) {
		celluleAssociee = laCellule;
	}
	
}
