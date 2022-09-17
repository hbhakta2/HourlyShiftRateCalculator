/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hourlyrateshiftcalculator;

import control.ShiftFormComponent;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Hardikkumar Bhakta
 */
public class Validator {
    
    public boolean isPresent(JTextComponent c, String title)
    {
        if (c.getText().length() == 0)
        {
            showMessage(c, title + " is a required field.");
            c.requestFocusInWindow();
            return false;
        }
        return true;
    }
    
    public boolean isDouble(JTextComponent c, String title)
    {
        try
        {
            double d = Double.parseDouble(c.getText());
            return true;
        }
        catch (NumberFormatException e)
        {
            showMessage(c, title + " must be a valid number.");
            c.requestFocusInWindow();
            return false;
        }
    }
    public boolean isValidShift(JSpinner js, Date startDate, Date endDate,
            String title) {
        JComponent c = (JComponent) js;
        if (endDate.getTime() > startDate.getTime()) {
            
            return true;
        } else {
            JOptionPane.showMessageDialog(c, 
                    "Shift start date cannot be greater than or equal to shift end date",
                    "Invalid Entry",
                JOptionPane.ERROR_MESSAGE);
            c.requestFocusInWindow();
            return false;
        }
    }
    private void showMessage(JTextComponent c, String message)
    {
            JOptionPane.showMessageDialog(c, message, "Invalid Entry",
                JOptionPane.ERROR_MESSAGE);
    }
}
