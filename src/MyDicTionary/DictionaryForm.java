/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyDicTionary;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.*;
import com.darkprograms.speech.translator.GoogleTranslate;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.Map;
/**
 *
 * @author vukhu
 */
public class DictionaryForm extends javax.swing.JFrame {
    Dictionary dictionary ;
    Boolean Internet=false;
    String language;
  
    public DictionaryForm() {        
        initComponents();
        
        buttonGroup2.add(RBtnOffline);
        buttonGroup2.add(RBtnOnline);
        txtArListWord.setLineWrap(true);
        txtArListWord.setWrapStyleWord(true);
        
        dictionary = new Dictionary(LoaiTuDien());
        LoadListWord(dictionary.listWord);
    }
    
//-------------------------------------ĐỒ HỌA-------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        btnSpeakFast = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JlstWord = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArListWord = new javax.swing.JTextArea();
        btnSpeakSlow = new javax.swing.JButton();
        RBtnVA = new javax.swing.JRadioButton();
        RBtnAV = new javax.swing.JRadioButton();
        txtEdit = new javax.swing.JTextField();
        RBtnOffline = new javax.swing.JRadioButton();
        RBtnOnline = new javax.swing.JRadioButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setLocation(new java.awt.Point(200, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        btnSpeakFast.setBackground(new java.awt.Color(255, 153, 51));
        btnSpeakFast.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-speaker-30.png")); // NOI18N
        btnSpeakFast.setBorder(null);
        btnSpeakFast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeakFastActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 153, 51));
        btnEdit.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-pencil-40.png")); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 153, 51));
        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-full-trash-40.png")); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 153, 51));
        btnAdd.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-plus-40.png")); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel6.setText("Dictionary English-Vietnamess");

        txtSearch.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search...");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
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
        JlstWord.setAutoscrolls(false);
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
        txtArListWord.setAutoscrolls(false);
        jScrollPane2.setViewportView(txtArListWord);

