package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento:");
        String departmentName = sc.nextLine();
        System.out.println("Digite os dados do trabalhador:");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Senioridade: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salario base: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("Quantos contratos tem o trabalhador? (somente numeros) ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Entre com o contrato #" + i );
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Entre com o mes e o ano para calcular o salario (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt( monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome do trabalhador:" + workerName);
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("O trabalhador ganhará referente a " + month + "/" + year + "o valor de: " + String.format("%.2f", worker.income(year, month)));
        
        sc.close();

    }

}