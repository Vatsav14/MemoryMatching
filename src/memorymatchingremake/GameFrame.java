/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorymatchingremake;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Vatsav
 */
public class GameFrame extends JFrame {
    private JButton[] game = new JButton[16];
    private List<Integer> map = new ArrayList<Integer>(16);
    private Container cont;
    
    Icon burger = new ImageIcon("pictures\\burger.png");
    Icon flash = new ImageIcon("pictures\\flash.png");
    Icon fries = new ImageIcon("pictures\\fries.png");
    Icon marvel = new ImageIcon("pictures\\marvel.png");
    Icon cd = new ImageIcon("pictures\\cd.png");
    Icon starbucks = new ImageIcon("pictures\\starbucks.png");
    Icon pizza = new ImageIcon("pictures\\pizza.png");
    Icon icecream = new ImageIcon("pictures\\icecream.png");

    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
        super("Memory Matching");
        cont = getContentPane();
        cont.setLayout(new GridLayout(4, 4));
        ButtonHandler bh = new ButtonHandler();
        for(int i = 0; i < 16; i++){
            map.add(i);
            game[i] = new JButton();
            cont.add(game[i]);
            game[i].setIcon(burger);
            game[i].addActionListener(bh);
        }
        Collections.shuffle(map);
        setSize(350, 350);
        setVisible(true);        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }
    
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            int ind = 0;
            for(int i = 0; i < 16; i++){
                if(o == game[i])
                    ind = i;
            }
            System.out.println(map.get(ind));
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
