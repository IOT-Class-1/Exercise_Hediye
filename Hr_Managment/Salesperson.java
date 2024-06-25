package Hr_Managment;

public class Salesperson extends Employee {
private  double commisionPersentage;

    public Salesperson(String name, int age, double salary,double commisionPersentage) {
        super(name, age, salary);
        this.commisionPersentage=commisionPersentage;
    }
    public double getCommisionPersentage(){
        return  this.commisionPersentage;
    }

    public void raiseCommission(){
        if(this.commisionPersentage<.30){
            this.commisionPersentage=this.commisionPersentage*1.2;
        }
    }
}
