package Hr_Managment;

public class Main {
    public static void main(String[] args) {
        Analyst employeeOne=new Analyst("Eylül",29,60000);
        Salesperson employeeTwo=new Salesperson("İrem",24,12000,.35);

        employeeOne.getAnnualBonus();
        employeeTwo.raiseCommission();
        employeeTwo.getCommisionPersentage();
        System.out.println("Birinci çalışanın mmaaşı: "+employeeOne.salary);
        System.out.println("Birinci çalışanın yıllık: "+employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommisionPersentage());

    }
}
