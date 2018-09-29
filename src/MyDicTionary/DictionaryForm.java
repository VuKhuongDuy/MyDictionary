/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyDicTionary;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
//import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.*;
import java.awt.event.WindowAdapter;
import javax.swing.JDialog;
import com.darkprograms.speech.translator.GoogleTranslate;
import javafx.scene.layout.Border;
/**
 *
 * @author vukhu
 */
public class DictionaryForm extends javax.swing.JFrame {
    Dictionary dictionary ;
    Boolean Internet=false;
  
    public DictionaryForm() {        
        initComponents();
        KiemTraInternet();
        dictionary = new Dictionary();
        LoadListWord(dictionary.listWord);
    }
    
//-------------------------------------ĐỒ HỌA-------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSpeakFast = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JlstWord = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArListWord = new javax.swing.JTextArea();
        btnSpeakSlow = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(0, 204, 153));
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setLocation(new java.awt.Point(200, 200));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnSpeakFast.setBackground(new java.awt.Color(102, 102, 102));
        btnSpeakFast.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-speaker-30.png")); // NOI18N
        btnSpeakFast.setBorder(null);
        btnSpeakFast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeakFastActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-pencil-50.png")); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(102, 102, 102));
        btnXoa.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-empty-trash-50.png")); // NOI18N
        btnXoa.setBorder(null);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 102, 102));
        btnAdd.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-plus-40.png")); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 0));
        jLabel6.setText("Dictionary English-Vietnamess");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        JlstWord.setBackground(new java.awt.Color(204, 204, 204));
        JlstWord.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        JlstWord.setDoubleBuffered(true);
        JlstWord.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JlstWordValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JlstWord);

        txtArListWord.setBackground(new java.awt.Color(204, 204, 204));
        txtArListWord.setColumns(20);
        txtArListWord.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        txtArListWord.setRows(5);
        jScrollPane2.setViewportView(txtArListWord);

        btnSpeakSlow.setBackground(new java.awt.Color(102, 102, 102));
        btnSpeakSlow.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-speaker-filled-30.png")); // NOI18N
        btnSpeakSlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeakSlowActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSpeakFast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSpeakSlow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpeakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpeakSlow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//------------------------------------------------------------------------------------
    private void KiemTraInternet(){
        try{
            GoogleTranslate.translate("vi", "hello");
            Internet=true;
            btnSpeakSlow.setEnabled(true);
        }catch(Exception e){ 
            Internet=false;
            btnSpeakSlow.setEnabled(false);
        }
    }
    
    private void LoadListWord(LinkedList<Word> listWord)
    {
        DefaultListModel dml = new DefaultListModel();
        int i=0;
        //dictionary.QuickSort(listWord, 0, listWord.size()-1);
        for(Word item: listWord)
            dml.addElement(item.getSpelling());
        JlstWord.setModel(dml);
    }
    
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(dictionary.SearchKeyWord(txtSearch.getText())!=null)
        {
            LinkedList<Word> listSearch = dictionary.SearchKeyWord(txtSearch.getText());
            LoadListWord(listSearch);
        }
        else
        {
            txtArListWord.setText(dictionary.translateByGoogle(txtSearch.getText()));
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(dictionary.Add(txtSearch.getText(), txtArListWord.getText()))
        {
            JOptionPane.showMessageDialog(null, "Add success", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null, "Add failed", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        LoadListWord(dictionary.listWord);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       String spelling = JlstWord.getSelectedValue().toString();
        if(dictionary.Delete(spelling))
        {
            JOptionPane.showMessageDialog(null, "Delete success", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null, "Delete failed", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        LoadListWord(dictionary.listWord);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         String spelling = txtSearch.getText();
        String explain = txtArListWord.getText();
        if(spelling.length()>0 && dictionary.Edit(spelling, explain))
        {
            JOptionPane.showMessageDialog(null, "Edit success", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null, "Edit failed", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        LoadListWord(dictionary.listWord);
    }//GEN-LAST:event_btnEditActionPerformed

    private void JlstWordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JlstWordValueChanged
        KiemTraInternet();
        String a = JlstWord.getSelectedValue().toString();
        txtSearch.setText(a);
        LinkedList<Word> listSearch = dictionary.SearchKeyWord(a);
        if(!Internet)
            for(Word item: listSearch)
            {
                if(item.getSpelling().equals(a))
                {
                    txtArListWord.setText(item.getExplain());
                    return;
                }
            }
        else
            txtArListWord.setText(dictionary.translateByGoogle(a));
    }//GEN-LAST:event_JlstWordValueChanged

    private void btnSpeakFastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeakFastActionPerformed
        KiemTraInternet();
        if(!Internet)
        {
            final String VOICEMAN="kevin16";
            VoiceManager vm=VoiceManager.getInstance();
            Voice v;
            v = vm.getVoice(VOICEMAN);
            v.allocate();
            try{
                v.speak(JlstWord.getSelectedValue().toString());
            }catch(Exception e){}
            v.deallocate();
        }
        else{
            dictionary.Speak(JlstWord.getSelectedValue().toString(),1);
        }
    }//GEN-LAST:event_btnSpeakFastActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(evt.getKeyChar()== KeyEvent.VK_ENTER)
        {
            LinkedList<Word> listSearch = dictionary.SearchKeyWord(txtSearch.getText());

            if (listSearch.size() == 0) {
                //LoadListWord(dictionary.listWord, lstWord);
                txtArListWord.setText(dictionary.translateByGoogle(txtSearch.getText()));
                return;
            }

            LoadListWord(listSearch);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSpeakSlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeakSlowActionPerformed
         KiemTraInternet();
        if(!Internet)
        {
            final String VOICEMAN="kevin16";
            VoiceManager vm=VoiceManager.getInstance();
            Voice v;
            v = vm.getVoice(VOICEMAN);
            v.allocate();
            try{
                v.speak(JlstWord.getSelectedValue().toString());
            }catch(Exception e){}
            v.deallocate();
        }
        else{
            dictionary.Speak(JlstWord.getSelectedValue().toString(),0.5);
        }
    }//GEN-LAST:event_btnSpeakSlowActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryForm().setVisible(true);
            }
        });
        
        
//        LinkedList<Word> listSearch = dictionary.SearchKeyWord("");
//        dictionary.PrintList(listSearch);
        //Boolean c = dictionary.Edit("anyone", "bất kìa ai");
        //System.out.println(c);
        //dictionary.Add(spelling, explain)
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlstWord;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSpeakFast;
    private javax.swing.JButton btnSpeakSlow;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtArListWord;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
