/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author PrasadYeole
 */
public class playmedium11 extends javax.swing.JFrame {

    /**
     * Creates new form playmedium
     */
    public playmedium11() {
        initComponents();
        //this.setResizable(false);
        
    }
int cnt=0;
    public void check(){
        
      
         if(jButton1.getIcon()==ic1 && jButton2.getIcon()==ic2 && jButton3.getIcon()==ic3 && 
   jButton4.getIcon()==ic4 && jButton5.getIcon()==ic5 && jButton6.getIcon()==ic6 &&
   jButton7.getIcon()==ic7 && jButton8.getIcon()==ic8 && jButton9.getIcon()==ic9 && jButton10.getIcon()==ic10 &&
   jButton11.getIcon()==ic11 && jButton12.getIcon()==ic12 && jButton13.getIcon()==ic13 && jButton14.getIcon()==ic14 &&
   jButton15.getIcon()==ic15 && jButton16.getIcon()==null ){
        
             jLabel1.setVisible(false);
             jPanel2.setVisible(false);
             jLabel2.setVisible(true);
             jLabel3.setVisible(true);
             jButton17.setVisible(true);
             
             String count=Integer.toString(cnt);
             jLabel2.setText(count);
         
         }
    }
      public void count(){
            
             String count=Integer.toString(cnt);
             jLabel1.setText(count);
        }
        
        
Icon ic1=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman00.jpg"));
Icon ic2=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman01.jpg"));
Icon ic3=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman02.jpg"));
Icon ic4=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman03.jpg"));
Icon ic5=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman10.jpg"));
Icon ic6=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman11.jpg"));
Icon ic7=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman12.jpg"));
Icon ic8=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman13.jpg"));
Icon ic9=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman20.jpg"));
Icon ic10=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman21.jpg"));
Icon ic11=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman22.jpg"));
Icon ic12=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman23.jpg"));
Icon ic13=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman30.jpg"));
Icon ic14=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman31.jpg"));
Icon ic15=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman32.jpg"));
//Icon ic16=new ImageIcon(playmedium11.class.getResource("/spidermanpuzzle/sman33.jpg"));    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(680, 580, 0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jPanel2.setLayout(new java.awt.GridLayout(4, 4));

        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton1.setIcon(ic2);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton2.setIcon(ic4);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton3.setIcon(ic6);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton4.setIcon(ic8);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton5.setIcon(ic10);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton6.setIcon(ic12);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton7.setIcon(ic14);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton8.setIcon(ic15);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton9.setIcon(ic1);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton10.setIcon(ic3);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);

        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton11.setIcon(ic5);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);

        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton12.setIcon(ic7);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);

        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton13.setIcon(ic9);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);

        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton14.setIcon(ic11);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton16.setIcon(ic13);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 520, 520);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("0");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(590, 110, 270, 200);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setVisible(false);
        jLabel2.setText("0");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 290, 500, 180);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("CONGRACTS YOU WIN YOUR SCORE ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 150, 520, 30);

        jButton19.setBackground(new java.awt.Color(51, 255, 255));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 204));
        jButton19.setText("QUIT");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(770, 20, 110, 110);

        jButton17.setBackground(new java.awt.Color(51, 255, 255));
        jButton17.setVisible(false);
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 204));
        jButton17.setText("MENU");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(760, 410, 110, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sidebg1.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 900, 540);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 540);

        setSize(new java.awt.Dimension(908, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jButton2.getIcon()==null){
           Icon temp = jButton1.getIcon();
           jButton2.setIcon(temp);
           jButton1.setIcon(null);
        }
        else  if(jButton5.getIcon()==null){
           Icon temp = jButton1.getIcon();
           jButton5.setIcon(temp);
           jButton1.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jButton3.getIcon()==null){
           Icon temp = jButton4.getIcon();
           jButton3.setIcon(temp);
           jButton4.setIcon(null);
        }
        else  if(jButton8.getIcon()==null){
           Icon temp = jButton4.getIcon();
           jButton8.setIcon(temp);
           jButton4.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         if(jButton9.getIcon()==null){
           Icon temp = jButton13.getIcon();
           jButton9.setIcon(temp);
           jButton13.setIcon(null);
        }
        else  if(jButton14.getIcon()==null){
           Icon temp = jButton13.getIcon();
           jButton14.setIcon(temp);
           jButton13.setIcon(null);
        }
         count();    check();    cnt++;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        
         if(jButton14.getIcon()==null){
           Icon temp = jButton15.getIcon();
           jButton14.setIcon(temp);
           jButton15.setIcon(null);
        }
        else  if(jButton11.getIcon()==null){
           Icon temp = jButton15.getIcon();
           jButton11.setIcon(temp);
           jButton15.setIcon(null);
        }
          else  if(jButton16.getIcon()==null){
           Icon temp = jButton15.getIcon();
           jButton16.setIcon(temp);
           jButton15.setIcon(null);
        }
         
        
        
          cnt++;
          count();    check();  
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
         if(jButton12.getIcon()==null){
           Icon temp = jButton16.getIcon();
           jButton12.setIcon(temp);
           jButton16.setIcon(null);
        }
        else  if(jButton15.getIcon()==null){
           Icon temp = jButton16.getIcon();
           jButton15.setIcon(temp);
           jButton16.setIcon(null);
        }
        
      cnt++;  count();    check();    
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
         if(jButton13.getIcon()==null){
           Icon temp = jButton14.getIcon();
           jButton13.setIcon(temp);
           jButton14.setIcon(null);
        }
        else  if(jButton10.getIcon()==null){
           Icon temp = jButton14.getIcon();
           jButton10.setIcon(temp);
           jButton14.setIcon(null);
        }
         
        else  if(jButton15.getIcon()==null){
           Icon temp = jButton14.getIcon();
           jButton15.setIcon(temp);
           jButton14.setIcon(null);
        }
         count();    check();    cnt++;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        if(jButton11.getIcon()==null){
           Icon temp = jButton12.getIcon();
           jButton11.setIcon(temp);
           jButton12.setIcon(null);
        }
        else if(jButton8.getIcon()==null){
           Icon temp = jButton12.getIcon();
           jButton8.setIcon(temp);
           jButton12.setIcon(null);
        }
        else if(jButton16.getIcon()==null){
           Icon temp = jButton12.getIcon();
           jButton16.setIcon(temp);
           jButton12.setIcon(null);
        }
          cnt++;
        count();    check();  
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(jButton7.getIcon()==null){
           Icon temp = jButton11.getIcon();
           jButton7.setIcon(temp);
           jButton11.setIcon(null);
        }
        else if(jButton10.getIcon()==null){
           Icon temp = jButton11.getIcon();
           jButton10.setIcon(temp);
           jButton11.setIcon(null);
        }
        else  if(jButton12.getIcon()==null){
           Icon temp = jButton11.getIcon();
           jButton12.setIcon(temp);
           jButton11.setIcon(null);
        }
        else if(jButton15.getIcon()==null){
           Icon temp = jButton11.getIcon();
           jButton15.setIcon(temp);
           jButton11.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         if(jButton6.getIcon()==null){
           Icon temp = jButton10.getIcon();
           jButton6.setIcon(temp);
           jButton10.setIcon(null);
        }
        else if(jButton9.getIcon()==null){
           Icon temp = jButton10.getIcon();
           jButton9.setIcon(temp);
           jButton10.setIcon(null);
        }
        else if(jButton11.getIcon()==null){
           Icon temp = jButton10.getIcon();
           jButton11.setIcon(temp);
           jButton10.setIcon(null);
        }
        else if(jButton14.getIcon()==null){
           Icon temp = jButton10.getIcon();
           jButton14.setIcon(temp);
           jButton10.setIcon(null);
        }
         count();    check();    cnt++;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(jButton5.getIcon()==null){
           Icon temp = jButton9.getIcon();
           jButton5.setIcon(temp);
           jButton9.setIcon(null);
        }
        else if(jButton10.getIcon()==null){
           Icon temp = jButton9.getIcon();
           jButton10.setIcon(temp);
           jButton9.setIcon(null);
        }
        else if(jButton13.getIcon()==null){
           Icon temp = jButton9.getIcon();
           jButton13.setIcon(temp);
           jButton9.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(jButton1.getIcon()==null){
           Icon temp = jButton5.getIcon();
           jButton1.setIcon(temp);
           jButton5.setIcon(null);
        }
        else if(jButton6.getIcon()==null){
           Icon temp = jButton5.getIcon();
           jButton6.setIcon(temp);
           jButton5.setIcon(null);
        }
        else if(jButton9.getIcon()==null){
           Icon temp = jButton5.getIcon();
           jButton9.setIcon(temp);
           jButton5.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(jButton2.getIcon()==null){
           Icon temp = jButton6.getIcon();
           jButton2.setIcon(temp);
           jButton6.setIcon(null);
        }
        else if(jButton5.getIcon()==null){
           Icon temp = jButton6.getIcon();
           jButton5.setIcon(temp);
           jButton6.setIcon(null);
        }
        else if(jButton7.getIcon()==null){
           Icon temp = jButton6.getIcon();
           jButton7.setIcon(temp);
           jButton6.setIcon(null);
        }
        else if(jButton10.getIcon()==null){
           Icon temp = jButton6.getIcon();
           jButton10.setIcon(temp);
           jButton6.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(jButton11.getIcon()==null){
           Icon temp = jButton7.getIcon();
           jButton11.setIcon(temp);
           jButton7.setIcon(null);
        }
        else if(jButton3.getIcon()==null){
           Icon temp = jButton7.getIcon();
           jButton3.setIcon(temp);
           jButton7.setIcon(null);
        }
        else if(jButton6.getIcon()==null){
           Icon temp = jButton7.getIcon();
           jButton6.setIcon(temp);
           jButton7.setIcon(null);
        }
        else if(jButton8.getIcon()==null){
           Icon temp = jButton7.getIcon();
           jButton8.setIcon(temp);
           jButton7.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(jButton4.getIcon()==null){
           Icon temp = jButton8.getIcon();
           jButton4.setIcon(temp);
           jButton8.setIcon(null);
        }
        else if(jButton7.getIcon()==null){
           Icon temp = jButton8.getIcon();
           jButton7.setIcon(temp);
           jButton8.setIcon(null);
        }
        else if(jButton12.getIcon()==null){
           Icon temp = jButton8.getIcon();
           jButton12.setIcon(temp);
           jButton8.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jButton2.getIcon()==null){
           Icon temp = jButton3.getIcon();
           jButton2.setIcon(temp);
           jButton3.setIcon(null);
        }
        else if(jButton4.getIcon()==null){
           Icon temp = jButton3.getIcon();
           jButton4.setIcon(temp);
           jButton3.setIcon(null);
        }
        else if(jButton7.getIcon()==null){
           Icon temp = jButton3.getIcon();
           jButton7.setIcon(temp);
           jButton3.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jButton1.getIcon()==null){
           Icon temp = jButton2.getIcon();
           jButton1.setIcon(temp);
           jButton2.setIcon(null);
        }
        else if(jButton3.getIcon()==null){
           Icon temp = jButton2.getIcon();
           jButton3.setIcon(temp);
           jButton2.setIcon(null);
        }
        else if(jButton6.getIcon()==null){
           Icon temp = jButton2.getIcon();
           jButton6.setIcon(temp);
           jButton2.setIcon(null);
        }
        count();    check();    cnt++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(new java.awt.Color(255, 255, 2));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        MYproject mp=new MYproject();
        mp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton17ActionPerformed

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
            java.util.logging.Logger.getLogger(playmedium11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playmedium11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playmedium11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playmedium11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playmedium11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
