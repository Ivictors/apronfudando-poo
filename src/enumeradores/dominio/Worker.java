package enumeradores.dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private double baseSalary;
    private WorkerLevel level;
    private Department department;
    List<HourContract> hourContractList = new ArrayList<>();


    public Worker() {
    }

    public Worker(String name, double baseSalary, WorkerLevel level) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
    }

    public void addContract(HourContract contract) {
        hourContractList.add(contract);
    }

    public void removeContract(HourContract contract) {
        hourContractList.remove(contract);
    }

    public double income(int year, int month) {
       double sum = baseSalary;
       Calendar calendar = Calendar.getInstance();

       for (HourContract hourContract : hourContractList){
           calendar.setTime(hourContract.getDate());

           int contract_year = calendar.get(Calendar.YEAR);
           int contract_month = 1 + calendar.get(Calendar.MONTH);
           if (year == contract_year && month == contract_month){
               sum = hourContract.totalValue();
           }
       }
       return sum;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getHourContractList() {
        return hourContractList;
    }

}
