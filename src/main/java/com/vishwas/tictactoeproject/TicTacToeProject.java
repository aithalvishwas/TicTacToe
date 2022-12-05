/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vishwas.tictactoeproject;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aithal
 */
public class TicTacToeProject implements ActionListener  {
    JFrame jf1;
    JButton jb1 ,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    int count =0;
    String str ="";
    boolean win =false;
    
    TicTacToeProject(){
        jf1 = new JFrame("Tic Tac Toe by Vishwas");
        jf1.setSize(500,500);
        jf1.setDefaultCloseOperation(3);
        jf1.setLayout(new GridLayout(3,3));
        
        jb1 = new JButton();
        jb1.addActionListener(this);
        jf1.add(jb1);
        
        
        jb2 = new JButton();
        jb2.addActionListener(this);
        jf1.add(jb2);
        
        jb3 = new JButton();
        jb3.addActionListener(this);
        jf1.add(jb3);
        
        jb4 = new JButton();
        jb4.addActionListener(this);
        jf1.add(jb4);
        
        jb5 = new JButton();
        jb5.addActionListener(this);
        jf1.add(jb5);
        
        jb6 = new JButton();
        jb6.addActionListener(this);
        jf1.add(jb6);
        
        jb7 = new JButton();
        jb7.addActionListener(this);
        jf1.add(jb7);
        
        jb8 = new JButton();
        jb8.addActionListener(this);
        jf1.add(jb8);
        
        jb9 = new JButton();
        jb9.addActionListener(this);
        jf1.add(jb9);
        
        jf1.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TicTacToeProject();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        count = count +1;
        if(count%2!=0){
            str="X";
            
        }else{
            str = "0";
        }
        
        if(e.getSource()==jb1){
            
            jb1.setFont(new Font("Arial",1,50));
            jb1.setText(str);
            jb1.setEnabled(false);
        }
        if(e.getSource()==jb2){
            jb2.setFont(new Font("Arial",1,50));
            jb2.setText(str);
            jb2.setEnabled(false);
        }
        if(e.getSource()==jb3){
            jb3.setFont(new Font("Arial",1,50));
            jb3.setText(str);
            jb3.setEnabled(false);
        }
        if(e.getSource()==jb4){
            jb4.setFont(new Font("Arial",1,50));
            jb4.setText(str);
            jb4.setEnabled(false);
        }
        if(e.getSource()==jb5){
            jb5.setFont(new Font("Arial",1,50));
            jb5.setText(str);
            jb5.setEnabled(false);
        }
        if(e.getSource()==jb6){
            jb6.setFont(new Font("Arial",1,50));
            jb6.setText(str);
            jb6.setEnabled(false);
        }
        if(e.getSource()==jb7){
            jb7.setFont(new Font("Arial",1,50));
            jb7.setText(str);
            jb7.setEnabled(false);
        }
        if(e.getSource()==jb8){
            jb8.setFont(new Font("Arial",1,50));
            jb8.setText(str);
            jb8.setEnabled(false);
        }
        if(e.getSource()==jb9){
            jb9.setFont(new Font("Arial",1,50));
            jb9.setText(str);
            jb9.setEnabled(false);
        }
        wining();
        whoWin();
    }
    void wining(){
        //horzintial
        if(jb1.getText() == jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText()!=""){
            win =true;
        }
        else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText()!=""){
            win =true;
        }
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText()!=""){
            win =true;
        }
        //vertical
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb1.getText()!=""){
            win =true;
        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb2.getText()!=""){
            win =true;
        }
        else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb3.getText()!=""){
            win =true;
        }
        //diganol
        else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb1.getText()!=""){
            win =true;
        }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText()!=""){
            win =true;
        }
        else{
            win =false;
        }
    }
    void whoWin(){
        if(win==true){
            JOptionPane.showMessageDialog(jf1, str +" wins");
            restartgame();
        }else if (count==9 && win ==false){
            JOptionPane.showMessageDialog(jf1, "Game is Draw ");
            restartgame();
        }
        
    }
    void restartgame(){
        int i= JOptionPane.showConfirmDialog(jf1, "Do you want to restart the game?");
        if(i==0){
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");
            
            buttonEnable(true);
            count=0;
            str="";
            win =false;
        }else if(i==1){
            System.exit(0);
        }else{
            buttonEnable(false);
        }
    }
    void buttonEnable(boolean b){
            jb1.setEnabled(b);
            jb2.setEnabled(b);
            jb3.setEnabled(b);
            jb4.setEnabled(b);
            jb5.setEnabled(b);
            jb6.setEnabled(b);
            jb7.setEnabled(b);
            jb8.setEnabled(b);
            jb9.setEnabled(b);
    }
}
