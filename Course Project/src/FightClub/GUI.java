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
public class GUI extends javax.swing.JPanel {

    Players[] playerArray = new Players[4];
    
        
    GUI g = new GUI();
    

   

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        areaOutput.setColumns(20);
        areaOutput.setRows(5);
        jScrollPane1.setViewportView(areaOutput);

        jLabel1.setText("Current Health");

        jLabel2.setText("Players");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlayer3)
                                    .addComponent(txtPlayer4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlayer3Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlayer4Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(97, 97, 97))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPlayer1)
                                        .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlayer1Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlayer2Health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(41, 41, 41)))
                        .addComponent(btnStart)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextRound)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNextRound)
                            .addComponent(btnStart))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(txtPlayer4Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        createPlayers();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnNextRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextRoundActionPerformed
        dmgRand();
    }//GEN-LAST:event_btnNextRoundActionPerformed

    //Mark
    public void dmgRand()
    {
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
        
        for ( int i = 0 ; i < 4 ; i++ ) {
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
       

        
        
        
        
              for (int i = 0; i < 5; i++) {
            areaOutput.append(String.valueOf(playerArray[i].getName()));
            areaOutput.append(String.valueOf(playerArray[i].getHealth()));
        
          
            
        
        if(playerArray[i].getHealth()<=0){
            
            areaOutput.append(String.valueOf("You are dead"));
            playerArray[i] = null;
            areaOutput.append(String.valueOf(playerArray[i].getName()));
                if(playerArray[i]==null){
                    continue;
                }
            
            areaOutput.append(String.valueOf(playerArray[i]));
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
        
    }
    
        public static void Main(String[] arg)
    {
        new initComponents();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaOutput;
    private javax.swing.JButton btnNextRound;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
