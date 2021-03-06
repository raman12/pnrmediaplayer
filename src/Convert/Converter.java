package Convert;


import Capture.AudioCapture;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.MediaLocator;
import javax.swing.JFileChooser;

public class Converter extends javax.swing.JPanel {
    
    /** Creates new form Converter */
    public Converter() {
      //convert=new FormatConverter();
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTextField1.setForeground(new java.awt.Color(53, 104, 195));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton1.setForeground(new java.awt.Color(53, 104, 195));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTextField2.setForeground(new java.awt.Color(53, 104, 195));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton2.setForeground(new java.awt.Color(53, 104, 195));
        jButton2.setText("Destination");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton3.setForeground(new java.awt.Color(53, 104, 195));
        jButton3.setText("Convert");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if(flag_input&&flag_output){
        s1=new String(fileobj1.getPath());
        s1="file:/"+s1+".mp3";
         try {
            
            url1=fileobj2.toURL();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        
        //medialocator=new MediaLocator(url);
        try {
            url2=fileobj1.toURL();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        convert=new FormatConverter(url1,new MediaLocator(s1),flag);
        flag_input=false;flag_output=false;
      }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jfilechooser2=new JFileChooser();
        int result=jfilechooser2.showSaveDialog(null);
        jfilechooser2.setMultiSelectionEnabled(false);
        fileobj1=jfilechooser2.getSelectedFile();
        
        if(result==jfilechooser2.APPROVE_OPTION){
            jTextField2.setText(fileobj1.getPath());
            flag_output=true;
            
        }else if(result==jfilechooser2.CANCEL_OPTION){
            jTextField2.setText("No Files to Convert");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jfilechooser3=new JFileChooser();
        int result = jfilechooser3.showOpenDialog(null);
        jfilechooser3.setMultiSelectionEnabled(false);
        fileobj2=jfilechooser3.getSelectedFile();
        if(result==jfilechooser3.APPROVE_OPTION){
            jTextField1.setText(fileobj2.getPath());
            flag_input=true;
        }else if(result==jfilechooser3.CANCEL_OPTION){
            jTextField1.setText("No Files ");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private String s7;
    private FormatConverter convert;
    private JFileChooser jfilechooser4;
    private int flag=1;
    private URL url1,url2;
    private URL url7;
    private URL url4;
    private long seconds;
    private long  mb;
    private File fileobj1,fileobj2;
    private File fileobj4;
    private int flags=0;
    private String s1,s2,s3,s4;
    private String s[];
//    private Transmitting transmit2;
//    private Receiving  receive;
    private JFileChooser jfilechooser1,jfilechooser2,jfilechooser3;
    private AudioCapture audiocapture;
    private boolean flag_input=false,flag_output=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
}

