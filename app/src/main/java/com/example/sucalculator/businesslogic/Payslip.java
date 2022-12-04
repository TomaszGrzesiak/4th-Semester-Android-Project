package com.example.sucalculator.businesslogic;

public class Payslip {
    int ID;
    double taxedIncome, nonTaxedIncome, taxedFritsvalgAndFeriepenge;
    int weekNumber;
    String notes;

    public Payslip(int ID, double taxedIncome, double nonTaxedIncome, double taxedFritsvalgAndFeriepenge, int weekNumber, String notes) {
        this.ID = ID;
        this.taxedIncome = taxedIncome;
        this.nonTaxedIncome = nonTaxedIncome;
        this.taxedFritsvalgAndFeriepenge = taxedFritsvalgAndFeriepenge;
        this.weekNumber = weekNumber;
        this.notes = notes;
    }

    public Payslip(double taxedIncome, double nonTaxedIncome, double taxedFritsvalgAndFeriepenge, int weekNumber, String notes) {
        this.ID = 1970;
        this.taxedIncome = taxedIncome;
        this.nonTaxedIncome = nonTaxedIncome;
        this.taxedFritsvalgAndFeriepenge = taxedFritsvalgAndFeriepenge;
        this.weekNumber = weekNumber;
        this.notes = notes;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getTaxedIncome() {
        return taxedIncome;
    }

    public void setTaxedIncome(double taxedIncome) {
        this.taxedIncome = taxedIncome;
    }

    public double getNonTaxedIncome() {
        return nonTaxedIncome;
    }

    public void setNonTaxedIncome(double nonTaxedIncome) {
        this.nonTaxedIncome = nonTaxedIncome;
    }

    public double getTaxedFritsvalgAndFeriepenge() {
        return taxedFritsvalgAndFeriepenge;
    }

    public void setTaxedFritsvalgAndFeriepenge(double taxedFritsvalgAndFeriepenge) {
        this.taxedFritsvalgAndFeriepenge = taxedFritsvalgAndFeriepenge;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
