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
/**
 *
 * @author vukhu
 */
public class DictionaryForm extends javax.swing.JFrame {
    Dictionary dictionary ;
    private static final String VOICEMAN="kevin16";
    
    public DictionaryForm() {
        initComponents();
        dictionary = new Dictionary();
        LoadListWord(dictionary.listWord);
    }
    
//-------------------------------------ĐỒ HỌA-------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSpeak = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSpellingAdd = new javax.swing.JTextField();
        txtExplainAdd = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JlstWord = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArListWord = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(0, 204, 153));
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setLocation(new java.awt.Point(200, 200));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Spelling:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Explaing:");

        btnSpeak.setBackground(new java.awt.Color(51, 51, 51));
        btnSpeak.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\dictionarynewversion1\\Image\\icons8-speaker-filled-30.png")); // NOI18N
        btnSpeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeakActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(51, 51, 51));
        btnEdit.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\dictionarynewversion1\\Image\\icons8-pencil-50.png")); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(51, 51, 51));
        btnXoa.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\dictionarynewversion1\\Image\\icons8-empty-trash-50.png")); // NOI18N
        btnXoa.setBorder(null);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 51, 51));
        btnAdd.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\dictionarynewversion1\\Image\\icons8-plus-40.png")); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 0));
        jLabel6.setText("Dictionary English-Vietnamess");

        txtSpellingAdd.setBackground(new java.awt.Color(0, 153, 153));
        txtSpellingAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSpellingAddKeyPressed(evt);
            }
        });

        txtExplainAdd.setBackground(new java.awt.Color(0, 153, 153));
        txtExplainAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExplainAddKeyPressed(evt);
            }
        });

        txtSearch.setBackground(new java.awt.Color(0, 153, 153));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        JlstWord.setBackground(new java.awt.Color(0, 153, 153));
        JlstWord.setDoubleBuffered(true);
        JlstWord.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JlstWordValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JlstWord);

        txtArListWord.setBackground(new java.awt.Color(0, 153, 153));
        txtArListWord.setColumns(20);
        txtArListWord.setRows(5);
        jScrollPane2.setViewportView(txtArListWord);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnSpeak, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExplainAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpellingAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSpeak, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtSearch))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSpellingAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtExplainAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//------------------------------------------------------------------------------------
    
    private void LoadListWord(LinkedList<Word> listWord)
    {
        DefaultListModel dml = new DefaultListModel();
        int i=0;
        //dictionary.QuickSort(listWord, 0, listWord.size()-1);
        for(Word item: listWord)
            dml.addElement(item.getSpelling());
        JlstWord.setModel(dml);
    }
    
    private void txtSpellingAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSpellingAddKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            txtExplainAdd.requestFocus();
        }
    }//GEN-LAST:event_txtSpellingAddKeyPressed

    private void txtExplainAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExplainAddKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            if(dictionary.Add(txtSpellingAdd.getText(), txtExplainAdd.getText()))
            {
                JOptionPane.showMessageDialog(null, "Add success", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            JOptionPane.showMessageDialog(null, "Add failed", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            LoadListWord(dictionary.listWord);
        }
    }//GEN-LAST:event_txtExplainAddKeyPressed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(evt.getKeyChar()== KeyEvent.VK_ENTER)
        {
            LinkedList<Word> listSearch = dictionary.SearchKeyWord(txtSearch.getText());

            if (listSearch.size() == 0) {
                //LoadListWord(dictionary.listWord, lstWord);
                JOptionPane.showMessageDialog(null, "Không tìm thấy", "Message", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            LoadListWord(listSearch);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(dictionary.SearchKeyWord(txtSearch.getText())!=null)
        {
            LinkedList<Word> listSearch = dictionary.SearchKeyWord(txtSearch.getText());
            LoadListWord(listSearch);
        }
        else
        {
            LinkedList<Word> listSearch = new LinkedList<>();
            Word w = new Word("Không tìm thấy từ","a");
            listSearch.add(w);
            LoadListWord(listSearch);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(dictionary.Add(txtSpellingAdd.getText(), txtExplainAdd.getText()))
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
         String spelling = JlstWord.getSelectedValue().toString();
        String explain = txtArListWord.getText();
        if(dictionary.Edit(spelling, explain))
        {
            JOptionPane.showMessageDialog(null, "Edit success", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null, "Edit failed", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        LoadListWord(dictionary.listWord);
    }//GEN-LAST:event_btnEditActionPerformed

    private void JlstWordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JlstWordValueChanged
        String a = JlstWord.getSelectedValue().toString();
        LinkedList<Word> listSearch = dictionary.SearchKeyWord(a);
        for(Word item: listSearch)
        {
            if(item.getSpelling().equals(a))
            {
                txtArListWord.setText(item.getExplain());
                return;
            }
        }
    }//GEN-LAST:event_JlstWordValueChanged

    private void btnSpeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeakActionPerformed
        VoiceManager vm=VoiceManager.getInstance();
        Voice v;
        v = vm.getVoice(VOICEMAN);
        v.allocate();
        try{
            v.speak(JlstWord.getSelectedValue().toString());
        }catch(Exception e){}
        v.deallocate();
    }//GEN-LAST:event_btnSpeakActionPerformed

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
    private javax.swing.JButton btnSpeak;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtArListWord;
    private javax.swing.JTextField txtExplainAdd;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSpellingAdd;
    // End of variables declaration//GEN-END:variables
}
