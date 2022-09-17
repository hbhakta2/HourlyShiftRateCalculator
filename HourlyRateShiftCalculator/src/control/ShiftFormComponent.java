/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Hardikkumar Bhakta
 */
public class ShiftFormComponent extends JComponent {
    
    private JSpinner shiftStartDateTimeSpinner;
    private JSpinner shiftEndDateTimeSpinner;
    private JTextField hoursTextField;
    private JTextField minutesTextField;
    
    private ShiftFormComponent(JSpinner js1, JSpinner js2, JTextField htf,
            JTextField mtf){
        this.shiftStartDateTimeSpinner = js1;
        this.shiftEndDateTimeSpinner = js2;
        this.hoursTextField = htf;
        this.minutesTextField = mtf;
    }
    public static ShiftFormComponent getShiftFormComponent(JSpinner js1, JSpinner js2, JTextField htf,
            JTextField mtf) {
        return new ShiftFormComponent(js1, js2, htf, mtf);
    }

    public JSpinner getShiftStartDateTimeSpinner() {
        return shiftStartDateTimeSpinner;
    }

    public void setShiftStartDateTimeSpinner(JSpinner shiftStartDateTimeSpinner) {
        this.shiftStartDateTimeSpinner = shiftStartDateTimeSpinner;
    }

    public JSpinner getShiftEndDateTimeSpinner() {
        return shiftEndDateTimeSpinner;
    }

    public void setShiftEndDateTimeSpinner(JSpinner shiftEndDateTimeSpinner) {
        this.shiftEndDateTimeSpinner = shiftEndDateTimeSpinner;
    }

    public JTextField getHoursTextField() {
        return hoursTextField;
    }

    public void setHoursTextField(JTextField hoursTextField) {
        this.hoursTextField = hoursTextField;
    }

    public JTextField getMinutesTextField() {
        return minutesTextField;
    }

    public void setMinutesTextField(JTextField minutesTextField) {
        this.minutesTextField = minutesTextField;
    }
    
}