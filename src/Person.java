public class Person {

    private int age;
    private int salary;

    public void setAge(int a) {
        age = a;
        assignSalary();
    }

    public int getAge() {
        return age;
    }

    private void setSalary(int s){
        salary = s;
    }

    private void assignSalary() {
        if (age == 15) {
             setSalary(1800);
        } else if ((age > 15) && (age <= 50)) {
           setSalary(5000);
        } else {
            setSalary(0);
        }
    }

    public int getSalary() {
        return salary;
    }
}
