/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.HourlyRateCalculatorFile;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.text.JTextComponent;
import hourlyrateshiftcalculator.HourlyRateShiftCalculator;
import hourlyrateshiftcalculator.Validator;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Shift;
/**
 *
 * @author Hardikkumar Bhakta
 */
public class ShiftFormFrame extends javax.swing.JFrame {

    /**
     * Creates new form ShiftForm
     */
    
    private static int nextY;
    private static int spinnerHeight;
    private Date shiftStart;
    private Date shiftEnd;
    private ArrayList<ShiftFormComponent> sfclist;
    private HourlyRateCalculatorFile hourlyRateCalculatorFile;
    
    public ShiftFormFrame() {
        initComponents();
        this.setTitle("Hourly Rate Shift Calculator");
        spinnerHeight = this.shiftStartDateTimeSpinner.getHeight();
        nextY = this.shiftStartDateTimeSpinner.getLocation().y;
        sfclist = new ArrayList<>();
        hourlyRateCalculatorFile = new HourlyRateCalculatorFile();
        sfclist.add(ShiftFormComponent.getShiftFormComponent(shiftStartDateTimeSpinner, 
                shiftEndDateTimeSpinner, hoursTextField, minutesTextField));
        disableSaveButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();
        formPanel = new javax.swing.JPanel();
        shiftsLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        hourlyRateLabel = new javax.swing.JLabel();
        hourlyRateTextField = new javax.swing.JTextField();
        perHourLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        hoursLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        minutesLabel = new javax.swing.JLabel();
        shiftStartDateTimeSpinner = new javax.swing.JSpinner();
        shiftEndDateTimeSpinner = new javax.swing.JSpinner();
        hoursTextField = new javax.swing.JTextField();
        minutesTextField = new javax.swing.JTextField();
        newRowButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formPanel.setAutoscrolls(true);

        shiftsLabel.setText("Shifts");

        nameLabel.setText("Name:");

        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameAndHrTextFieldFocusGained(evt);
            }
        });
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyTyped(evt);
            }
        });

        hourlyRateLabel.setText("Hourly Rate:");

        hourlyRateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameAndHrTextFieldFocusGained(evt);
            }
        });
        hourlyRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourlyRateTextFieldActionPerformed(evt);
            }
        });
        hourlyRateTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hourlyRateTextFieldKeyTyped(evt);
            }
        });

        perHourLabel.setText("per hour");

        startLabel.setText("Shift Start");

        endLabel.setText("Shift End");

        hoursLabel.setText("Hours");

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        minutesLabel.setText("Minutes");

        shiftStartDateTimeSpinner.setModel(new javax.swing.SpinnerDateModel());

        shiftEndDateTimeSpinner.setModel(new javax.swing.SpinnerDateModel());

        hoursTextField.setEditable(false);

        minutesTextField.setEditable(false);

        newRowButton.setText("New Row");
        newRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRowButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shiftsLabel)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(hourlyRateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourlyRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(perHourLabel))))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shiftStartDateTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shiftEndDateTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoursLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(minutesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newRowButton))
                            .addComponent(minutesLabel)))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(calculateButton)
                        .addGap(7, 7, 7)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(printButton)
                        .addGap(89, 89, 89)
                        .addComponent(exitButton)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shiftsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyRateLabel)
                    .addComponent(hourlyRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perHourLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(exitButton)
                    .addComponent(printButton)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startLabel)
                    .addComponent(endLabel)
                    .addComponent(hoursLabel)
                    .addComponent(minutesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shiftStartDateTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shiftEndDateTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newRowButton)
                    .addComponent(minutesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(519, Short.MAX_VALUE))
        );

        scrollPanel.setViewportView(formPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRowButtonActionPerformed
        // TODO add your handling code here:
        nextY += spinnerHeight;
        JPanel newShiftPanel = new JPanel();
        JSpinner shiftStartDateTimeSpinner = new JSpinner();
        JSpinner shiftEndDateTimeSpinner = new JSpinner();
        JTextField hoursTextField = new JTextField();
        JTextField minutesTextField = new JTextField();
        shiftStartDateTimeSpinner.setModel(new SpinnerDateModel());
        shiftEndDateTimeSpinner.setModel(new SpinnerDateModel());
        
        shiftStartDateTimeSpinner.setSize(this.shiftStartDateTimeSpinner.getSize());
        shiftEndDateTimeSpinner.setSize(this.shiftEndDateTimeSpinner.getSize());
        hoursTextField.setSize(this.hoursTextField.getSize());
        minutesTextField.setSize(this.minutesTextField.getSize());
        shiftStartDateTimeSpinner.setLocation(this.shiftStartDateTimeSpinner.getLocation().getLocation().x, nextY);
        shiftEndDateTimeSpinner.setLocation(this.shiftEndDateTimeSpinner.getLocation().getLocation().x, nextY);
        hoursTextField.setLocation(this.hoursTextField.getLocation().getLocation().x,
                nextY);
        hoursTextField.setVisible(true);
        hoursTextField.setEditable(false);
        minutesTextField.setLocation(this.minutesTextField.getLocation().getLocation().x,
                nextY);
        minutesTextField.setVisible(true);
        minutesTextField.setEditable(false);
        formPanel.add(shiftStartDateTimeSpinner);
        formPanel.add(shiftEndDateTimeSpinner);
        formPanel.add(hoursTextField);
        formPanel.add(minutesTextField);
        repaint();
        sfclist.add(ShiftFormComponent.getShiftFormComponent(shiftStartDateTimeSpinner, 
                shiftEndDateTimeSpinner, hoursTextField, minutesTextField));
        /*
        add instances of each shift to list here
        */
        
        
        /*
        System.out.println(this.shiftStartDateTimeSpinner.getLocation().getLocation().x + ","
                + this.shiftStartDateTimeSpinner.getLocation().getLocation().y);
        System.out.println(this.shiftEndDateTimeSpinner.getLocation().getLocation().x + ","
                + this.shiftEndDateTimeSpinner.getLocation().getLocation().y);
        System.out.println(this.hoursTextField.getLocation().getLocation().x+ ","
                + this.hoursTextField.getLocation().getLocation().y);
        System.out.println(this.shiftStartDateTimeSpinner.getSize().height);
        System.out.println(this.shiftEndDateTimeSpinner.getSize().height);
        System.out.println(this.hoursTextField.getSize().height);
        */
        
    }//GEN-LAST:event_newRowButtonActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        if (isValidData()){
            if (!hourlyRateCalculatorFile.getShiftList().isEmpty()) {
                hourlyRateCalculatorFile.getShiftList().clear();
            }
            String name = this.nameTextField.getText();
            double hourlyRate = Double.parseDouble(this.hourlyRateTextField.getText());
            hourlyRateCalculatorFile.setName(name);
            hourlyRateCalculatorFile.setHourlyRate(hourlyRate);
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            long totalHours = 0;
            long totalRemainingMinutes = 0;
            long totalMinutes = 0;
            for (int i = 0; i < sfclist.size(); i++) {
                ShiftFormComponent sfc = (ShiftFormComponent) sfclist.get(i);
                Date shiftStart = (Date) sfc.getShiftStartDateTimeSpinner().getValue();
                Date shiftEnd = (Date) sfc.getShiftEndDateTimeSpinner().getValue();
                if (areValidDates(sfc.getShiftStartDateTimeSpinner(), shiftStart,
                        shiftEnd)) {
                    long m = HourlyRateShiftCalculator.calculateMinutesDifference(shiftStart, shiftEnd);
                    long h = 0;
                    long remainingMinutes = m;
                    if (m >= 60) {
                        h = m / 60;
                        remainingMinutes = m % 60;
                    }
                    sfc.getHoursTextField().setText(numberFormat.format(h));
                    sfc.getMinutesTextField().setText(numberFormat.format(remainingMinutes));
                    hourlyRateCalculatorFile.addShift(shiftStart, shiftEnd, h, remainingMinutes);
                    totalHours += h;
                    totalMinutes += remainingMinutes;
                } else {
                    return;
                }
            }
            if (totalMinutes >= 60) {
                totalHours = totalHours + (totalMinutes / 60);
                totalRemainingMinutes = totalMinutes % 60;
            } else {
                totalRemainingMinutes = totalMinutes;
            }
            double calculatedHrs = ((double)totalRemainingMinutes / 60) + 
                    (double)totalHours;
            BigDecimal decimalCalculatedHrs = new BigDecimal(Double.toString(calculatedHrs));
            BigDecimal decimalHourlyRate = new BigDecimal(Double.toString(hourlyRate));
            decimalCalculatedHrs.setScale(4, RoundingMode.HALF_UP);
            decimalHourlyRate.setScale(2, RoundingMode.HALF_UP);
            BigDecimal decimalTotalAmount = decimalHourlyRate.multiply(decimalCalculatedHrs);
            double totalAmount = Double.parseDouble(decimalTotalAmount.toString());
            hourlyRateCalculatorFile.setTotalHours(totalHours);
            hourlyRateCalculatorFile.setTotalMinutes(totalRemainingMinutes);
            hourlyRateCalculatorFile.setCalculatedHours(calculatedHrs);
            hourlyRateCalculatorFile.setTotalAmount(totalAmount);
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat number = NumberFormat.getInstance();
            number.setMinimumFractionDigits(4);
            StringBuilder info = new StringBuilder();
            info.append("Rate per hour: ")
                    .append(currency.format(hourlyRate)).append(" ");
            info.append("\nTotal Work Time: ")                 
                    .append(totalHours).append(" hours, ")
                    .append(totalRemainingMinutes)
                    .append(" minutes");
            info.append("\nCalculated Hours: ")
                    .append(number.format(decimalCalculatedHrs));
            info.append("\nTotal Amount: ").append(currency.format(totalAmount));
            displayPlainMessage(this.formPanel, info.toString());
        }
        enableSaveButton();
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        //nameTextField.setEditable(false);
        //hourlyRateTextField.setEditable(false);
        if (hourlyRateCalculatorFile.writeRecordsToFile()) {
            displayPlainMessage(this.formPanel, "File Saved");
        } else {
            displayErrorMessage(this.formPanel, "Error while saving file");
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void nameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c >= 0 && c < 65) || (c > 90 && c < 97) || (c > 122)) {
            evt.consume();
        }
    }//GEN-LAST:event_nameTextFieldKeyTyped

    private void nameAndHrTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameAndHrTextFieldFocusGained
        // TODO add your handling code here:
        JTextComponent jtf = (JTextComponent) evt.getComponent();
        if (evt.getComponent() instanceof JTextComponent) {
            jtf.selectAll();
        }
    }//GEN-LAST:event_nameAndHrTextFieldFocusGained

    private void hourlyRateTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hourlyRateTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c >= 0 && c < 46) || (c == 47) || (c > 57)) {
            evt.consume();
        }
    }//GEN-LAST:event_hourlyRateTextFieldKeyTyped

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_printButtonActionPerformed

    private void hourlyRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourlyRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourlyRateTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ShiftFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShiftFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShiftFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShiftFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShiftFormFrame sff = new ShiftFormFrame();
                sff.setVisible(true);
                sff.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel endLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel hourlyRateLabel;
    private javax.swing.JTextField hourlyRateTextField;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JTextField hoursTextField;
    private javax.swing.JLabel minutesLabel;
    private javax.swing.JTextField minutesTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton newRowButton;
    private javax.swing.JLabel perHourLabel;
    private javax.swing.JButton printButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSpinner shiftEndDateTimeSpinner;
    private javax.swing.JSpinner shiftStartDateTimeSpinner;
    private javax.swing.JLabel shiftsLabel;
    private javax.swing.JLabel startLabel;
    // End of variables declaration//GEN-END:variables

    private boolean isValidData() {
        Validator v = new Validator();
        return v.isPresent(nameTextField, "Name")
                && v.isDouble(hourlyRateTextField, "Hourly Rate");
    }

    private void displayPlainMessage(JComponent c, String message) {
        JOptionPane.showMessageDialog(c, message, "Info",
                JOptionPane.PLAIN_MESSAGE);
    }
    private void displayErrorMessage(JComponent c, String message) {
        JOptionPane.showMessageDialog(c, message, "Info",
                JOptionPane.ERROR_MESSAGE);
    }

    private boolean areValidDates(JSpinner js, Date shiftStart, Date shiftEnd) {
        Validator v = new Validator();
        return v.isValidShift(js, shiftStart, shiftEnd, "Shift start date");
    }

    private void enableSaveButton() {
        saveButton.setEnabled(true);
        saveButton.setFocusable(true);
    }
    private void disableSaveButton() {
        saveButton.setEnabled(false);
    }
    
}
