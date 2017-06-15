/*
 * Program Name: Fight Club
 * Authors: Carlos Henderson, Chris Legg, Dawood Manzur, Mark Vincent Padua
 * 
 */
package FightClub;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Random;

public class NewGUI extends javax.swing.JFrame {
        Players[] playerArray = new Players[4];

    /**
     * Creates new form NewGUI
     */
    public NewGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPlayer1 = new javax.swing.JTextField();
        txtPlayer2 = new javax.swing.JTextField();
        txtPlayer3 = new javax.swing.JTextField();
        txtPlayer4 = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        btnNextRound = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaOutput = new javax.swing.JTextArea();
        txtPlayer1Health = new javax.swing.JTextField();
        txtPlayer2Health = new javax.swing.JTextField();
        txtPlayer3Health = new javax.swing.JTextField();
        txtPlayer4Health = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNewGame = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fight Club");

        btnStart.setText("Start Fight");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnNextRound.setText("Next Round");
        btnNextRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextRoundActionPerformed(evt);
            }
        });

        areaOutput.setEditable(false);
        areaOutput.setColumns(20);
        areaOutput.setRows(5);
        jScrollPane1.setViewportView(areaOutput);

        txtPlayer1Health.setEditable(false);

        txtPlayer2Health.setEditable(false);

        txtPlayer3Health.setEditable(false);

        txtPlayer4Health.setEditable(false);

        jLabel1.setText("Current Health");

        jLabel2.setText("Players");

        btnHelp.setText("?");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(txtPlayer2)
                                    .addComponent(txtPlayer3)
                                    .addComponent(txtPlayer4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlayer4Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlayer1Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlayer2Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlayer3Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnStart)
                                .addGap(18, 18, 18)
                                .addComponent(btnNextRound)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnHelp)
                                .addContainerGap())))
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHelp)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStart)
                            .addComponent(btnNextRound)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPlayer1Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlayer2Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlayer3Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlayer4Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        menuNewGame.setText("New Game");
        menuNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewGameActionPerformed(evt);
            }
        });
        jMenu1.add(menuNewGame);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        menuAbout.setText("About Fight Club");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        jMenu2.add(menuAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        createPlayers();
        
        //Disable Start fight button
        btnStart.setEnabled(false);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnNextRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextRoundActionPerformed
        dmgRand();
    }//GEN-LAST:event_btnNextRoundActionPerformed

    private void menuNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewGameActionPerformed
        //Clear Player array
        for (int i =0; i<3;i++)
        {
            playerArray[i] = null;
        }
        
        //Clear Name fields
        txtPlayer1.setText("");
        txtPlayer2.setText("");
        txtPlayer3.setText("");
        txtPlayer4.setText("");
        
        //Clear Health Fields
        txtPlayer1Health.setText("");
        txtPlayer2Health.setText("");
        txtPlayer3Health.setText("");
        txtPlayer4Health.setText("");
        
        //Clear Text Area
        areaOutput.setText("");
        
        //Enable Start fight button
        btnStart.setEnabled(true);
    }//GEN-LAST:event_menuNewGameActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        //Exit the program
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        //Ref User manual as a JOptionPane popup.
    }//GEN-LAST:event_btnHelpActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        //Ref User manual as a JOptionPane popup.
    }//GEN-LAST:event_menuAboutActionPerformed

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
            java.util.logging.Logger.getLogger(NewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewGUI().setVisible(true);
            }
        });
    }

    //Mark
    public void dmgRand()
    {
        //Gonna need to test if dead(null) here as well... causing crash
        for (int i = 0; i <= 3 ; i++)
        {
            if(playerArray[i]==null)
            {
                continue;
            }
            else
            {
                //Generate Random number
                Random rand = new Random();
                int  n = rand.nextInt(20) + 1;
                //Get the health of player
                int PlayerHealth = playerArray[i].getHealth();
                //set new health of player as current health minus random number
                playerArray[i].setHealth(PlayerHealth-n);
            }

            
        }
        //Update each Health field on GUI
        txtPlayer1Health.setText(String.valueOf(playerArray[0].getHealth()));
        txtPlayer2Health.setText(String.valueOf(playerArray[1].getHealth()));
        txtPlayer3Health.setText(String.valueOf(playerArray[2].getHealth()));
        txtPlayer4Health.setText(String.valueOf(playerArray[3].getHealth()));
        
        //Pass control to next method
        healthCheck();
        
        /*
        int health[] = new int[4];
        int healthReduction[] = new int[4];
        
        long seed = System.currentTimeMillis();
        
        health[0] = Integer.parseInt(txtPlayer1Health.getText());
        health[1] = Integer.parseInt(txtPlayer2Health.getText());
        health[2] = Integer.parseInt(txtPlayer3Health.getText());
        health[3] = Integer.parseInt(txtPlayer4Health.getText());
        
        Random rand = new Random(seed);
        
        healthReduction[0] = rand.nextInt(20);
        healthReduction[1] = rand.nextInt(20);
        healthReduction[2] = rand.nextInt(20);
        healthReduction[3] = rand.nextInt(20);
        
        for ( int i = 0 ; i <= 3 ; i++ ) {
            health[i] = Math.max( health[i] - healthReduction[i], 0 );
        }
        
        txtPlayer1Health.setText(String.valueOf(health[0]));
        txtPlayer2Health.setText(String.valueOf(health[1]));
        txtPlayer3Health.setText(String.valueOf(health[2]));
        txtPlayer4Health.setText(String.valueOf(health[3]));
        
        if ( health[0] == 0 ) {
            txtPlayer1Health.setEnabled(false);
            txtPlayer1.setEnabled(false);
            areaOutput.append("Player 1 is dead \n");

        }
        
        if ( health[1] == 0 ) {
            txtPlayer2Health.setEnabled(false);
            txtPlayer2.setEnabled(false);
            areaOutput.append("Player 2 is dead \n");

        }
        
        if ( health[2] == 0 ) {
            txtPlayer3Health.setEnabled(false);
            txtPlayer3.setEnabled(false);
            areaOutput.append("Player 3 is dead \n");

        }
   
        if ( health[3] == 0 ) {
            txtPlayer4Health.setEnabled(false);
            txtPlayer4.setEnabled(false);
            areaOutput.append("Player 4 is dead \n");

        }
        
             */
    }
    //David
    public void createPlayers()
    {
        
        //create array list
        

        //add objects to array list
        playerArray[0] = new Players(txtPlayer1.getText());
        playerArray[1] = new Players(txtPlayer2.getText());
        playerArray[2] = new Players(txtPlayer3.getText());
        playerArray[3] = new Players(txtPlayer4.getText());
        
        //Begin Fight
        dmgRand();
                
    }
    //Carlos
    public void healthCheck()
    {
        //goes through each element of the array
        //checks if any element is null
        //if an element is null it continues to the next element
       for (int i = 0; i <= 3; i++) {
            if(playerArray[i]==null)
            {
                continue;
            }
            else 
            {    //or it prints the element name and health of the elements that are not null
                areaOutput.append(String.valueOf(playerArray[i].getName()));
                areaOutput.append(String.valueOf(playerArray[i].getHealth()));
            }
       
            //this checks if an elements health is less than or equal to 0
        if(playerArray[i].getHealth()<=0)
        {
            //if an elements health is less than or equal to 0 it prints out you are dead
            //and then it prints out the elements name and sets it to null
            areaOutput.append(String.valueOf("You are dead"));
            areaOutput.append(String.valueOf(playerArray[i].getName()));
            playerArray[i] = null;
            
            if(playerArray[i]==null&&playerArray[i]==null&&playerArray[i]==null&&playerArray[i]==null){
                loser();
            }
        }
    }
        
    }
    //David
    public void winner(String name)
    {
        //loop that goes through each element
        for (int i = 0; i <= 3; i++) {
            //if 3 elements are null and one is not then the condition is true and
            //code is executed
            if(playerArray[i]==null&&playerArray[i]==null&&playerArray[i]==null&&playerArray[i]!=null){
                
                 JFrame frame = new JFrame();
        
        String iName = "jimbo";
        if (JOptionPane.showConfirmDialog(null,"\t         " +
                iName + " WINS!!! \n" + "Would you like to play again?" , "WINNER",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {
            // yes option
            
             
            {
            playerArray[i] = null;
            }
        
            //Clear Name fields
            txtPlayer1.setText("");
            txtPlayer2.setText("");
            txtPlayer3.setText("");
            txtPlayer4.setText("");

            //Clear Text Area
            areaOutput.setText("");
        } 
        else 
        {
            System.exit(0);
        }
            }
        }
            
       

        

    }
    //Carlos
    public void loser()
    {
               JOptionPane.showMessageDialog(null, "Everyone has died, YOU LOSE!");
               System.exit(0);
           
              
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaOutput;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnNextRound;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuNewGame;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer1Health;
    private javax.swing.JTextField txtPlayer2;
    private javax.swing.JTextField txtPlayer2Health;
    private javax.swing.JTextField txtPlayer3;
    private javax.swing.JTextField txtPlayer3Health;
    private javax.swing.JTextField txtPlayer4;
    private javax.swing.JTextField txtPlayer4Health;
    // End of variables declaration//GEN-END:variables
}
