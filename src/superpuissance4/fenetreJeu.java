/*
 *
 * Clara THEODOLY et Émile ROYER
 * TP 3, v1.4
 *
 */
package superpuissance4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 * Crée l'interface graphique
 *
 * @author Clara THEODOLY et Émile ROYER
 */
public class fenetreJeu extends javax.swing.JFrame {

    // attributs rajoutés depuis la classe partie
    Joueur[] ListeJoueur = new Joueur[2];
    Grille grilleJeu = new Grille();
    Joueur joueurCourant;
    
    ImageIcon img_iconetimer = new javax.swing.ImageIcon(getClass().getResource("/images/timer.png")); // insertion de l'image pour notre chrono
    // attributs utilisés pour le chrono
    int nbSecondes = 0;
    Timer monChrono;

    /**
     * Creates new form fenetreJeu
     */
    public fenetreJeu() {
        initComponents();
        // création d'un chrono
        ActionListener tache_recurrente = new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                nbSecondes++; // incrémentation du nombre de secondes
                texte_temps.setText(nbSecondes + "");
            }
        ;
        };
		
		/* Instanciation du timer */
	   monChrono = new Timer(1000, tache_recurrente);

        // on cache les deux panneaux suivant ( en créant deux boolean initailisé à  faux)
        panneau_info_joueur1.setVisible(false); // ce panneau est maintenant caché
        panneau_info_joueur2.setVisible(false); // ce panneau est maintenant caché
        panneau_info_partie.setVisible(false); // on fait de même pour le panneau information partie
        // on rendra ces panneaux visibles seuleument lorsqu'on aura cliqué sur le bouton "Démarrer la partie"
        // on affecte bien notre image a notre jlabel iconeTimer
        iconeTimer.setIcon(img_iconetimer);

        ajouterCellulesGraphiques();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fenetreLegende = new javax.swing.JFrame();
        btn_fermer_legende = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        iconeTimer = new javax.swing.JLabel();
        texte_temps = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panneau_info_partie = new javax.swing.JPanel();
        gif_bravo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        texte_message = new javax.swing.JTextArea();
        btn_recommencer = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        panneau_info_joueur1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_j1_jetons = new javax.swing.JLabel();
        panneau_info_joueur2 = new javax.swing.JPanel();
        lbl_j2_nom = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_j2_jetons = new javax.swing.JLabel();
        btn_legende = new javax.swing.JButton();

        fenetreLegende.setTitle("Légende");
        fenetreLegende.setAlwaysOnTop(true);
        fenetreLegende.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fenetreLegende.setLocation(new java.awt.Point(450, 80));
        fenetreLegende.setMinimumSize(new java.awt.Dimension(400, 620));
        fenetreLegende.setUndecorated(true);
        fenetreLegende.setResizable(false);
        fenetreLegende.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_fermer_legende.setText("Fermer");
        btn_fermer_legende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fermer_legendeActionPerformed(evt);
            }
        });
        fenetreLegende.getContentPane().add(btn_fermer_legende, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"))); // NOI18N
        jLabel8.setText("Trou noir");
        fenetreLegende.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"))); // NOI18N
        jLabel12.setText("Case vide");
        fenetreLegende.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"))); // NOI18N
        jLabel13.setText("Jeton jaune");
        fenetreLegende.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"))); // NOI18N
        jLabel14.setText("Jeton rouge");
        fenetreLegende.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"))); // NOI18N
        jLabel15.setText("Désintégrateur");
        fenetreLegende.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super Puissance 4");
        setBackground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(254, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(209, 232, 232));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom du joueur 1 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel2.setText("Nom du joueur 2 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, -1));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 190, -1));

        btn_start.setText("Démarrer la partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        panneau_creation_partie.add(iconeTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, 40));

        texte_temps.setText("0");
        panneau_creation_partie.add(texte_temps, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 95, -1, -1));

        jLabel16.setText("temps écoulé");
        panneau_creation_partie.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 95, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 360, 130));

        panneau_info_partie.setBackground(new java.awt.Color(209, 232, 232));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gif_bravo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gif-bravo.gif"))); // NOI18N
        panneau_info_partie.add(gif_bravo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel3.setText("Informations jeu : ");
        panneau_info_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setText("Joueur courant :");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lbl_jcourant.setText("nomJoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        texte_message.setColumns(20);
        texte_message.setRows(5);
        message.setViewportView(texte_message);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 320, 140));

        btn_recommencer.setText("Recommencer une partie");
        btn_recommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recommencerActionPerformed(evt);
            }
        });
        panneau_info_partie.add(btn_recommencer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 215, -1, -1));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 360, 246));

        btn_col_0.setText("1");
        btn_col_0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_col_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 10, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_col_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 10, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_col_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 10, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_col_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 10, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_col_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 10, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_col_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 10, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_col_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 10, -1, -1));

        panneau_info_joueur1.setBackground(new java.awt.Color(162, 234, 198));
        panneau_info_joueur1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Désintégrateurs :");
        panneau_info_joueur1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, -1));

        jLabel6.setText("Couleur :");
        panneau_info_joueur1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lbl_j1_nom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_j1_nom.setText("nomJoueur1");
        panneau_info_joueur1.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lbl_j1_couleur.setText("couleurJoueur1");
        panneau_info_joueur1.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        lbl_j1_desint.setText("nbdesintJoueur1");
        panneau_info_joueur1.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 55, -1, -1));

        jLabel5.setText("Jetons restants :");
        panneau_info_joueur1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lbl_j1_jetons.setText("nbjetonsJoueur1");
        panneau_info_joueur1.add(lbl_j1_jetons, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        getContentPane().add(panneau_info_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 360, 100));

        panneau_info_joueur2.setBackground(new java.awt.Color(162, 234, 198));
        panneau_info_joueur2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_j2_nom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_j2_nom.setText("nomJoueur2");
        panneau_info_joueur2.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel9.setText("Couleur :");
        panneau_info_joueur2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lbl_j2_couleur.setText("couleurJoueur2");
        panneau_info_joueur2.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));

        jLabel7.setText("Désintégrateurs :");
        panneau_info_joueur2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, -1));

        lbl_j2_desint.setText("nbdesintJoueur2");
        panneau_info_joueur2.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 55, -1, -1));

        jLabel10.setText("Jetons restants :");
        panneau_info_joueur2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lbl_j2_jetons.setText("nbjetonsJoueur2");
        panneau_info_joueur2.add(lbl_j2_jetons, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        getContentPane().add(panneau_info_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 360, 110));

        btn_legende.setText("Légende");
        btn_legende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_legendeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_legende, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        setBounds(0, 0, 1210, 692);
    }// </editor-fold>//GEN-END:initComponents

    // code qui permet de faire une action lorsqu'on clique sur le bouton "Démarrer la partie"
    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed

        panneau_info_joueur1.setVisible(true); // on rend visible le panneau d'informations du joueur 1 en modifant sont boolean à vrai
        panneau_info_joueur2.setVisible(true); // on rend visible le panneau d'informations du joueur 2 en modifant sont boolean à vrai
        panneau_info_partie.setVisible(true); // on fait de même pour le panneau d'informations de la partie
        btn_recommencer.setEnabled(false); // le btn pour recommencer une partie n'apparait pas encore
        initialiserPartie();
        monChrono.start(); // lorsqu'on appuie sur le bouton "démarrer partie" le chrono se lance
        panneau_grille.repaint(); // raffraichit l'affichage de la partie et le redessine complètement
        btn_start.setEnabled(false); // on désactive le btn_start pour pas que les utilisateurs s'amusent à rafraichir la partie et avoir une nouvelle grille
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        if (jouerDansColonne(0)) {
            if (grilleJeu.colonneRemplie(0)) {
                btn_col_0.setEnabled(false);
            }
            joueurSuivant();
        } else {
            texte_message.setText(joueurCourant.Nom + " n'a plus de jetons");
        }
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        if (jouerDansColonne(1)) {
            if (grilleJeu.colonneRemplie(1)) {
                btn_col_1.setEnabled(false);
            }
            joueurSuivant();
        } else {
            texte_message.setText(joueurCourant.Nom + " n'a plus de jetons");
        }
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        if (jouerDansColonne(2)) {
            if (grilleJeu.colonneRemplie(2)) {
                btn_col_2.setEnabled(false);
            }
            joueurSuivant();
        } else {
            texte_message.setText(joueurCourant.Nom + " n'a plus de jetons");
        }
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        if (jouerDansColonne(3)) {
            if (grilleJeu.colonneRemplie(3)) {
                btn_col_3.setEnabled(false);
            }
            joueurSuivant();
        } else {
            texte_message.setText(joueurCourant.Nom + " n'a plus de jetons");
        }
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        if (jouerDansColonne(4)) {
            if (grilleJeu.colonneRemplie(4)) {
                btn_col_4.setEnabled(false);
            }
            joueurSuivant();
        } else {
            texte_message.setText(joueurCourant.Nom + " n'a plus de jetons");
        }
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        if (jouerDansColonne(5)) {
            if (grilleJeu.colonneRemplie(5)) {
                btn_col_5.setEnabled(false);
            }
            joueurSuivant();
        } else {
            texte_message.setText(joueurCourant.Nom + " n'a plus de jetons");
        }
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        if (jouerDansColonne(6)) {
            if (grilleJeu.colonneRemplie(6)) {
                btn_col_6.setEnabled(false);
            }
            joueurSuivant();
        } else {
            texte_message.setText(joueurCourant.Nom + " n'a plus de jetons");
        }
    }//GEN-LAST:event_btn_col_6ActionPerformed

    private void btn_recommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recommencerActionPerformed
        grilleJeu = new Grille(); // création d'une nouvelle grille
        texte_message.setText("");
        supprimerCellulesGraphiques(); // supprime toutes les cellules sur lesquelles on vient de jouer
        ajouterCellulesGraphiques(); // recrée les cellules
        initialiserPartie(); // initialise une nouvelle partie avec des trous noirs et des désintégrateurs
        actualiserAffichage(); // actualisation
        nbSecondes = 0; // réinitialisation du chrono
        texte_temps.setText(nbSecondes + "");
        monChrono.start(); // lancement du chrono pour la nouvelle partie
        btn_recommencer.setEnabled(false); // désactivation du bouton recommencer partie pour pas que l'utilisateur s'amuse a créer une nouvelle grille de jeu
    }//GEN-LAST:event_btn_recommencerActionPerformed

    private void btn_legendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_legendeActionPerformed
        btn_legende.setEnabled(false);
        fenetreLegende.setVisible(true);
    }//GEN-LAST:event_btn_legendeActionPerformed

    private void btn_fermer_legendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fermer_legendeActionPerformed
        fenetreLegende.setVisible(false);
        btn_legende.setEnabled(true);
    }//GEN-LAST:event_btn_fermer_legendeActionPerformed

    public boolean jouerDansColonne(int j) {
        boolean resultat;
        resultat = grilleJeu.ajouterJetonDansColonne(joueurCourant, j);

        actualiserAffichage();

        return resultat;
    }

    /**
     * Méthode de factorisation Crée une cellule graphique pour chaque cellule
     * de la grille
     */
    public final void ajouterCellulesGraphiques() {
        for (int i = 0; i < grilleJeu.nb_lignes; i++) {
            for (int j = 0; j < grilleJeu.nb_colonnes; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.Cellules[i][j]); // création d'une nouvelle cellule graphique appelé cellGraph

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            texte_message.setText("");
                            return;
                        }
                        if (c.jetonCourant.Couleur.equals(joueurCourant.Couleur)) {
                            texte_message.setText(joueurCourant.Nom + " récupère un de ses jetons");
                            Jeton j_recup = c.recupererJeton();
                            c.supprimerJeton();
                            joueurCourant.ajouterJeton(j_recup);
                            joueurSuivant();
                        } else {
                            if (joueurCourant.nombreDesintegrateurs > 0) {
                                texte_message.setText(joueurCourant.Nom + " désintègre un jeton adverse");
                                c.supprimerJeton();
                                joueurCourant.utiliserDesintegrateur();
                                joueurSuivant();
                            }
                        }
                        grilleJeu.tasserGrille();
                        actualiserAffichage();
                    }
                });
                panneau_grille.add(cellGraph); // on ajoute les éléments cellGraph à notre panneau de jeu
            }
        }
    }

    /**
     * Vide le panneau panneau_grille de tous ses éléments
     */
    public void supprimerCellulesGraphiques() {
        panneau_grille.removeAll();
    }

    /**
     * On utilise cette cette méthode pour factoriser le code Elle regroupe
     * toutes les actions qui se font à chaque tour et qui nécessitent de
     * changer l'affichage sans affecter les valeurs de jeu.
     */
    public void actualiserAffichage() {
        panneau_grille.repaint();

        /* Mise à jour du nombre de désintégrateurs */
        lbl_j1_desint.setText(ListeJoueur[0].nombreDesintegrateurs + "");
        lbl_j2_desint.setText(ListeJoueur[1].nombreDesintegrateurs + "");

        /* Mise à jour du nombre de jetons qu'il reste a chaques joueurs */
        lbl_j1_jetons.setText(ListeJoueur[0].nombreJetonsRestants + "");
        lbl_j2_jetons.setText(ListeJoueur[1].nombreJetonsRestants + "");

        /* Vérification des victoires */
        boolean v_j1 = grilleJeu.estGagnantePourJoueur(ListeJoueur[0]);
        boolean v_j2 = grilleJeu.estGagnantePourJoueur(ListeJoueur[1]);

        /* Messages en cas de victoire(s) */
        if (v_j1 && !v_j2) {
            texte_message.setText("Victoire de " + ListeJoueur[0].Nom + " ! Félicitations."); // victoire du joueur 1
            btn_recommencer.setEnabled(true); // on active le bouton btn_recommencer , pour que les joueurs puissent lancer une nouvelle partie
            monChrono.stop();// lorque ce joueur a gagné le chrono s'arrête la où il en était et arrête d'avancer
        }
        if (v_j2 && !v_j1) {
            texte_message.setText("Victoire de " + ListeJoueur[1].Nom + " ! Félicitations."); // Victoire du joueur 2
            btn_recommencer.setEnabled(true); // on active le bouton btn_recommencer , pour que les joueurs puissent lancer une nouvelle partie
            monChrono.stop(); // lorque ce joueur a gagné le chrono s'arrête la où il en était et arrête d'avancer
        }
        if (v_j1 && v_j2) {
            texte_message.setText(joueurCourant.Nom + " a perdu ! Une faute de jeu, c'est dommage.");
            btn_recommencer.setEnabled(true); // on active le bouton btn_recommencer , pour que les joueurs puissent lancer une nouvelle partie

        }
    }

    public void joueurSuivant() {
        if (joueurCourant == ListeJoueur[0]) {
            joueurCourant = ListeJoueur[1];
        } else {
            joueurCourant = ListeJoueur[0];
        }
        lbl_jcourant.setText(joueurCourant.Nom);
    }

    public void initialiserPartie() {
        Random rnd = new Random();

        attribuerCouleursAuxJoueurs();

        lbl_j1_nom.setText(ListeJoueur[0].Nom);
        lbl_j1_couleur.setText(ListeJoueur[0].Couleur);
        lbl_j1_desint.setText(ListeJoueur[0].nombreDesintegrateurs + "");

        lbl_j2_nom.setText(ListeJoueur[1].Nom);
        lbl_j2_couleur.setText(ListeJoueur[1].Couleur);
        lbl_j2_desint.setText(ListeJoueur[1].nombreDesintegrateurs + "");

        /* Distribution des jetons */
        for (int i = 0; i < ListeJoueur.length; i++) {
            for (int j = 0; j < ListeJoueur[i].ListeJetons.length; j++) {
                ListeJoueur[i].ListeJetons[j] = new Jeton(ListeJoueur[i].lireCouleur());
            }
            ListeJoueur[i].nombreJetonsRestants = 21;
        }

        /* Mise du nombre de jetons, une fois les jetons crées */
        lbl_j1_jetons.setText(ListeJoueur[0].nombreJetonsRestants + "");
        lbl_j2_jetons.setText(ListeJoueur[1].nombreJetonsRestants + "");

        /* Détermination du joueur courant */
        joueurCourant = ListeJoueur[rnd.nextInt(2)];

        lbl_jcourant.setText(joueurCourant.Nom);

        /*
		* Placement des trous noirs.
		* S'il y a déjà un trou noir à l'endroit où on peut en placer un, on
		* réessaye à un autre endroit.
		* On en profite pour placer les deux désintégrateurs cachés.
         */
        for (int k = 0; k < 5; k++) {
            int i = rnd.nextInt(grilleJeu.nb_lignes);
            int j = rnd.nextInt(grilleJeu.nb_colonnes);
            if (grilleJeu.Cellules[i][j].presenceTrouNoir()) {
                k--;
            } else {
                grilleJeu.placerTrouNoir(i, j);
                if (k < 2) {
                    grilleJeu.placerDesintegrateur(i, j);
                }
            }
        }

        /* Placement des 3 désintégrateurs restants */
        for (int k = 0; k < 3; k++) {
            int i = rnd.nextInt(grilleJeu.nb_lignes);
            int j = rnd.nextInt(grilleJeu.nb_colonnes);

            /*
			* Il ne faut pas qu'il y ait un désintégrateur sur la case, ni un
			* trou noir (seulement deux désintégrateurs sur des cases de trou noir).
             */
            if (grilleJeu.Cellules[i][j].presenceDesintegrateur() || grilleJeu.Cellules[i][j].presenceTrouNoir()) {
                k--;
            } else {
                grilleJeu.placerDesintegrateur(i, j);
            }
        }
    }

    public void attribuerCouleursAuxJoueurs() {
        Random rnd = new Random();
        int index;

        String nomJoueur1 = nom_joueur1.getText(); // le nom joueur est issu de ce qui a été tapé dans la cellule
        ListeJoueur[0] = new Joueur(nomJoueur1);

        String nomJoueur2 = nom_joueur2.getText(); // on fait la même chose que pour le joueur 1
        ListeJoueur[1] = new Joueur(nomJoueur2);

        index = rnd.nextInt(2);

        ListeJoueur[index].affecterCouleur("rouge");
        ListeJoueur[1 - index].affecterCouleur("jaune");

        // affectation de la couleur du joueur et de ses jetons à la couleur du fond de leur panel d'informations
        if (index == 0) {
            panneau_info_joueur1.setBackground(new java.awt.Color(199, 83, 83)); // si le joueur prend la couleur jaune alors le fond du panel_info_joueur1 sera jaune
            panneau_info_joueur2.setBackground(new java.awt.Color(246, 228, 153)); // aisni celui du deuxième joueur sera rouge
        } else { // on fait l'inverse dans le cas ou j1 et rouge et j2 jaune
            panneau_info_joueur1.setBackground(new java.awt.Color(246, 228, 153));
            panneau_info_joueur2.setBackground(new java.awt.Color(199, 83, 83));
        }

        System.out.println(ListeJoueur[0].Nom + " prend la couleur "
                + ListeJoueur[0].lireCouleur() + ", tandis que " + ListeJoueur[1].Nom
                + " prend la couleur " + ListeJoueur[1].lireCouleur() + ".");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new fenetreJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_fermer_legende;
    private javax.swing.JButton btn_legende;
    private javax.swing.JButton btn_recommencer;
    private javax.swing.JButton btn_start;
    private javax.swing.JFrame fenetreLegende;
    private javax.swing.JLabel gif_bravo;
    private javax.swing.JLabel iconeTimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_jetons;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_jetons;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueur1;
    private javax.swing.JPanel panneau_info_joueur2;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JTextArea texte_message;
    private javax.swing.JLabel texte_temps;
    // End of variables declaration//GEN-END:variables

}