        btnSpeakSlow.setBackground(new java.awt.Color(255, 153, 51));
        btnSpeakSlow.setIcon(new javax.swing.ImageIcon("D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\Image\\icons8-speaker-filled-30.png")); // NOI18N
        btnSpeakSlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeakSlowActionPerformed(evt);
            }
        });

        RBtnVA.setBackground(new java.awt.Color(204, 204, 204));
        RBtnVA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RBtnVA.setText("Việt-Anh");
        RBtnVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnVAActionPerformed(evt);
            }
        });

        RBtnAV.setBackground(new java.awt.Color(204, 204, 204));
        RBtnAV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RBtnAV.setSelected(true);
        RBtnAV.setText("Anh-Việt");
        RBtnAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnAVActionPerformed(evt);
            }
        });

        txtEdit.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        txtEdit.setForeground(new java.awt.Color(153, 153, 153));
        txtEdit.setText("Edit...");
        txtEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEditFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEditFocusLost(evt);
            }
        });

        RBtnOffline.setBackground(new java.awt.Color(204, 204, 204));
        RBtnOffline.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RBtnOffline.setSelected(true);
        RBtnOffline.setText("Offline");
        RBtnOffline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnOfflineActionPerformed(evt);
            }
        });

        RBtnOnline.setBackground(new java.awt.Color(204, 204, 204));
        RBtnOnline.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RBtnOnline.setText("Online");
        RBtnOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnOnlineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearch)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEdit)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(RBtnAV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RBtnVA)
                        .addGap(77, 77, 77)
                        .addComponent(RBtnOffline)
                        .addGap(70, 70, 70)
                        .addComponent(RBtnOnline)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSpeakFast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSpeakSlow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBtnAV)
                    .addComponent(RBtnVA)
                    .addComponent(RBtnOffline)
                    .addComponent(RBtnOnline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpeakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpeakSlow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//------------------------------------------------------------------------------------
    private String LoaiTuDien(){
        buttonGroup1.add(RBtnAV);
        buttonGroup1.add(RBtnVA);
        if(RBtnAV.isSelected())
        {
            language="vi";
           return "Anh-Viet" ;
        }
        language="en";
        return "Viet-Anh";
        //if(RBtnAV.)
    }
    
    private void KiemTraInternet(){
        try{
            GoogleTranslate.translate("vi", "hello");
            Internet=true;
            RBtnOnline.setSelected(true);
            btnSpeakSlow.setEnabled(true);
        }catch(IOException e){ 
            Internet=false;
            RBtnOffline.setSelected(true);
            btnSpeakSlow.setEnabled(false);
        }
    }
    
    private void LoadListWord(Map<String,String> listWord)
    {
        DefaultListModel dml = new DefaultListModel();
        //dictionary.QuickSort(listWord, 0, listWord.size()-1);
        for(String key:listWord.keySet())
            dml.addElement(key);
        JlstWord.setModel(dml);
    }
    
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
            if(dictionary.search(txtSearch.getText())!=null)
            {
                Map<String,String> listSearch = dictionary.search(txtSearch.getText());
                LoadListWord(listSearch);
            }
            else
                txtArListWord.setText(dictionary.translateByGoogle(language,txtSearch.getText()));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String spelling = JOptionPane.showInputDialog(rootPane,"Spelling: ");
        if(spelling!=null)
        {
            String explain = JOptionPane.showInputDialog(rootPane,"Explain: ");
            if(explain!=null)
            {
                if(dictionary.add(spelling, explain))
                    JOptionPane.showMessageDialog(null, "Add success", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Add failed", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                LoadListWord(dictionary.listWord);
            }
        }        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       String spelling = JlstWord.getSelectedValue();
        if(dictionary.delete(spelling))
            JOptionPane.showMessageDialog(null, "Delete success", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Delete failed", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        LoadListWord(dictionary.listWord);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String spelling = txtEdit.getText();
        String explain = txtArListWord.getText();
        if(spelling.length()>0 && dictionary.edit(JlstWord.getSelectedValue().toString(),spelling, explain))
        {
            JOptionPane.showMessageDialog(null, "Edit success", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null, "Edit failed", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        LoadListWord(dictionary.listWord);
    }//GEN-LAST:event_btnEditActionPerformed

    private void JlstWordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JlstWordValueChanged
        String a = JlstWord.getSelectedValue();
        txtEdit.setText(a);
        txtEdit.setForeground(Color.BLACK);
        Font font = new Font(("Tahoma"),Font.PLAIN,13);
        txtEdit.setFont(font);
        Map<String,String> listSearch = dictionary.search(a);
        if(!Internet)
            for(String key:listSearch.keySet())
            {
                if(key.equals(a))
                {
                    txtArListWord.setText(listSearch.get(key));
                    return;
                }
            }
        else
            txtArListWord.setText(dictionary.translateByGoogle(language,a));
    }//GEN-LAST:event_JlstWordValueChanged

    private void btnSpeakFastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeakFastActionPerformed
        //KiemTraInternet();
        if(!Internet)
        {
            //System.setProperty("mbrola.base", "D:\\Hoc_Tap\\Lap_Trinh\\JAVA\\MyDictionary\\freetts-1.2.2-bin\\freetts-1.2");
            final String VOICEMAN="kevin16";
            VoiceManager vm=VoiceManager.getInstance();
            Voice v;
            //v = vm.getVoice("mbrola_us1");
            v=vm.getVoice(VOICEMAN);
            v.allocate();
            try{
                if(JlstWord.getSelectedIndex()!=0)
                    v.speak(JlstWord.getSelectedValue());
                else if(txtSearch.getText()!=null)
                    v.speak(txtSearch.getText());
            }catch(Exception e){}
            v.deallocate();
        }
        else{
            dictionary.speak(JlstWord.getSelectedValue(),1);
        }
    }//GEN-LAST:event_btnSpeakFastActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(evt.getKeyChar()== KeyEvent.VK_ENTER)
        {
            Map<String,String> listSearch = dictionary.search(txtSearch.getText());

            if (listSearch.isEmpty()) {
                txtArListWord.setText(dictionary.translateByGoogle(language,txtSearch.getText()));
                return;
            }

            LoadListWord(listSearch);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSpeakSlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeakSlowActionPerformed
         //KiemTraInternet();
        if(!Internet)
        {
            final String VOICEMAN="kevin16";
            VoiceManager vm=VoiceManager.getInstance();
            Voice v;
            v = vm.getVoice(VOICEMAN);
            v.allocate();
            try{
                if(JlstWord.getSelectedIndex()!=0)
                    v.speak(JlstWord.getSelectedValue());
                else if(txtSearch.getText().length()>0)
                    v.speak(txtSearch.getText());
            }catch(Exception e){}
            v.deallocate();
        }
        else{
            dictionary.speak(JlstWord.getSelectedValue(),0.5);
        }
    }//GEN-LAST:event_btnSpeakSlowActionPerformed

    private void RBtnAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnAVActionPerformed
        dictionary.ghiFile();
        dictionary = new Dictionary(LoaiTuDien());
        LoadListWord(dictionary.listWord);
    }//GEN-LAST:event_RBtnAVActionPerformed

    private void RBtnVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnVAActionPerformed
        dictionary.ghiFile();
        dictionary = new Dictionary(LoaiTuDien());
        LoadListWord(dictionary.listWord);
    }//GEN-LAST:event_RBtnVAActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dictionary.ghiFile();
