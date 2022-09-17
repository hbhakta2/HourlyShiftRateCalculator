/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hourlyrateshiftcalculator;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Hardikkumar Bhakta
 */
public class HourlyRateShiftCalculator {

    public static long calculateMinutesDifference(Date start, Date end) {
        long diff = 0L;
        return ((end.getTime() - start.getTime()) / 1000) / 60;
    }
    
    
}
