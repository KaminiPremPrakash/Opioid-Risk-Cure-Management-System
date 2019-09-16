/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorLabRequest;
import Business.WorkQueue.PatientAppointmentRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import userinterface.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author deeptinigam
 */
public class DoctorPatientMedicalHistoryJPanel extends javax.swing.JPanel {

   JPanel userProcessContainer;
   PatientAppointmentRequest request;
   UserAccount useraccount;
   Enterprise enterprise;
   String gender[] = {"Male","Female","Other"};
   HashMap<String, String> heart_rate = new HashMap<String, String>();
   HashMap<String, String> temp_range = new HashMap<String, String>();
   HashMap<String, String> bp_range = new HashMap<String, String>();
   HashMap<String, String> resp_range = new HashMap<String, String>();
   HashMap<String, String> med_range = new HashMap<String, String>();
   String inj_opioid_use[] = {"On Hands","On Feet", "On Neck"};
   String opioid_intoxication[] = {"Pin Point Pupil", "Nodding Off", "Drowsiness", "Sweating"};
   String opioid_withdrawal[] = {"Restlessness", "Lacrimation", "Hypertension", "Muscle Tenderness"};
    String liver_disease[] = {"Jaundice","Hepatosplenomegaly","Ascites"};
 //  HashMap<String, String> inj_opioid_use = new HashMap<String, String>();
   
    /**
     * Creates new form PatientMedicalHistoryJPanel
     */
    public DoctorPatientMedicalHistoryJPanel(JPanel userProcessContainer, PatientAppointmentRequest request,
            UserAccount useraccount,  Enterprise enterprise) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
       this.request = request;
       this.useraccount =useraccount;
       this.enterprise = enterprise;
       for(String str: gender)
       {
           genderCombo.addItem(str);
       }
       for(int i=1; i<=110; i++)
       {
           ageCombo.addItem(i);
       }
       // heart beat range
       heart_rate.put("30bpm-70bpm", "low");
       heart_rate.put("71bpm-100bpm","normal");
       heart_rate.put("101bpm-150bpm","high");
       
       // Getting a Set of Key-value pairs
       Set hb_entrySet = heart_rate.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator hb_it = hb_entrySet.iterator();
       
       while(hb_it.hasNext())
       {
           Map.Entry hb_me = (Map.Entry)hb_it.next();
           heartRateCombo.addItem(hb_me.getKey());
      }
       
       // temperature range
      
      temp_range.put("normal", "97.7 - 99.5°F");
      temp_range.put("high", ">99.5 or 100.9°F");
      temp_range.put("low", "<95.0°F");
      
      // Getting a Set of Key-value pairs
       Set temp_entrySet = temp_range.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator t_it = temp_entrySet.iterator();
       
       while(t_it.hasNext())
       {
           Map.Entry t_me = (Map.Entry)t_it.next();
           tempCombo.addItem(t_me.getValue());
      }
       
        // blood pressure range
      
      
      bp_range.put("low", "<120 bp");
      bp_range.put("normal", "120-129 bp");
      bp_range.put("stage2", ">120 bp");
      
      // Getting a Set of Key-value pairs
       Set bp_entrySet = bp_range.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator bp_it = bp_entrySet.iterator();
       
       while(bp_it.hasNext())
       {
           Map.Entry bp_me = (Map.Entry)bp_it.next();
           bpCombo.addItem(bp_me.getValue());
      }
       
        // respiratory rate range
      
      
      resp_range.put("low", "< 12 bpm");
      resp_range.put("normal", "12-20 bpM");
      resp_range.put("high", "> 20 bpm");
     
      // Getting a Set of Key-value pairs
       Set resp_entrySet = resp_range.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator resp_it = resp_entrySet.iterator();
       
