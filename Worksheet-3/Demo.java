class Example {
    private int number;
    private String name;
    public void setNumber(int number) {
        this.number= number;
    }
    public void setName(String name) {
        this.name= name;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Example obj= new Example();
        obj.setNumber(10);
        obj.setName("Suhail Ahmed");
        int number= obj.getNumber();
        String name= obj.getName();
        System.out.println("The number sent in argument is: "+number);
        System.out.println("The name sent in argument is: "+name);
    }
}
