/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.ShiftFormComponent;
import control.ShiftFormFrame;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Shift;

/**
 *
 * @author Hardikkumar Bhakta
 */
public class HourlyRateCalculatorFile{
    
    private String name;
    private double hourlyRate;
    private ArrayList<Shift> shiftList;
    private long totalHours;
    private long totalMinutes;
    private double calculatedHours;
    private double totalAmount;
    
    public HourlyRateCalculatorFile() {
        shiftList = new ArrayList<>();
    }
    
    public void addShift(Date shiftStart, Date shiftEnd, 
            long hours, long remainingMinutes) {
        shiftList.add(new Shift(shiftStart, shiftEnd, hours, remainingMinutes));
    }

    public ArrayList<Shift> getShiftList() {
        return shiftList;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean writeRecordsToFile() {
        NumberFormat number = NumberFormat.getInstance();
        number.setMinimumFractionDigits(4);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(
                    new FileWriter("shiftLog.txt")));
            
            pw.println("Name: " + this.getName());
            pw.println("Hourly Rate: " + this.getHourlyRate());
            pw.println("-----------------------------------------------------" 
                    + "--------------------------");
            pw.println("ShiftStartTime\t\t\tShiftEndTime\t\t\tHours\tMinutes");
            //pw.println("--------------\t\t\t------------\t\t\t-----\t-------");
            pw.println("-----------------------------------------------------" 
                    + "--------------------------");
            for (Shift s : shiftList) {
                pw.print(s.getStartTime().toString() + "\t");
                pw.print(s.getEndTime().toString() + "\t");
                pw.print(s.getHours() + "\t");
                pw.print(s.getMinutes() + "\t");
                pw.println();
            }
            pw.println("-----------------------------------------------------" 
                    + "--------------------------");
            pw.println("Total\t\t\t\t\t\t\t\t" + totalHours + "\t" + totalMinutes);
            pw.println("Calculated Hours: " + number.format(calculatedHours));
            pw.println("-----------------------------------------------------" 
                    + "--------------------------");
            pw.println("Total Amount = Hourly Rate * Calculated Hours = " 
                    + currency.format(totalAmount));
            pw.println("-----------------------------------------------------" 
                    + "--------------------------");
            pw.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public void setTotalHours(long hours) {
        this.totalHours = hours;
    }
    
    public void setTotalMinutes(long minutes) {
        this.totalMinutes = minutes;
    }
    
    public void setCalculatedHours(double calculatedHours) {
        this.calculatedHours = calculatedHours;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
}
