package enumeradores.teste;

import enumeradores.dominio.Department;
import enumeradores.dominio.HourContract;
import enumeradores.dominio.Worker;
import enumeradores.dominio.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WorkerTest {
    public static void main (String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many contracts to this worker?");
        int contracts = sc.nextInt();
        System.out.println();

        System.out.println("First name: WORKER");
        String name = sc.next();
        System.out.println("Enter base salary:");
        double baseSalary = sc.nextDouble();
        System.out.println("Enter with level: junior / mid_level/ senior");
        String levelWorker = sc.next();
        System.out.println("Enter Department:");
        Department department = new Department(sc.next());
        Worker worker = new Worker(name, baseSalary, WorkerLevel.valueOf(levelWorker));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < contracts; i++) {
            System.out.println("Enter with date of contract down: dd/mm/yyyy");
            Date contractDate  = sdf.parse(sc.next());
            System.out.println("Enter with value per hour down:");
            double valueHour = sc.nextDouble();
            System.out.println("Enter with duration of contract worker, down:");
            int duration = sc.nextInt();
            sc.nextLine();
            HourContract hourContract = new HourContract(contractDate,valueHour,duration);
            worker.addContract(hourContract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY):");
        String date = sc.nextLine();
        System.out.println(worker.getName());
        System.out.println(worker.getDepartment());
        worker.income(2018,8);
        sc.close();
    }
}