       while(resp_it.hasNext())
       {
           Map.Entry resp_me = (Map.Entry)resp_it.next();
           respCombo.addItem(resp_me.getValue());
      }
      med_range.put("low", "10-20 mg/mL");
      med_range.put("normL", "20-40 mg/mL");
      med_range.put("high", "40-80 mg/mL");
      
      
      // Getting a Set of Key-value pairs
       Set oxcy_entrySet = med_range.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator oxcy_it = oxcy_entrySet.iterator();
       
       while(oxcy_it.hasNext())
       {
           Map.Entry oxcy_me = (Map.Entry)oxcy_it.next();
           oxycCombo.addItem(oxcy_me.getValue());
           fenCombo.addItem(oxcy_me.getValue());
           bupCombo.addItem(oxcy_me.getValue());
           metCombo.addItem(oxcy_me.getValue());
           oxymCombo.addItem(oxcy_me.getValue());
      }
       
       for(String str: inj_opioid_use)
       {
           injCombo.addItem(str);
       }
       
       
        for(String str: opioid_intoxication)
       {
           intoCombo.addItem(str);
       }
        
       for(String str: opioid_withdrawal)
       {
           withCombo.addItem(str);
       }
       
               
        for(String str: liver_disease)
       {
           livCombo.addItem(str);
       }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ageCombo = new javax.swing.JComboBox();
        heartRateCombo = new javax.swing.JComboBox();
        txtpatientname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        drugChk = new javax.swing.JCheckBox();
        alcoholChk = new javax.swing.JCheckBox();
        depressionChk = new javax.swing.JCheckBox();
        anxietyChk = new javax.swing.JCheckBox();
        disruptSocialChk = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        tempCombo = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        bpCombo = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        respCombo = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        oxycChk = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fenChk = new javax.swing.JCheckBox();
        bupChk = new javax.swing.JCheckBox();
        metChk = new javax.swing.JCheckBox();
        oxymChk = new javax.swing.JCheckBox();
        oxycCombo = new javax.swing.JComboBox();
        fenCombo = new javax.swing.JComboBox();
        bupCombo = new javax.swing.JComboBox();
        metCombo = new javax.swing.JComboBox();
        oxymCombo = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        injChk = new javax.swing.JCheckBox();
        injCombo = new javax.swing.JComboBox();
        intoChk = new javax.swing.JCheckBox();
        intoCombo = new javax.swing.JComboBox();
        withChk = new javax.swing.JCheckBox();
        withCombo = new javax.swing.JComboBox();
        livChk = new javax.swing.JCheckBox();
        livCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(188, 194, 223));

        jLabel1.setText("Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Fill Patient Medical History & Symptoms");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("General Information");

        jLabel13.setText("Gender");

        jLabel2.setText("Age");

        heartRateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartRateComboActionPerformed(evt);
            }
        });

        txtpatientname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatientnameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Medical History");

        drugChk.setText("Drug History");

        alcoholChk.setText("Alcohol History");
        alcoholChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alcoholChkActionPerformed(evt);
            }
        });

        depressionChk.setText("Depression History");

        anxietyChk.setText("Anxiety History");

        disruptSocialChk.setText("Bad Social Relationships");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Current Physical Symptoms");

        jLabel14.setText("Heart Rate");

        genderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboActionPerformed(evt);
            }
        });

        jLabel15.setText("Temperature");

        jLabel16.setText("Blood Pressure");

        bpCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpComboActionPerformed(evt);
            }
        });

        jLabel17.setText("Respiratory Rate");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Medicine Consumption History");

        oxycChk.setText("Oxycodone");
        oxycChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxycChkActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Medicine ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Consumption Range");

        fenChk.setText("Fentanyl");
        fenChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fenChkActionPerformed(evt);
            }
        });

        bupChk.setText("Buprenorphine");
        bupChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupChkActionPerformed(evt);
            }
        });

        metChk.setText("Methadone");
        metChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metChkActionPerformed(evt);
            }
        });

        oxymChk.setText("Oxymorphone");
        oxymChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxymChkActionPerformed(evt);
            }
        });

        oxycCombo.setEnabled(false);
        oxycCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxycComboActionPerformed(evt);
            }
        });

        fenCombo.setEnabled(false);
        fenCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fenComboActionPerformed(evt);
            }
        });

        bupCombo.setEnabled(false);
        bupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupComboActionPerformed(evt);
            }
        });

        metCombo.setEnabled(false);
        metCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metComboActionPerformed(evt);
            }
        });

        oxymCombo.setEnabled(false);
        oxymCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxymComboActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Additional Information ");

        injChk.setText("Injection Opioid Use ");
        injChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injChkActionPerformed(evt);
            }
        });

        injCombo.setEnabled(false);
        injCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injComboActionPerformed(evt);
            }
        });

        intoChk.setText("Opioid Intoxication");
        intoChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intoChkActionPerformed(evt);
            }
        });

        intoCombo.setEnabled(false);
        intoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intoComboActionPerformed(evt);
            }
        });

        withChk.setText("Opioid Withdrawal");
        withChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withChkActionPerformed(evt);
            }
        });

        withCombo.setEnabled(false);
        withCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withComboActionPerformed(evt);
            }
        });

        livChk.setText("Liver Disease");
        livChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livChkActionPerformed(evt);
            }
        });

        livCombo.setEnabled(false);
        livCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livComboActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setText("Submit Report ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(59, 59, 59))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel16))
                                            .addGap(32, 32, 32)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tempCombo, 0, 114, Short.MAX_VALUE)
                                    .addComponent(bpCombo, 0, 114, Short.MAX_VALUE)
                                    .addComponent(heartRateCombo, 0, 114, Short.MAX_VALUE)
                                    .addComponent(respCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bupChk)
                                            .addComponent(metChk)
                                            .addComponent(oxymChk)
                                            .addComponent(oxycChk)
                                            .addComponent(fenChk))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(oxycCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fenCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bupCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(metCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(oxymCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(injChk)
                                            .addComponent(intoChk))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(intoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(injCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(drugChk)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(alcoholChk)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(depressionChk)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(anxietyChk))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtpatientname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(disruptSocialChk))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(withChk)
                                            .addComponent(livChk)
                                            .addComponent(jButton1))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(withCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(livCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpatientname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel2)
                        .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugChk)
                    .addComponent(alcoholChk)
                    .addComponent(depressionChk)
                    .addComponent(anxietyChk)
                    .addComponent(disruptSocialChk))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oxycCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oxycChk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fenChk)
                            .addComponent(fenCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bupChk)
                            .addComponent(bupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(metChk)
                            .addComponent(metCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oxymChk)
                            .addComponent(oxymCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(heartRateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tempCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bpCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addGap(24, 24, 24)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(injChk)
                    .addComponent(injCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intoChk)
                    .addComponent(intoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withChk)
                    .addComponent(withCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(livChk)
                    .addComponent(livCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void oxycChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxycChkActionPerformed
        // TODO add your handling code here:
        if(oxycChk.isSelected())
        {
           oxycCombo.setEnabled(true);
        }
        else
        {
            oxycCombo.setEnabled(false);
        }
    }//GEN-LAST:event_oxycChkActionPerformed

    private void bupChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupChkActionPerformed
        // TODO add your handling code here:
        if(bupChk.isSelected())
        {
           bupCombo.setEnabled(true);
        }
        else
        {
            bupCombo.setEnabled(false);
        }
    }//GEN-LAST:event_bupChkActionPerformed

    private void metChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metChkActionPerformed
        // TODO add your handling code here:
        if(metChk.isSelected())
        {
           metCombo.setEnabled(true);
        }
        else
        {
            metCombo.setEnabled(false);
        }
    }//GEN-LAST:event_metChkActionPerformed

    private void oxymChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxymChkActionPerformed
        // TODO add your handling code here:
        if(oxymChk.isSelected())
        {
           oxymCombo.setEnabled(true);
        }
        else
        {
            oxymCombo.setEnabled(false);
        }
    }//GEN-LAST:event_oxymChkActionPerformed

    private void oxycComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxycComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oxycComboActionPerformed

    private void fenComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fenComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fenComboActionPerformed

    private void bupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bupComboActionPerformed

    private void metComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metComboActionPerformed

    private void oxymComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxymComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oxymComboActionPerformed

    private void injChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injChkActionPerformed
        // TODO add your handling code here:
        if(injChk.isSelected())
        {
           injCombo.setEnabled(true);
        }
        else
        {
            injCombo.setEnabled(false);
        }
    }//GEN-LAST:event_injChkActionPerformed

    private void injComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_injComboActionPerformed

    private void intoChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intoChkActionPerformed
        // TODO add your handling code here:
        if(intoChk.isSelected())
        {
           intoCombo.setEnabled(true);
        }
        else
        {
            intoCombo.setEnabled(false);
        }
    }//GEN-LAST:event_intoChkActionPerformed

    private void intoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intoComboActionPerformed

    private void withChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withChkActionPerformed
        // TODO add your handling code here:
        if(withChk.isSelected())
        {
           withCombo.setEnabled(true);
        }
        else
        {
            withCombo.setEnabled(false);
        }
    }//GEN-LAST:event_withChkActionPerformed

    private void withComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withComboActionPerformed

    private void livChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livChkActionPerformed
        // TODO add your handling code here:
        if(livChk.isSelected())
        {
           livCombo.setEnabled(true);
        }
        else
        {
            livCombo.setEnabled(false);
        }
    }//GEN-LAST:event_livChkActionPerformed

    private void livComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_livComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DoctorLabRequest labr = new DoctorLabRequest();
        labr.setSender(useraccount);

        labr.setMessage("Lab Request");
        labr.setStatus("Med Hist Collected For Lab");
        request.setStatus("Med Hist Collected For Lab");
         request.setDoc_med_history("");

        //Setting patient's general information 
        labr.setName(txtpatientname.getText());
        labr.setGender((String)genderCombo.getSelectedItem());
        labr.setAge((Integer)ageCombo.getSelectedItem());
        
        //Setting patients medical history
        labr.setDrug_history(drugChk.isSelected());
        labr.setAlcohol_history(alcoholChk.isSelected());
        labr.setDepression_history(depressionChk.isSelected());
        labr.setAnxiety_history(anxietyChk.isSelected());
        labr.setDisrupt_history(disruptSocialChk.isSelected());
        
       
        if((String)heartRateCombo.getSelectedItem() == "101bpm-150bpm")
        {
            labr.setHr_risk(true);
        }
        else
        {
            labr.setHr_risk(false);
        }
        
        if((String)tempCombo.getSelectedItem() == ">99.5 or 100.9°F")
        {
            labr.setTemp_risk(true);
        }
        else
        {
            labr.setTemp_risk(false);
        }
        
        if((String)bpCombo.getSelectedItem() == ">120 bp" ||
            (String)bpCombo.getSelectedItem() == "<120 bp")    
        {
            labr.setBp_risk(true);
        }
        else
        {
            labr.setBp_risk(false);
        }
        
        if((String)respCombo.getSelectedItem() == "> 20 bpm" ||
           (String)respCombo.getSelectedItem() == "< 12 bpm")         
        {
            labr.setResp_risk(true);
        }
        else
        {
            labr.setResp_risk(false);
        }
        
        //Setting patient's medicine consumption flag
        labr.setOxycodone_taken(oxycChk.isSelected());
        labr.setFantanyl_taken(fenChk.isSelected());
        labr.setBupre_taken(bupChk.isSelected());
        labr.setMethadone_taken(metChk.isSelected());
        labr.setOxymorphone_taken(oxymChk.isSelected());
        
        //Setting patient's medicine consumption dose risk
        if((String)oxycCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setOxycodone_risk(true);
        }
        else
        {
            labr.setOxycodone_risk(false);
        }
        if((String)fenCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setFantanyl_risk(true);
        }
        else
        {
            labr.setFantanyl_risk(false);
        }
        
        if((String)bupCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setBupre_risk(true);
        }
        else
        {
            labr.setBupre_risk(false);
        }
        
        if((String)metCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setMethadone_risk(true);
        }
        else
        {
            labr.setMethadone_risk(false);
        }
        
        if((String)oxymCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setOxymorphone_risk(true);
        }
        else
        {
            labr.setOxymorphone_risk(false);
        }
        
        //Setting patient's additional consumption flag
        labr.setInjection_checked(injChk.isSelected());
        labr.setIntoxication_checked(intoChk.isSelected());
        labr.setWithdrawal_checked(withChk.isSelected());
        labr.setDisease_checked(livChk.isSelected());
        
        
        //Setting patient's additional consumption flag
        labr.setInjection_type((String)injCombo.getSelectedItem());
        labr.setIntoxication_type((String)intoCombo.getSelectedItem());
        labr.setWithdrawal_type((String)withCombo.getSelectedItem());
        labr.setDisease_type((String)livCombo.getSelectedItem());
        
    //    DoctorLabRequest labr = new DoctorLabRequest();
      Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof LabOrganization){
                org = organization;
                //testing
                System.out.println(request.hashCode());
              //  org.setHashcode(request.hashCode());
                break;
            }
        }
        if (org!=null){
              int a = request.hashCode();
              request.setHashcode(a);//patient hashcode from db
        System.out.println(a);
        labr.setHashcode(a);
            org.getWorkQueue().getWorkRequestList().add(labr);
            useraccount.getWorkQueue().getWorkRequestList().add(labr);
        }
    
         JOptionPane.showMessageDialog(null, "Report Submitted Successfully");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void genderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_genderComboActionPerformed

    private void heartRateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartRateComboActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_heartRateComboActionPerformed

    private void bpComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpComboActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_bpComboActionPerformed

    private void fenChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fenChkActionPerformed
        // TODO add your handling code here:
        if(fenChk.isSelected())
        {
           fenCombo.setEnabled(true);
        }
        else
        {
            fenCombo.setEnabled(false);
        }
    }//GEN-LAST:event_fenChkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorAppointmentRequestsJPanel pwjp = (DoctorAppointmentRequestsJPanel) component;
        pwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void alcoholChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alcoholChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alcoholChkActionPerformed

    private void txtpatientnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatientnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatientnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ageCombo;
    private javax.swing.JCheckBox alcoholChk;
    private javax.swing.JCheckBox anxietyChk;
    private javax.swing.JComboBox bpCombo;
    private javax.swing.JCheckBox bupChk;
    private javax.swing.JComboBox bupCombo;
    private javax.swing.JCheckBox depressionChk;
    private javax.swing.JCheckBox disruptSocialChk;
    private javax.swing.JCheckBox drugChk;
    private javax.swing.JCheckBox fenChk;
    private javax.swing.JComboBox fenCombo;
    private javax.swing.JComboBox genderCombo;
    private javax.swing.JComboBox heartRateCombo;
    private javax.swing.JCheckBox injChk;
    private javax.swing.JComboBox injCombo;
    private javax.swing.JCheckBox intoChk;
    private javax.swing.JComboBox intoCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox livChk;
    private javax.swing.JComboBox livCombo;
    private javax.swing.JCheckBox metChk;
    private javax.swing.JComboBox metCombo;
    private javax.swing.JCheckBox oxycChk;
    private javax.swing.JComboBox oxycCombo;
    private javax.swing.JCheckBox oxymChk;
    private javax.swing.JComboBox oxymCombo;
    private javax.swing.JComboBox respCombo;
    private javax.swing.JComboBox tempCombo;
    private javax.swing.JTextField txtpatientname;
    private javax.swing.JCheckBox withChk;
    private javax.swing.JComboBox withCombo;
    // End of variables declaration//GEN-END:variables
}
