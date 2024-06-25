package Hr_Managment;

public class Employee {

    private String name;
    protected  double salary;
    private  int age;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public int getAge() {
        return age;
    }

    public  void resalary(){
        this.salary=this.salary*1.2;
    }
}
