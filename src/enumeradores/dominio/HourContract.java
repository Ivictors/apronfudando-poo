package enumeradores.dominio;


import java.util.Date;

public class HourContract {
    private Date date;
    private double valueHour;
    private int hours;

    public HourContract() {
    }

    public HourContract(Date date, double valueHour, int hours) {
        this.date = date;
        this.valueHour = valueHour;
        this.hours = hours;
    }

    public double totalValue(){
        return valueHour*hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValueHour() {
        return valueHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
