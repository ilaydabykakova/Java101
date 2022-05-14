package OPP.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double raiseSalary;
    double bonus = 0.0;

    public Employee(String name,double salary,int workHours,int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public  double tax(){
        if (salary <= 1000 && salary >=0){
            tax = salary;
        }
        else if (salary > 1000){

            tax = salary * 0.03;
        }
        else {
            System.out.println("You entered invalid salary !");
        }
        return tax;
    }
    public double bonus(){
        if (workHours > 40){
            while ((workHours - 40) > 0) {
                bonus = bonus + 30;
                workHours--;
            }
        }
        return bonus;
    }
    public double raiseSalary(){
        if ((2022- hireYear) < 10 ){
            raiseSalary = salary * 0.05;
        }
        else if ( (2022- hireYear) > 9 && (2022- hireYear) < 20){
            raiseSalary = salary * 0.1;
        }
        else if ((2022- hireYear) > 19){
            raiseSalary = salary * 0.15;
        }
        else{
            raiseSalary = salary;
        }

        return raiseSalary;
    }
    public  void toMyString(){

        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
        System.out.println("Work Hours: "+ workHours);
        System.out.println("Hire Year: "+hireYear);
        System.out.println("Tax: "+ tax());
        System.out.println("Bonus: "+ bonus());
        System.out.println("Raising Salary: "+ raiseSalary());

        System.out.println("Salary with tax and bonus: "+ ((salary-tax)+bonus));

        System.out.println("Total Salary: "+ ((salary-tax)+bonus+raiseSalary));

    }

}
