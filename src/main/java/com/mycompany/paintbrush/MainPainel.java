/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.paintbrush;

import javax.swing.UIManager;

/**
 *
 * @author 03841017207
 */
public class MainPainel extends javax.swing.JFrame {
    
    Pincel p = new Pincel();
    int xi, yi, x, y;
    
    /**
     * Creates new form MainPainel
     */
    public MainPainel() {
        initComponents();
        p.canvas = Canvas.getGraphics();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BrushGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Brush1 = new javax.swing.JRadioButton();
        Brush2 = new javax.swing.JRadioButton();
        Brush3 = new javax.swing.JRadioButton();
        Brush4 = new javax.swing.JRadioButton();
        Brush5 = new javax.swing.JRadioButton();
        Brush6 = new javax.swing.JRadioButton();
        Brush7 = new javax.swing.JRadioButton();
        sizeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Canvas = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        BrushGroup.add(Brush1);
        Brush1.setText("Pincel");
        Brush1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brush1ActionPerformed(evt);
            }
        });

        BrushGroup.add(Brush2);
        Brush2.setText("Linha");
        Brush2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brush2ActionPerformed(evt);
            }
        });

        BrushGroup.add(Brush3);
        Brush3.setText("Retangulo");
        Brush3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brush3ActionPerformed(evt);
            }
        });

        BrushGroup.add(Brush4);
        Brush4.setText("Circulo");
        Brush4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brush4ActionPerformed(evt);
            }
        });

        BrushGroup.add(Brush5);
        Brush5.setText("Cilindro");
        Brush5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brush5ActionPerformed(evt);
            }
        });

        BrushGroup.add(Brush6);
        Brush6.setText("Texto");
        Brush6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brush6ActionPerformed(evt);
            }
        });

        BrushGroup.add(Brush7);
        Brush7.setText("Borracha");
        Brush7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brush7ActionPerformed(evt);
            }
        });

        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 px", "3 px", "5 px", "8 px" }));
        sizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Tamanho: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Brush1)
                            .addComponent(Brush2)
                            .addComponent(Brush3)
                            .addComponent(Brush4)
                            .addComponent(Brush5)
                            .addComponent(Brush6)
                            .addComponent(Brush7)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Brush1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Brush2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Brush3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Brush4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Brush5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Brush6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Brush7)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Canvas.setBackground(new java.awt.Color(255, 255, 255));
        Canvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CanvasMouseDragged(evt);
            }
        });
        Canvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanvasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CanvasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CanvasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
                    .addComponent(Canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Brush1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brush1ActionPerformed
        // Pincel é a mesma coisa que ponto.
        p.figura = "pincel";
        System.out.println("Pincel : Ponto");
    }//GEN-LAST:event_Brush1ActionPerformed

    private void Brush2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brush2ActionPerformed
        // Troca o modo de desenho para linha
        p.figura = "linha";
        System.out.println("Pincel : Linha");
    }//GEN-LAST:event_Brush2ActionPerformed

    private void Brush3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brush3ActionPerformed
        p.figura = "retangulo";
        System.out.println("Pincel : Retangulo");
    }//GEN-LAST:event_Brush3ActionPerformed

    private void Brush4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brush4ActionPerformed
        p.figura = "circulo";
        System.out.println("Pincel : Circulo");
    }//GEN-LAST:event_Brush4ActionPerformed

    private void Brush5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brush5ActionPerformed
        p.figura = "cilindro";
        System.out.println("Pincel : Cilindro");
    }//GEN-LAST:event_Brush5ActionPerformed

    private void Brush6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brush6ActionPerformed
        p.figura = "texto";
        System.out.println("Pincel : Texto");
    }//GEN-LAST:event_Brush6ActionPerformed

    private void Brush7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brush7ActionPerformed
        p.figura = "borracha";
        System.out.println("Pincel : Borracha");
    }//GEN-LAST:event_Brush7ActionPerformed

    private void CanvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseClicked
        // Click do mouse
        System.out.println("Mouse : click");
    }//GEN-LAST:event_CanvasMouseClicked

    private void CanvasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMousePressed
        // Prechionar do mouse
        System.out.println("Mouse : segurando");
        
    }//GEN-LAST:event_CanvasMousePressed

    private void CanvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseReleased
        // Soltar do mouse
        System.out.println("Mouse : solto");
    }//GEN-LAST:event_CanvasMouseReleased

    private void CanvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseDragged
        // Arrastar do mouse
        System.out.println("Mouse : arrastando");
    }//GEN-LAST:event_CanvasMouseDragged

    private void sizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeComboBoxActionPerformed
        int index = sizeComboBox.getSelectedIndex();
        switch(index){
            case 0:
                p.tamanho = 1;
                System.out.println("Pincel: tamanho = " + p.tamanho + "px");
                break;
            case 1:
                p.tamanho = 3;
                System.out.println("Pincel: tamanho = " + p.tamanho + "px");
                break;
            case 2:
                p.tamanho = 5;
                System.out.println("Pincel: tamanho = " + p.tamanho + "px");
                break;
            case 3:
                p.tamanho = 8;
                System.out.println("Pincel: tamanho = " + p.tamanho + "px");
                break;
            default:
                p.tamanho = 1;
                System.out.println("Pincel: tamanho = " + p.tamanho + "px");
                break;
        }
    }//GEN-LAST:event_sizeComboBoxActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPainel().setVisible(true);
            }
        });
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Variables Declaration (UI) ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Brush1;
    private javax.swing.JRadioButton Brush2;
    private javax.swing.JRadioButton Brush3;
    private javax.swing.JRadioButton Brush4;
    private javax.swing.JRadioButton Brush5;
    private javax.swing.JRadioButton Brush6;
    private javax.swing.JRadioButton Brush7;
    private javax.swing.ButtonGroup BrushGroup;
    private javax.swing.JPanel Canvas;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> sizeComboBox;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