//        int close = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát?", "Thoát",JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
//        if(close==0)
//        {
//            this.setVisible(true);
//        }
    }//GEN-LAST:event_formWindowClosing

    private void txtEditFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditFocusGained
        if(txtEdit.getText().equals("Edit..."))
        {
            txtEdit.setText("");
            txtEdit.setForeground(Color.BLACK);
            Font font = new Font(("Tahoma"),Font.PLAIN,13);
            txtEdit.setFont(font);
        }
    }//GEN-LAST:event_txtEditFocusGained

    private void txtEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditFocusLost
        if(txtEdit.getText().length()==0)
        {
            txtEdit.setText("Edit...");
            txtEdit.setForeground(Color.GRAY);
            Font font = new Font(("Tahoma"),Font.ITALIC,13);
            txtEdit.setFont(font);
        }
    }//GEN-LAST:event_txtEditFocusLost

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if(txtSearch.getText().equals("Search...")){
            txtSearch.setText("");
            txtSearch.setForeground(Color.BLACK);
            Font font = new Font(("Tahoma"),Font.PLAIN,13);
            txtSearch.setFont(font);
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if(txtSearch.getText().length()==0)
        {
            txtSearch.setText("Search...");
            txtSearch.setForeground(Color.GRAY);
            Font font = new Font(("Tahoma"),Font.ITALIC,13);
            txtSearch.setFont(font);
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void RBtnOfflineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnOfflineActionPerformed
        Internet=false;
    }//GEN-LAST:event_RBtnOfflineActionPerformed

    private void RBtnOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnOnlineActionPerformed
        this.KiemTraInternet();
        if(Internet==false)
        {
            JOptionPane.showMessageDialog(null, "Không có internet", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_RBtnOnlineActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new DictionaryForm().setVisible(true);
        });
        
        
//        LinkedList<Word> listSearch = dictionary.SearchKeyWord("");
//        dictionary.PrintList(listSearch);
        //Boolean c = dictionary.Edit("anyone", "bất kìa ai");
        //System.out.println(c);
        //dictionary.Add(spelling, explain)
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlstWord;
    private javax.swing.JRadioButton RBtnAV;
    private javax.swing.JRadioButton RBtnOffline;
    private javax.swing.JRadioButton RBtnOnline;
    private javax.swing.JRadioButton RBtnVA;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSpeakFast;
    private javax.swing.JButton btnSpeakSlow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtArListWord;
    private javax.swing.JTextField txtEdit;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
