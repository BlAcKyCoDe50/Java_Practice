class Gen<T> {
    // T ob;
    T s1, s2;
    
    Gen(T s3, T s4) {
    this.s1 = s3;
    this.s2 = s4;
    }
    
    // T getob() {
    // return ob;
    // }
    
    T firstArgument() {
    return s1;
    }
    
    T secondArgument() {
    return s2;
    }
    
    void showType() {
    System.out.println("Type of T is " + s1.getClass().getName()+"\n"+s2.getClass().getName());
    }
    }
    
    public class GenericSecondClass {
    public static void main(String[] args) {
    Gen<String> obj = new Gen<String>("Vishvajeet", "Singh");
    obj.showType();
    String str = obj.firstArgument() + obj.secondArgument();
    System.out.println(str);
    Gen<Integer> obj2 = new Gen<Integer>(5, 8);
    int add = obj2.firstArgument() + obj2.secondArgument();
    System.out.println(add);
    Gen<Double> obj3 = new Gen<Double>(5.0, 8.34);
    System.out.println(obj3.firstArgument() + obj3.secondArgument());
    }
    }