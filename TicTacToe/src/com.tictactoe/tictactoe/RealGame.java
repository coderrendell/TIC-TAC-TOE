/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tictactoe;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */

public class RealGame extends javax.swing.JFrame {

    /**
     * Creates new form RealGame
     */
    int turn=2,k=0;
    int buttonused[]={0,0,0,0,0,0,0,0,0};
    int p1won[]={0,0,0,0,0,0,0,0,0};
    int p2won[]={0,0,0,0,0,0,0,0,0};
    Result r;
    String option1,option2;
    public RealGame(String option) {
        initComponents();
        Color backgroundcolor=new Color(255,255,244);
        this.getContentPane().setBackground(backgroundcolor);
        setVisible(true);
        option1=option;
        if(option.equals("X"))
            option2="O";
        else
            option2="X";
        
    }

    private RealGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");
        setLocation(new java.awt.Point(75, 75));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        but1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but1.setForeground(new java.awt.Color(0, 0, 51));
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but2.setForeground(new java.awt.Color(0, 0, 51));
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but3.setForeground(new java.awt.Color(0, 0, 51));
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        but4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but4.setForeground(new java.awt.Color(0, 0, 51));
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });

        but6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but6.setForeground(new java.awt.Color(0, 0, 51));
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });

        but5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but5.setForeground(new java.awt.Color(0, 0, 51));
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });

        but7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but7.setForeground(new java.awt.Color(0, 0, 51));
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });

        but8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but8.setForeground(new java.awt.Color(0, 0, 51));
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });

        but9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        but9.setForeground(new java.awt.Color(0, 0, 51));
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        resetbutton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(0, 0, 51));
        resetbutton.setText("RESTART GAME!");
        resetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(resetbutton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        if(buttonused[0]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but1.setText(option1);
                buttonused[0]=1;
                p1won[0]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but1.setText(option2);
                buttonused[0]=1;
                p2won[0]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        if(buttonused[1]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but2.setText(option1);
                buttonused[1]=1;
                p1won[1]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but2.setText(option2);
                buttonused[1]=1;
                p2won[1]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
       if(buttonused[2]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but3.setText(option1);
                buttonused[2]=1;
                p1won[2]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but3.setText(option2);
                buttonused[2]=1;
                p2won[2]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        if(buttonused[3]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but4.setText(option1);
                buttonused[3]=1;
                p1won[3]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but4.setText(option2);
                buttonused[3]=1;
                p2won[3]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        if(buttonused[4]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but5.setText(option1);
                buttonused[4]=1;
                p1won[4]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but5.setText(option2);
                buttonused[4]=1;
                p2won[4]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
        if(buttonused[5]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but6.setText(option1);
                buttonused[5]=1;
                p1won[5]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but6.setText(option2);
                buttonused[5]=1;
                p2won[5]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        if(buttonused[6]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but7.setText(option1);
                buttonused[6]=1;
                p1won[6]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but7.setText(option2);
                buttonused[6]=1;
                p2won[6]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        if(buttonused[7]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but8.setText(option1);
                buttonused[7]=1;
                p1won[7]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but8.setText(option2);
                buttonused[7]=1;
                p2won[7]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        if(buttonused[8]==0)
        {
            if(turn%2==0)
            {
                turn++;
                but9.setText(option1);
                buttonused[8]=1;
                p1won[8]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
            else
            {
                turn++;
                but9.setText(option2);
                buttonused[8]=1;
                p2won[8]=1;
                int result1=p1won();
                int result2=p2won();
                if(result1==1){
                    dispose();
                    r=new Result("PLAYER 1 WON!!");
                }
                else if(result2==1){
                    dispose();
                    r=new Result("PLAYER 2 WON!!");
                }
                if(checktie()==0)
                {
                    dispose();
                    r=new Result("     IT'S A TIE!!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON IS BEEN USED ALREADY");
        }
    }//GEN-LAST:event_but9ActionPerformed

    private void resetbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbuttonMouseClicked
        // TODO add your handling code here:
        dispose();
        SelectXO sxo=new SelectXO();
    }//GEN-LAST:event_resetbuttonMouseClicked

    /**
     * @param args the command line arguments
     */
    int p1won(){
        if(p1won[0]==1 && p1won[1]==1 && p1won[2]==1)
        {
            k=1;
            return 1;
        }
        if(p1won[0]==1 && p1won[3]==1 && p1won[6]==1)
        {
            k=1;
            return 1;
        }
        if(p1won[0]==1 && p1won[4]==1 && p1won[8]==1)
        {
            k=1;
            return 1;
        }
        if(p1won[1]==1 && p1won[4]==1 && p1won[7]==1)
        {
            k=1;
            return 1;
        }
        if(p1won[2]==1 && p1won[5]==1 && p1won[8]==1)
        {
            k=1;
            return 1;
        }
        if(p1won[3]==1 && p1won[4]==1 && p1won[5]==1)
        {
            k=1;
            return 1;
        }
        if(p1won[6]==1 && p1won[7]==1 && p1won[8]==1)
        {
            k=1;
            return 1;
        }
        if(p1won[2]==1 && p1won[4]==1 && p1won[6]==1)
        {
            k=1;
            return 1;
        }
        return 0;
        
    }
    int p2won(){
        if(p2won[0]==1 && p2won[1]==1 && p2won[2]==1)
        {
            k=1;
            return 1;
        }
        if(p2won[0]==1 && p2won[3]==1 && p2won[6]==1)
        {
            k=1;
            return 1;
        }
        if(p2won[0]==1 && p2won[4]==1 && p2won[8]==1)
        {
            k=1;
            return 1;
        }
        if(p2won[1]==1 && p2won[4]==1 && p2won[7]==1)
        {
            k=1;
            return 1;
        }
        if(p2won[2]==1 && p2won[5]==1 && p2won[8]==1)
        {
            k=1;
            return 1;
        }
        if(p2won[3]==1 && p2won[4]==1 && p2won[5]==1)
        {
            k=1;
            return 1;
        }
        if(p2won[6]==1 && p2won[7]==1 && p2won[8]==1)
        {
            k=1;
            return 1;
        }
        if(p2won[2]==1 && p2won[4]==1 && p2won[6]==1)
        {
            k=1;
            return 1;
        }
        
        return 0;
        
    }
    int checktie(){
        if(buttonused[0]==1&&buttonused[1]==1&&buttonused[2]==1&&buttonused[3]==1&&buttonused[4]==1&&buttonused[5]==1&&buttonused[6]==1&&buttonused[7]==1&&buttonused[8]==1)
        {
            if(k==0){
                return 0;
            }
        }
        return 1;
    }
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
            java.util.logging.Logger.getLogger(RealGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetbutton;
    // End of variables declaration//GEN-END:variables
}
