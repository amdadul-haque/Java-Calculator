package firstcalculator;

public class b1 {
    int income;
    int cgpa;

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }


    public int getIncome() {
        return income;
    }

    public void setIncome(int income,int cgpa) {
        this.income = income;
        this.cgpa = cgpa;
    }

    public b1(int income) {
        this.income = income;
    }
}
