package domain;
public class Salesman extends Employee {
    
    private double percentPerSold;
    private double soldAmout;
    
    public Salesman(String code, 
                    String name, 
                    String address, 
                    int age, 
                    double salary,
                    double percentPerSold,
                    double soldAmout) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmout = soldAmout;
    }

    public Salesman() {
    }
    
    @Override
    public String getCode() {
        return "SL" + this.code;
    }
    
    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmout() {
        return soldAmout;
    }

    public void setSoldAmout(double soldAmout) {
        this.soldAmout = soldAmout;
    }

    public double getFullSalary() {
        return this.salary + ((soldAmout * percentPerSold) / 100);
    }
}
