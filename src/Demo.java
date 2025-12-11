interface Y{
    void a();
}
interface X{
    void a();
}
public class Demo{
    public static void main(String[] args) {
        Z z=new Z();
        z.a();
    }
}
class Z implements X,Y{
    public void a(){
        System.out.println("a");
    }
}
