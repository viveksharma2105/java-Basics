public class Logsmain {
    public static void main(String[] args) {
        int count = 15;
        int t = 0;
        Person[] officeRegister = new Person[count];

        while (t < count) {
            officeRegister[t] = new Person();

            officeRegister[t].setAge((int) (Math.random() * 51) + 15);
            int pay = officeRegister[t].getSalary();
            int vs = officeRegister[t].getAge();

            t++;

            System.out.println("Age is " + vs + " salary is " + pay);
        }
    }
}
