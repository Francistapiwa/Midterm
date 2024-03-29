

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import midterm.CityForm;
import midterm.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

   public class PatientForm extends javax.swing.JPanel implements ActionListener{

        private String imagePath;
         private JTextField nameField;
        private JTextField ageField;
        private JComboBox<String> genderComboBox;
        private JTextArea conditionTextArea;
        private JLabel referenceLabel;
    
        
       

    /**
     * Creates new form PatientForm
     */
    public PatientForm() {
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

        gendergroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        postlabel = new javax.swing.JLabel();
        agelabel = new javax.swing.JLabel();
        emergencylabel = new javax.swing.JLabel();
        phonelabel = new javax.swing.JLabel();
        encountlabel = new javax.swing.JLabel();
        patientlabel = new javax.swing.JLabel();
        genderlabel = new javax.swing.JLabel();
        documentlabel = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        postalfield = new javax.swing.JTextField();
        agefield = new javax.swing.JTextField();
        phonefield = new javax.swing.JTextField();
        emerfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        encountarea = new javax.swing.JTextArea();
        picturebutton = new javax.swing.JButton();
        malebutton = new javax.swing.JRadioButton();
        femalebutton = new javax.swing.JRadioButton();
        otherbutton = new javax.swing.JRadioButton();
        submitbutton = new javax.swing.JButton();
        Patientcombo = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Patient Form");

        namelabel.setText("Name");

        postlabel.setText("Postal Code");

        agelabel.setText("Age");

        emergencylabel.setText("Emergency Contact");

        phonelabel.setText("Phone");

        encountlabel.setText("Encounter");

        patientlabel.setText("Patient type");

        genderlabel.setText("Gender");

        documentlabel.setText("Documents");

        phonefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonefieldActionPerformed(evt);
            }
        });

        emerfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emerfieldActionPerformed(evt);
            }
        });

        encountarea.setColumns(20);
        encountarea.setRows(5);
        jScrollPane1.setViewportView(encountarea);

        picturebutton.setText("Upload");
        picturebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picturebuttonActionPerformed(evt);
            }
        });

        gendergroup.add(malebutton);
        malebutton.setText("Male");
        malebutton.setActionCommand("MALE");
        malebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malebuttonActionPerformed(evt);
            }
        });

        gendergroup.add(femalebutton);
        femalebutton.setText("Female");
        femalebutton.setActionCommand("FEMALE");

        gendergroup.add(otherbutton);
        otherbutton.setText("Other");
        otherbutton.setActionCommand("OTHER");

        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        Patientcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ","Emergency", "Regular", "Dental", "Cardiac" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emergencylabel)
                            .addComponent(agelabel)
                            .addComponent(postlabel)
                            .addComponent(namelabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(encountlabel)
                                .addGap(17, 17, 17))
                            .addComponent(phonelabel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emerfield, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phonefield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(postalfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                        .addComponent(agefield, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(namefield))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(documentlabel)
                        .addGap(18, 18, 18)
                        .addComponent(picturebutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(patientlabel)
                        .addGap(18, 18, 18)
                        .addComponent(Patientcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitbutton)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(genderlabel)
                .addGap(18, 18, 18)
                .addComponent(malebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femalebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherbutton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namelabel)
                            .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(postlabel))
                    .addComponent(postalfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agelabel)
                    .addComponent(agefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonelabel))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlabel)
                    .addComponent(malebutton)
                    .addComponent(femalebutton)
                    .addComponent(otherbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emergencylabel)
                    .addComponent(emerfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(encountlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientlabel)
                            .addComponent(Patientcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documentlabel)
                            .addComponent(picturebutton))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(submitbutton)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void picturebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picturebuttonActionPerformed
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String Picture = selectedFile.getAbsolutePath();
    }//GEN-LAST:event_picturebuttonActionPerformed
    }
    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        // TODO add your handling code here:
        User newuser = new User();

        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);

        ImageIcon scaledIcon = new ImageIcon(image);

        newuser.setName(namefield.getText());
        newuser.setAge((String) agefield.getText());
        newuser.setGender(gendergroup.getSelection().getActionCommand());
        newuser.setEncounter(encountarea.getText());
        newuser.setEmerContact(emerfield.getText());
        newuser.setPostalcode(postalfield.getText());
        newuser.setPhoneNumber(phonefield.getText());
        String selectedPatientType = (String) Patientcombo.getSelectedItem();

        
        if (e.getActionCommand().equals("Submit")) {
            if (validateInput()) {
                String referenceNumber = generateReferenceNumber();
                referenceLabel.setText("Your reference number: " + referenceNumber);
            } else {
                referenceLabel.setText("Please fill all fields correctly.");
            }
        }
    }
         private boolean validateInput() {
        String name = namefield.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        String ageText;
            ageText = agefield.getText().trim();
        if (ageText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter age.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            int age = Integer.parseInt(ageText);
            if (age <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String emergencyContact = emerfield.getText().trim();
        if (emergencyContact.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter emergency contact number.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
}
        String postalCode = postalfield.getText().trim();
        if (postalCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter postal code.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String phoneNumber = phonefield.getText().trim();
        if (phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter phone number.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            Long.valueOf(phoneNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
         

    private String generateReferenceNumber() {
        // Generate a random number with 6 digits
        int randomNumber = (int) (100000 + Math.random() * 900000);
        return "PT" + randomNumber; // Prefix with 'PT' to indicate patient
    }

    }//GEN-LAST:event_submitbuttonActionPerformed

    private void malebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_malebuttonActionPerformed

    private void emerfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emerfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emerfieldActionPerformed

    private void phonefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonefieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Patientcombo;
    private javax.swing.JTextField agefield;
    private javax.swing.JLabel agelabel;
    private javax.swing.JLabel documentlabel;
    private javax.swing.JTextField emerfield;
    private javax.swing.JLabel emergencylabel;
    private javax.swing.JTextArea encountarea;
    private javax.swing.JLabel encountlabel;
    private javax.swing.JRadioButton femalebutton;
    private javax.swing.ButtonGroup gendergroup;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton malebutton;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel namelabel;
    private javax.swing.JRadioButton otherbutton;
    private javax.swing.JLabel patientlabel;
    private javax.swing.JTextField phonefield;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JButton picturebutton;
    private javax.swing.JTextField postalfield;
    private javax.swing.JLabel postlabel;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables

