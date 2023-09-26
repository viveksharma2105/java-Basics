public class DogMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Sheru");
        String nm = d.getName();
        d.setHeight(99);
        int mn = d.getHeight();
        if (mn == -1) {
            System.out.println("Name is " + nm + " and Height is not valid.");
        }
        else {
            System.out.println("Name is " + nm + " and Height is valid which is "+ mn);
        }


    }
}