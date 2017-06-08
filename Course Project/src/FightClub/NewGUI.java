/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FightClub;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Random;

/**
 *
 * @author leggc
 */
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayer1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlayer4)
                            .addComponent(txtPlayer3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPlayer1)
                            .addComponent(txtPlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPlayer4Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addComponent(btnStart)
                                .addGap(18, 18, 18)
                                .addComponent(btnNextRound)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlayer1Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlayer2Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlayer3Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addGap(290, 290, 290)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayer1Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayer2Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayer3Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart)
                    .addComponent(txtPlayer4Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextRound))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addContainerGap(293, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
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

    private void txtPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlayer1ActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        createPlayers();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnNextRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextRoundActionPerformed
        dmgRand();
    }//GEN-LAST:event_btnNextRoundActionPerformed

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
        for (int i = 0; i <= 3 ; i++)
        {
            //Generate Random number
            Random rand = new Random();
            int  n = rand.nextInt(20) + 1;
            //Get the health of player
            int PlayerHealth = playerArray[i].getHealth();
            //set new health of player as current health minus random number
            playerArray[i].setHealth(PlayerHealth-n);

            
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
                
    }
    //Carlos
    public void healthCheck()
    {
       for (int i = 0; i <= 3; i++) {
            if(playerArray[i]==null)
            {
                continue;
            }
            else 
            {    
                areaOutput.append(String.valueOf(playerArray[i].getName()));
                areaOutput.append(String.valueOf(playerArray[i].getHealth()));
            }
       
        if(playerArray[i].getHealth()<=0)
        {
            
            areaOutput.append(String.valueOf("You are dead"));
            areaOutput.append(String.valueOf(playerArray[i].getName()));
            playerArray[i] = null;
            
        }
    }
        
    }
    //David
    public void winner()
    {

        JFrame frame = new JFrame("The Winner is...");
        JOptionPane.showMessageDialog(frame, "wins!","WINNER WINNER WINNER!!!!",
                JOptionPane.INFORMATION_MESSAGE);

    }
    //Carlos
    public void loser()
    {
        //text
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaOutput;
    private javax.swing.JButton btnNextRound;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
