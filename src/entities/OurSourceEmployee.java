package entities;

public class OurSourceEmployee extends Employee {
    private Double addtionalCharge;

    public OurSourceEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }
    
    @Override
    public Double payment(){
        return super.payment() + addtionalCharge * 1.1;
    }

    public String toString(){
        return getName() + 
                " - $" + 
                payment();
    }
    
}
