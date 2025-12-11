import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        Integer a1=10;
//        Double b1=20.0;
//        DemoGenerics<Integer> d1=new DemoGenerics(a1);
//        LinkedList<Integer> a=new LinkedList<Integer>();
//        a.add(10);
//        a.add("Hello");
//        a.add(true);
//        Contact c1=new Contact("Vedant","Jalan","Malancha","Kgp","WB","3334445556","abc@gmail.com",123456);
//        System.out.println(c1);
        Dog d=new Dog();
        d.eat();
        DemoGenerics d1=new DemoGenerics();
        System.out.println(d1.add(2,3));

        Animal a3=new Dog();
        Animal a2=new Cat();
        a3.eat();
        a2.eat();

        Student s1=new Student();
        s1.setName("Vedant");
        s1.setRoll(3);
        s1.setDepartment("Software");

        System.out.println(s1.getDepartment()+" "+s1.getName()+" "+s1.getRoll());

    }
}