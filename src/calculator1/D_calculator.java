
package calculator1;

import java.awt.Color;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class D_calculator extends javax.swing.JFrame {

    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public D_calculator() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        prod1 = new javax.swing.JPanel();
        equal_botton = new javax.swing.JButton();
        zero_botton = new javax.swing.JButton();
        multi_botton = new javax.swing.JButton();
        div_botton = new javax.swing.JButton();
        add_botton = new javax.swing.JButton();
        minus_botton = new javax.swing.JButton();
        delete_botton = new javax.swing.JButton();
        point_botton = new javax.swing.JButton();
        nine_botton = new javax.swing.JButton();
        one_botton = new javax.swing.JButton();
        two_botton = new javax.swing.JButton();
        three_botton = new javax.swing.JButton();
        four_botton = new javax.swing.JButton();
        five_botton = new javax.swing.JButton();
        six_botton = new javax.swing.JButton();
        seven_botton = new javax.swing.JButton();
        eight_botton = new javax.swing.JButton();
        CE1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_operation = new javax.swing.JLabel();
        txt_result = new javax.swing.JLabel();
        m_d = new javax.swing.JButton();
        X = new javax.swing.JButton();

        jButton12.setText("jButton3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prod1.setBackground(new java.awt.Color(241, 243, 248));
        prod1.setForeground(new java.awt.Color(0, 0, 0));
        prod1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prod1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        equal_botton.setBackground(new java.awt.Color(255, 51, 51));
        equal_botton.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 24)); // NOI18N
        equal_botton.setForeground(new java.awt.Color(204, 204, 0));
        equal_botton.setText("=");
        equal_botton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(1, 1, 1)));
        equal_botton.setBorderPainted(false);
        equal_botton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equal_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal_bottonActionPerformed(evt);
            }
        });
        prod1.add(equal_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 57, 110));

        zero_botton.setBackground(new java.awt.Color(0, 103, 151));
        zero_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        zero_botton.setForeground(new java.awt.Color(51, 51, 51));
        zero_botton.setText("0");
        zero_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_bottonActionPerformed(evt);
            }
        });
        prod1.add(zero_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, 57));

        multi_botton.setBackground(new java.awt.Color(91, 101, 120));
        multi_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        multi_botton.setText("x");
        multi_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi_bottonActionPerformed(evt);
            }
        });
        prod1.add(multi_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, 60, 57));

        div_botton.setBackground(new java.awt.Color(91, 101, 120));
        div_botton.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        div_botton.setText("÷");
        div_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_bottonActionPerformed(evt);
            }
        });
        prod1.add(div_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 57));

        add_botton.setBackground(new java.awt.Color(91, 101, 120));
        add_botton.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        add_botton.setText("+");
        add_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bottonActionPerformed(evt);
            }
        });
        prod1.add(add_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 57));

        minus_botton.setBackground(new java.awt.Color(91, 101, 120));
        minus_botton.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        minus_botton.setText("-");
        minus_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_bottonActionPerformed(evt);
            }
        });
        prod1.add(minus_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, 60, 57));

        delete_botton.setBackground(new java.awt.Color(51, 153, 0));
        delete_botton.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        delete_botton.setForeground(new java.awt.Color(0, 102, 0));
        delete_botton.setText("C");
        delete_botton.setAutoscrolls(true);
        delete_botton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_botton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        delete_botton.setIconTextGap(5);
        delete_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bottonActionPerformed(evt);
            }
        });
        prod1.add(delete_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 57, 100));

        point_botton.setBackground(new java.awt.Color(153, 0, 102));
        point_botton.setFont(new java.awt.Font("Engravers MT", 1, 5)); // NOI18N
        point_botton.setForeground(new java.awt.Color(0, 0, 0));
        point_botton.setText(" ◼");
        point_botton.setActionCommand("");
        point_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point_bottonActionPerformed(evt);
            }
        });
        prod1.add(point_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 30, 40));

        nine_botton.setBackground(new java.awt.Color(0, 103, 151));
        nine_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        nine_botton.setForeground(new java.awt.Color(51, 51, 51));
        nine_botton.setText("9");
        nine_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine_bottonActionPerformed(evt);
            }
        });
        prod1.add(nine_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 50, 55));

        one_botton.setBackground(new java.awt.Color(0, 103, 151));
        one_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        one_botton.setForeground(new java.awt.Color(51, 51, 51));
        one_botton.setText("1");
        one_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_bottonActionPerformed(evt);
            }
        });
        prod1.add(one_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 55));

        two_botton.setBackground(new java.awt.Color(0, 103, 151));
        two_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        two_botton.setForeground(new java.awt.Color(51, 51, 51));
        two_botton.setText("2");
        two_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_bottonActionPerformed(evt);
            }
        });
        prod1.add(two_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 50, 55));

        three_botton.setBackground(new java.awt.Color(0, 103, 151));
        three_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        three_botton.setForeground(new java.awt.Color(51, 51, 51));
        three_botton.setText("3");
        three_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_bottonActionPerformed(evt);
            }
        });
        prod1.add(three_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 50, 55));

        four_botton.setBackground(new java.awt.Color(0, 103, 151));
        four_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        four_botton.setForeground(new java.awt.Color(51, 51, 51));
        four_botton.setText("4");
        four_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_bottonActionPerformed(evt);
            }
        });
        prod1.add(four_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 50, 55));

        five_botton.setBackground(new java.awt.Color(0, 103, 151));
        five_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        five_botton.setForeground(new java.awt.Color(51, 51, 51));
        five_botton.setText("5");
        five_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_bottonActionPerformed(evt);
            }
        });
        prod1.add(five_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 50, 55));

        six_botton.setBackground(new java.awt.Color(0, 103, 151));
        six_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        six_botton.setForeground(new java.awt.Color(51, 51, 51));
        six_botton.setText("6");
        six_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six_bottonActionPerformed(evt);
            }
        });
        prod1.add(six_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 50, 55));

        seven_botton.setBackground(new java.awt.Color(0, 103, 151));
        seven_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        seven_botton.setForeground(new java.awt.Color(51, 51, 51));
        seven_botton.setText("7");
        seven_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_bottonActionPerformed(evt);
            }
        });
        prod1.add(seven_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, 55));

        eight_botton.setBackground(new java.awt.Color(0, 103, 151));
        eight_botton.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        eight_botton.setForeground(new java.awt.Color(51, 51, 51));
        eight_botton.setText("8");
        eight_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight_bottonActionPerformed(evt);
            }
        });
        prod1.add(eight_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 50, 55));

        CE1.setBackground(new java.awt.Color(204, 204, 0));
        CE1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        CE1.setForeground(new java.awt.Color(0, 102, 0));
        CE1.setText("CE");
        CE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CE1ActionPerformed(evt);
            }
        });
        prod1.add(CE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 60, 40));

        getContentPane().add(prod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 350, 310));

        jPanel2.setBackground(new java.awt.Color(141, 147, 171));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        txt_operation.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        txt_operation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_operation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        txt_operation.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_result.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        txt_result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_result.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        m_d.setBackground(new java.awt.Color(0, 102, 102));
        m_d.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        m_d.setText("DARK");
        m_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_dActionPerformed(evt);
            }
        });

        X.setBackground(new java.awt.Color(153, 0, 0));
        X.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        X.setText("x");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_operation, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(txt_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(m_d)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(X))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_d, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_operation, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_result, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void one_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_bottonActionPerformed
        addNumber("1");
         equal_botton.doClick();
    }//GEN-LAST:event_one_bottonActionPerformed

    private void seven_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_bottonActionPerformed
         addNumber("7");
        equal_botton.doClick();
         equal_botton.doClick();
    }//GEN-LAST:event_seven_bottonActionPerformed

    private void equal_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal_bottonActionPerformed
       try{
       String result =  se.eval(txt_operation.getText()).toString();
       txt_result.setText(result);
       } catch (Exception e){
           //delete_botton.doClick();
       }
    }//GEN-LAST:event_equal_bottonActionPerformed

    private void delete_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bottonActionPerformed
        txt_operation.setText("");
        txt_result.setText("");
        
    }//GEN-LAST:event_delete_bottonActionPerformed

    private void three_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_bottonActionPerformed
            addNumber("3");
             equal_botton.doClick();
    }//GEN-LAST:event_three_bottonActionPerformed

    private void two_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_bottonActionPerformed
         addNumber("2");
          equal_botton.doClick();
    }//GEN-LAST:event_two_bottonActionPerformed

    private void four_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_bottonActionPerformed
        addNumber("4");
 equal_botton.doClick();
    }//GEN-LAST:event_four_bottonActionPerformed
       

    private void five_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_bottonActionPerformed
 addNumber("5");
 equal_botton.doClick();
    }//GEN-LAST:event_five_bottonActionPerformed

    private void six_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six_bottonActionPerformed
         addNumber("6");
         equal_botton.doClick();
    }//GEN-LAST:event_six_bottonActionPerformed

    private void eight_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight_bottonActionPerformed
         addNumber("8");
         equal_botton.doClick();
    }//GEN-LAST:event_eight_bottonActionPerformed

    private void nine_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine_bottonActionPerformed
         addNumber("9");
         equal_botton.doClick();
    }//GEN-LAST:event_nine_bottonActionPerformed

    private void minus_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_bottonActionPerformed
         addNumber("-");

    }//GEN-LAST:event_minus_bottonActionPerformed

    private void multi_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi_bottonActionPerformed
          addNumber("*");
    }//GEN-LAST:event_multi_bottonActionPerformed

    private void div_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_bottonActionPerformed
          addNumber("/");
    }//GEN-LAST:event_div_bottonActionPerformed

    private void point_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point_bottonActionPerformed
            addNumber(".");
    }//GEN-LAST:event_point_bottonActionPerformed

    private void add_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bottonActionPerformed
            addNumber("+");
    }//GEN-LAST:event_add_bottonActionPerformed

    private void zero_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_bottonActionPerformed
         addNumber("0");    }//GEN-LAST:event_zero_bottonActionPerformed

    private void CE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CE1ActionPerformed
      
    }//GEN-LAST:event_CE1ActionPerformed

    boolean darkMode = false;
    private void m_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_dActionPerformed
        if (!darkMode){
        prod1.setBackground(Color.decode("#00587A"));
        darkMode = true;
        }
        else {
               D_calculator  frame = new D_calculator();
                this.dispose();
                frame.setVisible(true);
                        
                }
        
    }//GEN-LAST:event_m_dActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        this.dispose();
    }//GEN-LAST:event_XActionPerformed

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
            java.util.logging.Logger.getLogger(D_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new D_calculator().setVisible(true);
            }
        });
    }
    public void addNumber(String digit){
        txt_operation.setText(txt_operation.getText()+digit);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CE1;
    private javax.swing.JButton X;
    private javax.swing.JButton add_botton;
    private javax.swing.JButton delete_botton;
    private javax.swing.JButton div_botton;
    private javax.swing.JButton eight_botton;
    private javax.swing.JButton equal_botton;
    private javax.swing.JButton five_botton;
    private javax.swing.JButton four_botton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton m_d;
    private javax.swing.JButton minus_botton;
    private javax.swing.JButton multi_botton;
    private javax.swing.JButton nine_botton;
    private javax.swing.JButton one_botton;
    private javax.swing.JButton point_botton;
    private javax.swing.JPanel prod1;
    private javax.swing.JButton seven_botton;
    private javax.swing.JButton six_botton;
    private javax.swing.JButton three_botton;
    private javax.swing.JButton two_botton;
    private javax.swing.JLabel txt_operation;
    private javax.swing.JLabel txt_result;
    private javax.swing.JButton zero_botton;
    // End of variables declaration//GEN-END:variables
}
