package com.iit.refrigeratorsimulator;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interface extends javax.swing.JFrame {
    ////////////////////////////////////////////////////////////////////////////
    // Main Method
    ////////////////////////////////////////////////////////////////////////////

    User user = new User();
    Refrigerator refrigerator = new Refrigerator();
    Store store = new Store();
    String[] quantity = refrigerator.getQuantity();
    Thread thread;
    AutoTime autoTime;

    public void quantityUpdate() {
        quantity = refrigerator.getQuantity();
        this.apple_quantity.setText(quantity[0]);
        this.oj_quantity.setText(quantity[1]);
        this.egg_quantity.setText(quantity[2]);
        this.milk_quantity.setText(quantity[3]);
    }

    public void statusBarPerformed() {
        jProgressBar1.setValue(refrigerator.user.getHunger());
    }

    ////////////////////////////////////////////////////////////////////////////
    // UI Logic
    ////////////////////////////////////////////////////////////////////////////
    public Interface(String username) {
        initComponents();
        setUserName(username);
        updateScore();
    }

    ////////////////////////////////////////////////////////////////////////////
    // Set Prices
    ////////////////////////////////////////////////////////////////////////////
    public void setPrices() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        eat_apple = new javax.swing.JButton();
        eat_egg = new javax.swing.JButton();
        drink_oj = new javax.swing.JButton();
        drink_milk = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        apple_quantity = new javax.swing.JLabel();
        egg_quantity = new javax.swing.JLabel();
        oj_quantity = new javax.swing.JLabel();
        oj_unit = new javax.swing.JLabel();
        milk_quantity = new javax.swing.JLabel();
        milk_unit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buy_apples = new javax.swing.JButton();
        buy_eggs = new javax.swing.JButton();
        buy_oj = new javax.swing.JButton();
        buy_milk = new javax.swing.JButton();
        buy_waterfilter = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        message_1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        time_value = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        eat_apple.setText("Eat Apple");
        eat_apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eat_appleActionPerformed(evt);
            }
        });

        eat_egg.setText("Eat Eggs");
        eat_egg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eat_eggActionPerformed(evt);
            }
        });

        drink_oj.setText("Drink Orange Juice");
        drink_oj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink_ojActionPerformed(evt);
            }
        });

        drink_milk.setText("Drink Milk");
        drink_milk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink_milkActionPerformed(evt);
            }
        });

        jButton1.setText("Change Water Filter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        apple_quantity.setText("0");

        egg_quantity.setText("0");

        oj_quantity.setText("0.0");

        oj_unit.setText("L");

        milk_quantity.setText("0.0");

        milk_unit.setText("L");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(drink_milk, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(drink_oj, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(eat_egg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(eat_apple, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(34, 34, 34)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(apple_quantity, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(oj_quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(milk_quantity))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(oj_unit)
                                    .add(milk_unit)))
                            .add(egg_quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(eat_apple)
                    .add(apple_quantity))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(eat_egg)
                    .add(egg_quantity))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(drink_oj)
                    .add(oj_quantity)
                    .add(oj_unit))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(drink_milk)
                    .add(milk_quantity)
                    .add(milk_unit))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        buy_apples.setText("Buy Apples");
        buy_apples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_applesActionPerformed(evt);
            }
        });

        buy_eggs.setText("Buy Eggs");
        buy_eggs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_eggsActionPerformed(evt);
            }
        });

        buy_oj.setText("Buy Orange Juice");
        buy_oj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_ojActionPerformed(evt);
            }
        });

        buy_milk.setText("Buy Milk");
        buy_milk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_milkActionPerformed(evt);
            }
        });

        buy_waterfilter.setLabel("Water Filter");
        buy_waterfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_waterfilterActionPerformed(evt);
            }
        });

        jLabel12.setText("3.00$");

        jLabel13.setText("2.00$");

        jLabel14.setText("5.00$");

        jLabel15.setText("3.00$");

        jLabel16.setText("20.00$");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(buy_waterfilter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, buy_milk, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(buy_eggs, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(buy_apples, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(buy_oj, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 67, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel12)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel13)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel14)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel15)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel16))
                .add(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buy_apples)
                    .add(jLabel12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buy_eggs)
                    .add(jLabel13))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buy_oj)
                    .add(jLabel14))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buy_milk)
                    .add(jLabel15))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buy_waterfilter)
                    .add(jLabel16))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Refrigerator View");

        jLabel2.setText("Store View");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        message_1.setText("Welcome to the application.");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(message_1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(message_1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel3.setText("System");

        jLabel4.setText("History");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton3.setText("Clear History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jButton3)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton3)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("jLabel5");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Player Stats");

        jLabel7.setText("Money:");

        jLabel8.setText("Satiation:");

        jLabel9.setText("$300.0");

        jProgressBar1.setValue(80);
        jProgressBar1.setStringPainted(true);
        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });

        jLabel10.setText("Time:");

        time_value.setText("Day 90");

        jButton6.setText("1 Day");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("Auto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 131, Short.MAX_VALUE)
                .add(jButton6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton2)
                .add(18, 18, 18)
                .add(jProgressBar2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(time_value)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 203, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jProgressBar2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel6)
                        .add(jLabel7)
                        .add(jLabel8)
                        .add(jLabel9)
                        .add(jLabel10)
                        .add(time_value)
                        .add(jButton6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton2))
                    .add(jProgressBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu3.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("High Scores");

        jMenu6.setText("View High Scores");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu6);

        jMenu7.setText("Submit Score");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel4))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ////////////////////////////////////////////////////////////////////////////
    // Print About Menu
    ////////////////////////////////////////////////////////////////////////////
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.out.println("About");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void consoleOutput(String inputString) {
        message_1.setText(inputString);
        jTextArea1.append(inputString);
    }
    ////////////////////////////////////////////////////////////////////////////
    // Buy Apples
    ////////////////////////////////////////////////////////////////////////////
    private void buy_applesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_applesActionPerformed


        if (!user.spendMoney(1.0)) {
            this.message_1.setText("Not enough money!");
        } else {
            consoleOutput("You bought apples.\n");
            ((Apple) refrigerator.apple).buy();
            quantityUpdate();
        }
        this.jLabel9.setText("$" + Double.toString(user.getMoney()));
    }//GEN-LAST:event_buy_applesActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Eat Apples
    ////////////////////////////////////////////////////////////////////////////
    private void eat_appleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eat_appleActionPerformed
        ((Apple) refrigerator.apple).eat();
        if (Integer.parseInt(quantity[0]) > 0) {
            refrigerator.user.incrementHunger(5);
            consoleOutput("You ate an apple.\n");
        }
        quantityUpdate();
        jProgressBar1.setValue(refrigerator.user.getHunger());

    }//GEN-LAST:event_eat_appleActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Advance Time
    ////////////////////////////////////////////////////////////////////////////
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        incrementTime();
    }//GEN-LAST:event_jButton6ActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Buy Water Filter
    ////////////////////////////////////////////////////////////////////////////
    private void buy_waterfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_waterfilterActionPerformed

        if (!user.spendMoney(12.0)) {
            this.message_1.setText("Not enough money!");
        } else {
            consoleOutput("You bought a water filter.\n");
            refrigerator.buyWaterFilter();
            quantityUpdate();
        }
        this.jLabel9.setText("$" + Double.toString(user.getMoney()));
    }//GEN-LAST:event_buy_waterfilterActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Buy Orange Juice
    ////////////////////////////////////////////////////////////////////////////
    private void buy_ojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_ojActionPerformed

        quantityUpdate();
        if (!user.spendMoney(3.0)) {
            this.message_1.setText("Not enough money!");
        } else {
            consoleOutput("You bought orange juice.\n");
            ((OrangeJuice) refrigerator.oj).buy();
            quantityUpdate();
        }
        this.jLabel9.setText("$" + Double.toString(user.getMoney()));
    }//GEN-LAST:event_buy_ojActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Eat Eggs
    ////////////////////////////////////////////////////////////////////////////
    private void eat_eggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eat_eggActionPerformed
        ((Egg) refrigerator.egg).eat();
        if (Integer.parseInt(quantity[2]) > 0) {
            consoleOutput("You ate eggs.\n");
            refrigerator.user.incrementHunger(5);
        }
        quantityUpdate();
        jProgressBar1.setValue(refrigerator.user.getHunger());
    }//GEN-LAST:event_eat_eggActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // 
    ////////////////////////////////////////////////////////////////////////////
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Drink Orange Juice
    ////////////////////////////////////////////////////////////////////////////
    private void drink_ojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink_ojActionPerformed
        ((OrangeJuice) refrigerator.oj).eat();
        if (Float.parseFloat(quantity[1]) > 0) {
            refrigerator.user.incrementHunger(3);
            consoleOutput("You drank orange juice.\n");
        }
        quantityUpdate();
        jProgressBar1.setValue(refrigerator.user.getHunger());
    }//GEN-LAST:event_drink_ojActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Buy Eggs
    ////////////////////////////////////////////////////////////////////////////
    private void buy_eggsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_eggsActionPerformed

        if (!user.spendMoney(2.5)) {
            this.message_1.setText("Not enough money!");
        } else {
            consoleOutput("You bought eggs.\n");
            ((Egg) refrigerator.egg).buy();
            quantityUpdate();
        }
        this.jLabel9.setText("$" + Double.toString(user.getMoney()));
    }//GEN-LAST:event_buy_eggsActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Buy Milk
    ////////////////////////////////////////////////////////////////////////////
    private void buy_milkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_milkActionPerformed
        ((Milk) refrigerator.milk).buy();
        if (!user.spendMoney(3.5)) {
            this.message_1.setText("Not enough money!");
        } else {
            consoleOutput("You bought milk.\n");
            ((Egg) refrigerator.egg).buy();
            quantityUpdate();
        }
        this.jLabel9.setText("$" + Double.toString(user.getMoney()));
    }//GEN-LAST:event_buy_milkActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Drink Milk
    ////////////////////////////////////////////////////////////////////////////
    private void drink_milkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink_milkActionPerformed
        ((Milk) refrigerator.milk).eat();
        if (Float.parseFloat(quantity[3]) > 0) {
            refrigerator.user.incrementHunger(3);
            consoleOutput("You drank milk.\n");
        }
        quantityUpdate();
        jProgressBar1.setValue(refrigerator.user.getHunger());
    }//GEN-LAST:event_drink_milkActionPerformed

    ////////////////////////////////////////////////////////////////////////////
    // Set Hunger
    ////////////////////////////////////////////////////////////////////////////
    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar1StateChanged
        jProgressBar1.setValue(refrigerator.user.getHunger());
    }//GEN-LAST:event_jProgressBar1StateChanged

    ////////////////////////////////////////////////////////////////////////////
    // High Score
    ////////////////////////////////////////////////////////////////////////////
    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        try {
            new HighScoreInterface().setVisible(true);   //Pulls and renders highscore table
        } catch (SQLException ex) {
            Logger.getLogger(HighScoreInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HighScoreInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        String username = user.getName();
        int score = (int) user.getMoney();
        new SubmitScore(username, score).setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    ////////////////////////////////////////////////////////////////////////////
    // Set Automatic
    ////////////////////////////////////////////////////////////////////////////
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (thread == null || !thread.isAlive()) {
            autoTime = new AutoTime(jProgressBar2, this);
            thread = new Thread(autoTime);
            thread.start();
        } else {
            autoTime.toggleActive();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        consoleOutput("History cleared!\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    public void incrementTime() {
        refrigerator.decTime();
        this.time_value.setText("Day " + Integer.toString(refrigerator.time));
        this.message_1.setText("");
        consoleOutput("Day " + Integer.toString(refrigerator.time) + " Passed. Satiation:" + jProgressBar1.getValue() + "\n");
        statusBarPerformed();
    }

    ////////////////////////////////////////////////////////////////////////////
    // Update Score
    ////////////////////////////////////////////////////////////////////////////
    private void updateScore() {
        jLabel9.setText("" + user.getMoney());
    }

    ////////////////////////////////////////////////////////////////////////////
    // Set User Name on Initialization
    ////////////////////////////////////////////////////////////////////////////
    private void setUserName(String name) {
        user.setName(name);
        jLabel6.setText(user.getName() + "'s Stats");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apple_quantity;
    private javax.swing.JButton buy_apples;
    private javax.swing.JButton buy_eggs;
    private javax.swing.JButton buy_milk;
    private javax.swing.JButton buy_oj;
    private javax.swing.JButton buy_waterfilter;
    private javax.swing.JButton drink_milk;
    private javax.swing.JButton drink_oj;
    private javax.swing.JButton eat_apple;
    private javax.swing.JButton eat_egg;
    private javax.swing.JLabel egg_quantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel message_1;
    private javax.swing.JLabel milk_quantity;
    private javax.swing.JLabel milk_unit;
    private javax.swing.JLabel oj_quantity;
    private javax.swing.JLabel oj_unit;
    private javax.swing.JLabel time_value;
    // End of variables declaration//GEN-END:variables
}
