package pet_simulator;

import java.io.*;
import java.util.Scanner;


public class Game_Page extends javax.swing.JFrame {
    public Game_Page() {
        initComponents();
    }
    
    private Scanner x;
    String a;
    String b;
    String c;
    double P_Health = 100 ;
    String P_Mood   = "Happy";
    double D_Health = 100 ;
    String D_Mood   = "Neutral";
    String Food_Choice;
    String Toy_Choice;
    String Command_Choice;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jShowPet = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jP_Health = new javax.swing.JToggleButton();
        jP_Mood = new javax.swing.JButton();
        jP_ShowHealth = new javax.swing.JTextField();
        jP_ShowMood = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jD_Health = new javax.swing.JButton();
        jD_Mood = new javax.swing.JButton();
        jD_ShowHealth = new javax.swing.JTextField();
        jD_ShoowMood = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboFood = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboToy = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboCommand = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jD_Status = new javax.swing.JTextField();
        jShowPlayer_F = new javax.swing.JLabel();
        jShowPlayer_L = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Player Name :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Pet :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Players Status");

        jP_Health.setText("Health");
        jP_Health.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jP_HealthMouseReleased(evt);
            }
        });

        jP_Mood.setText("Mood");
        jP_Mood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jP_MoodMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Pets Status");

        jD_Health.setText("Health");
        jD_Health.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jD_HealthMouseReleased(evt);
            }
        });

        jD_Mood.setText("Mood");
        jD_Mood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jD_MoodMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Player");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Pet");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Food :");

        jComboFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bacon", "PopCorn", "LoliPop", "Pizza" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText(" Toys :");

        jComboToy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bumareng", "FootBall", "Skate", "Bone" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Command :");

        jComboCommand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dance", "Jump", "Sit Down", "Sleep" }));
        jComboCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCommandActionPerformed(evt);
            }
        });

        jButton1.setText("Give");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jButton2.setText("Give");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });

        jButton3.setText("Do");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Status :");

        jShowPlayer_F.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jShowPlayer_FAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jShowPet, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jShowPlayer_F, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jShowPlayer_L, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jP_ShowHealth, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jP_Health, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jP_Mood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jP_ShowMood, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboToy, 0, 139, Short.MAX_VALUE)
                                    .addComponent(jComboFood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboCommand, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jD_ShowHealth)
                                    .addComponent(jD_Health))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jD_Mood)
                                        .addGap(126, 126, 126))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jD_ShoowMood, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jD_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(30, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jShowPlayer_L, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jShowPlayer_F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jShowPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP_Health)
                    .addComponent(jP_Mood)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jD_Health)
                    .addComponent(jD_Mood))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP_ShowHealth)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jP_ShowMood)
                        .addComponent(jD_ShowHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jD_ShoowMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboFood, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jD_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboToy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCommandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCommandActionPerformed

    private void jShowPlayer_FAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jShowPlayer_FAncestorAdded
        try {
            x = new Scanner(new File("Database.txt"));
            while(x.hasNext()){
                a = x.next();
                b = x.next();
                c = x.next();
            }
            jShowPet.setText(c);
            jShowPlayer_F.setText(a);
            jShowPlayer_L.setText(b);
        } catch (FileNotFoundException ex) {
            
        }
    }//GEN-LAST:event_jShowPlayer_FAncestorAdded

    private void jP_HealthMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_HealthMouseReleased
        jP_ShowHealth.setText(Double.toString(P_Health));
    }//GEN-LAST:event_jP_HealthMouseReleased

    private void jP_MoodMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_MoodMouseReleased
        jP_ShowMood.setText(P_Mood);
    }//GEN-LAST:event_jP_MoodMouseReleased

    private void jD_HealthMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD_HealthMouseReleased
        jD_ShowHealth.setText(Double.toString(D_Health));
    }//GEN-LAST:event_jD_HealthMouseReleased

    private void jD_MoodMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD_MoodMouseReleased
        jD_ShoowMood.setText(D_Mood);
    }//GEN-LAST:event_jD_MoodMouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        Food_Choice = (String) jComboFood.getSelectedItem();
        
        if ( Food_Choice.equalsIgnoreCase("Bacon")){
            jD_Status.setText("This is so yummy!");
            D_Health = 100 ;
            D_Mood = "Happy" ;
            
        }else if (Food_Choice.equalsIgnoreCase("PopCorn")){
            jD_Status.setText("Mehh! I hate Popcorns :P ");
            D_Health = 40 ;
            D_Mood = "Mad" ;
            if ( D_Mood == "Mad"){
                 P_Mood = "Angry";
                 P_Health = 60 ;
            }
        }else if (Food_Choice.equalsIgnoreCase("LoliPop")){
            jD_Status.setText("Am i supposed to Suck it ? Ever Seen Dogs sucking Lolis? XD ");
            D_Health = 50 ;
            D_Mood = "Lol" ;
            if ( D_Mood == "Lol"){
                 P_Mood = "Funny";
                 P_Health = 100 ;
            }
        }else if (Food_Choice.equalsIgnoreCase("Pizza")){
            jD_Status.setText("Now that's something worth eating ");
            D_Health = 90 ;
            D_Mood = "Mammamia" ;
            if ( D_Mood == "Mammamia"){
                 P_Mood = "Rejoice";
                 P_Health = 100 ;
            }
        }
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        Toy_Choice = (String) jComboToy.getSelectedItem();
        
        if ( Toy_Choice.equalsIgnoreCase("Bumareng")){
            jD_Status.setText("Throw it and ill catch it");
            D_Health = 100 ;
            D_Mood = "Happy" ;
            if ( D_Mood == "Happy"){
                 P_Mood = "Rejoice";
                 P_Health = 100 ;
            } 
        }else if (Toy_Choice.equalsIgnoreCase("FootBall")){
            jD_Status.setText("Mehh! How am i supposed to Run while kicking it");
            D_Health = 50 ;
            D_Mood = "Angry" ;
            if ( D_Mood == "Angry"){
                 P_Mood = "Thinking";
                 P_Health = 70 ;
            }
        }else if (Toy_Choice.equalsIgnoreCase("Skate")){
            jD_Status.setText("Ever seen a dog doing skating? XD");
            D_Health = 80 ;
            D_Mood = "Afraid" ;
            if ( D_Mood == "Afraid"){
                 P_Mood = "Sorry";
                 P_Health = 60 ;
            }
        }else if (Toy_Choice.equalsIgnoreCase("Bone")){
            jD_Status.setText("I love You");
            D_Health = 100 ;
            D_Mood = "Rejoice" ;
            if ( D_Mood == "Rejoice"){
                 P_Mood = "Happy";
                 P_Health = 100 ;
            }
        }
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        Command_Choice = (String) jComboCommand.getSelectedItem();
        
        if ( Command_Choice.equalsIgnoreCase("Dance")){
            jD_Status.setText("Le Dance baby dance! On the Floor");
            D_Health = 100 ;
            D_Mood = "Funny" ;
            if ( D_Mood == "Funny"){
                 P_Mood = "Funny";
                 P_Health = 100 ;
            }
            
        }else if (Command_Choice.equalsIgnoreCase("Jump")){
            jD_Status.setText("Not interested in jumping");
            D_Health = 80 ;
            D_Mood = "Mehh!" ;
            if ( D_Mood == "Mehh"){
                 P_Mood = "pfft";
                 P_Health = 60 ;
            }
        }else if (Command_Choice.equalsIgnoreCase("Sit Down")){
            jD_Status.setText("Yeah Sure! Im used to it");
            D_Health = 90 ;
            D_Mood = "Lazy" ;
            if ( D_Mood == "Lazy"){
                 P_Mood = "Lol";
                 P_Health = 80 ;
            }
        }else if (Command_Choice.equalsIgnoreCase("Sleep")){
            jD_Status.setText("Good Night");
            D_Health = 100 ;
            D_Mood = "zZzZ" ;
            if ( D_Mood == "zZzZ"){
                 P_Mood = "Permissible";
                 P_Health = 90 ;
            }
        }
    }//GEN-LAST:event_jButton3MouseReleased

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboCommand;
    private javax.swing.JComboBox<String> jComboFood;
    private javax.swing.JComboBox<String> jComboToy;
    private javax.swing.JButton jD_Health;
    private javax.swing.JButton jD_Mood;
    private javax.swing.JTextField jD_ShoowMood;
    private javax.swing.JTextField jD_ShowHealth;
    private javax.swing.JTextField jD_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jP_Health;
    private javax.swing.JButton jP_Mood;
    private javax.swing.JTextField jP_ShowHealth;
    private javax.swing.JTextField jP_ShowMood;
    private javax.swing.JLabel jShowPet;
    private javax.swing.JLabel jShowPlayer_F;
    private javax.swing.JLabel jShowPlayer_L;
    // End of variables declaration//GEN-END:variables
}
