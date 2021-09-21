/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.frame;

import java.util.List;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.awt.Color;

/**
 *
 * @author Ahsan
 */
public class FoodOrdering extends javax.swing.JFrame {

    /**
     * Creates new form FoodOrdering
     */
    public FoodOrdering() {
        initComponents();

        // Adding RadioButton to ButtonGroup
        genderbuttonGroup.add(maleRadio);
        genderbuttonGroup.add(femaleRadio);

        fillCitiesComboBox();
        onOffToglleBtn.setSelected(true);
        this.getContentPane().setBackground( new Color(52, 198, 235) );

    }

    String getAllSelectedFoodItems() {
        String foodItems = "";

        if (biryaniBox.isSelected()) {
            foodItems += ",%s".formatted(biryaniBox.getText());
        }

        if (broastBox.isSelected()) {
            foodItems += ", %s".formatted(broastBox.getText());
        }

        if (zingerBurgerBox.isSelected()) {
            foodItems += ", %s".formatted(zingerBurgerBox.getText());
        }

        if (karahiBox.isSelected()) {
            foodItems += ", %s".formatted(karahiBox.getText());
        }

        if (pizzaBox.isSelected()) {
            foodItems += ", %s".formatted(pizzaBox.getText());
        }

        if (chickenBurgerBox.isSelected()) {
            foodItems += ", %s".formatted(chickenBurgerBox.getText());
        }

        if (shawarmaBox.isSelected()) {
            foodItems += ", %s".formatted(shawarmaBox.getText());
        }

        if (sandwichBox.isSelected()) {
            foodItems += ", %s".formatted(sandwichBox.getText());
        }

        if (seehKababBox.isSelected()) {
            foodItems += ", %s".formatted(seehKababBox.getText());
        }

        if (coldDrinkBox.isSelected()) {
            foodItems += ", %s".formatted(coldDrinkBox.getText());
        }

        if (raitaBox.isSelected()) {
            foodItems += ", %s".formatted(raitaBox.getText());
        }

        if (chapatiBox.isSelected()) {
            foodItems += ", %s".formatted(chapatiBox.getText());
        }
        foodItems = foodItems.replaceFirst(",", "");

        return foodItems;
    }

    boolean fillCitiesComboBox() {

        String cities[] = {"-------- No Selected --------", "Hyderabad", "Karachi", "Lahore"};

        citiesCombo.removeAllItems();
        for (String city : cities) {

            citiesCombo.addItem(city);
        }

        return true;
    }

    String getSelectedGender() {

        String gender = "";

        if (maleRadio.isSelected()) {
            gender = maleRadio.getText();
        } else {
            gender = femaleRadio.getText();
        }

        return gender;
    }

    boolean isValidData() {

        if (nameField.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please Enter Name! ");
            return false;
        } else if (!(maleRadio.isSelected() || femaleRadio.isSelected())) {

            JOptionPane.showMessageDialog(this, "Please Select Gender! ");
            return false;
        } else if (citiesCombo.getSelectedItem().toString().equals("-------- No Selected --------")) {

            JOptionPane.showMessageDialog(this, "Please Select City! ");
            return false;
        } else {

          

            if (biryaniBox.isSelected()) {
                return true;
            } else if (broastBox.isSelected()) {
                return true;
            } else if (zingerBurgerBox.isSelected()) {
                return true;
            } else if (karahiBox.isSelected()) {
                return true;
            } else if (pizzaBox.isSelected()) {
                return true;
            } else if (chickenBurgerBox.isSelected()) {
                return true;
            } else if (shawarmaBox.isSelected()) {
                return true;
            } else if (sandwichBox.isSelected()) {
                return true;
            } else if (seehKababBox.isSelected()) {
                return true;
            } else if (coldDrinkBox.isSelected()) {
                return true;
            } else if (raitaBox.isSelected()) {
                return true;
            } else if (chapatiBox.isSelected()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Please Selected Food!");
                return false;
            }
            
        }

    }

