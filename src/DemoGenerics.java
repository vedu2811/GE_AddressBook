public class DemoGenerics {
//    t a;    // this t represent a generic object and must be initialized
//    DemoGenerics(t b){
//        this.a=b;
//    }
    // Method Overloading..
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public double add(double a, int b,int c){
        return a+b+c;
    }

}