    boolean isMakeAllVisible(boolean x) {

        headingLbl.setVisible(x);

        nameLbl.setVisible(x);

        nameField.setVisible(x);

        genderLbl.setVisible(x);
        maleRadio.setVisible(x);
        femaleRadio.setVisible(x);

        cityLbl.setVisible(x);

        citiesCombo.setVisible(x);

        foodItemListLbl.setVisible(x);

        biryaniBox.setVisible(x);
        broastBox.setVisible(x);
        zingerBurgerBox.setVisible(x);
        karahiBox.setVisible(x);
        pizzaBox.setVisible(x);
        chickenBurgerBox.setVisible(x);
        shawarmaBox.setVisible(x);
        sandwichBox.setVisible(x);
        seehKababBox.setVisible(x);
        coldDrinkBox.setVisible(x);
        raitaBox.setVisible(x);
        chapatiBox.setVisible(x);

        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderbuttonGroup = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        headingLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        foodItemListLbl = new javax.swing.JLabel();
        biryaniBox = new javax.swing.JCheckBox();
        broastBox = new javax.swing.JCheckBox();
        zingerBurgerBox = new javax.swing.JCheckBox();
        pizzaBox = new javax.swing.JCheckBox();
        chickenBurgerBox = new javax.swing.JCheckBox();
        karahiBox = new javax.swing.JCheckBox();
        sandwichBox = new javax.swing.JCheckBox();
        seehKababBox = new javax.swing.JCheckBox();
        shawarmaBox = new javax.swing.JCheckBox();
        raitaBox = new javax.swing.JCheckBox();
        chapatiBox = new javax.swing.JCheckBox();
        coldDrinkBox = new javax.swing.JCheckBox();
        cityLbl = new javax.swing.JLabel();
        citiesCombo = new javax.swing.JComboBox<>();
        orderBtn = new javax.swing.JButton();
        onOffToglleBtn = new javax.swing.JToggleButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(java.awt.Color.orange);

        headingLbl.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        headingLbl.setText("Food Ordering System");

        nameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nameLbl.setText("Name");

        genderLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        genderLbl.setText("Gender");

        maleRadio.setText("Male");

        femaleRadio.setText("Female");

        foodItemListLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        foodItemListLbl.setText("Food Items");

        biryaniBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        biryaniBox.setText("Biryani");

        broastBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        broastBox.setText("Broast");

        zingerBurgerBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        zingerBurgerBox.setText("Zinger Burger");

        pizzaBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pizzaBox.setText("Pizza");

        chickenBurgerBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chickenBurgerBox.setText("Chicken Burger ");

        karahiBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        karahiBox.setText("karahi");

        sandwichBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sandwichBox.setText("Sandwich");

        seehKababBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        seehKababBox.setText("Seekh Kabab");

        shawarmaBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        shawarmaBox.setText("Shawarma");

        raitaBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        raitaBox.setText("Raita");

        chapatiBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chapatiBox.setText("Chapati");

        coldDrinkBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        coldDrinkBox.setText("Cold Drink");

        cityLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cityLbl.setText("City");

        citiesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        orderBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        orderBtn.setText("ORDER");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        onOffToglleBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        onOffToglleBtn.setText("ON/OFF");
        onOffToglleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOffToglleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(headingLbl))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cityLbl)
                                    .addGap(29, 29, 29)
                                    .addComponent(citiesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderLbl))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(maleRadio)
                                            .addGap(31, 31, 31)
                                            .addComponent(femaleRadio)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(orderBtn)
                        .addGap(33, 33, 33)
                        .addComponent(onOffToglleBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(foodItemListLbl))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(304, 304, 304)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chickenBurgerBox)
                                .addComponent(zingerBurgerBox)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(coldDrinkBox)
                                .addComponent(karahiBox)
                                .addComponent(shawarmaBox)
                                .addComponent(biryaniBox))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pizzaBox)
                                .addComponent(broastBox)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(raitaBox))
                                .addComponent(sandwichBox))
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seehKababBox)
                                .addComponent(chapatiBox))
                            .addGap(16, 16, 16))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(headingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLbl)
                    .addComponent(citiesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(foodItemListLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(biryaniBox)
                            .addComponent(zingerBurgerBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(karahiBox)
                            .addComponent(chickenBurgerBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seehKababBox)
                            .addComponent(shawarmaBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chapatiBox)
                            .addComponent(coldDrinkBox)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(broastBox)
                        .addGap(18, 18, 18)
                        .addComponent(pizzaBox)
                        .addGap(18, 18, 18)
                        .addComponent(sandwichBox)
                        .addGap(18, 18, 18)
                        .addComponent(raitaBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderBtn)
                    .addComponent(onOffToglleBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onOffToglleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOffToglleBtnActionPerformed
        // TODO add your handling code here:

        if(!onOffToglleBtn.isSelected()){

            isMakeAllVisible(false);
        }
        else{

            isMakeAllVisible(true);
        }
    }//GEN-LAST:event_onOffToglleBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        // TODO add your handling code here:
        if (isValidData()) {

            String name, gender, city, foodItems = "";

            // Getting Name
            name = nameField.getText().trim();

            // Getting Gender
            gender = getSelectedGender();
            // Getting City
            city = citiesCombo.getSelectedItem().toString();

            // Getting Selected Food Items
            foodItems = getAllSelectedFoodItems();

            JOptionPane.showMessageDialog(this, "Name: %s\nGender: %s\nCity: %s\nSelected Food Items:\n%s".formatted(name, gender, city, foodItems));
        }

    }//GEN-LAST:event_orderBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FoodOrdering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodOrdering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodOrdering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodOrdering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodOrdering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox biryaniBox;
    private javax.swing.JCheckBox broastBox;
    private javax.swing.JCheckBox chapatiBox;
    private javax.swing.JCheckBox chickenBurgerBox;
    private javax.swing.JComboBox<String> citiesCombo;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JCheckBox coldDrinkBox;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel foodItemListLbl;
    private javax.swing.JLabel genderLbl;
    private javax.swing.ButtonGroup genderbuttonGroup;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JCheckBox karahiBox;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JToggleButton onOffToglleBtn;
    private javax.swing.JButton orderBtn;
    private javax.swing.JCheckBox pizzaBox;
    private javax.swing.JCheckBox raitaBox;
    private javax.swing.JCheckBox sandwichBox;
    private javax.swing.JCheckBox seehKababBox;
    private javax.swing.JCheckBox shawarmaBox;
    private javax.swing.JCheckBox zingerBurgerBox;
    // End of variables declaration//GEN-END:variables
}
