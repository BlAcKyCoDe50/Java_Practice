class Gen<T>{
    T ob;
    Gen(T o){
        ob=o;
    }
    T getob(){
        return ob;
    }
    void showType(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}



public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer>iOb;
        iOb= new Gen<Integer>(88);
        iOb.showType();
        int v=iOb.getob();
        System.out.println("value:- "+v);
        Gen<String>strOb;
        strOb= new Gen<String>("Generics Test");
        strOb.showType();
        String str=strOb.getob();
        System.out.println("value:- "+str);
    }
}

// public class MyGenericClass<T> {
//     private T value;
 
//     public void setValue(T value) {
//        this.value = value;
//     }
 
//     public T getValue() {
//        return value;
//     }
//  }
 
//  public static void main(String[] args) {
//     MyGenericClass<String> myString = new MyGenericClass<>();
//     myString.setValue("Hello, World!");
//     System.out.println(myString.getValue()); // Output: Hello, World!
 
//     MyGenericClass<Integer> myInteger = new MyGenericClass<>();
//     myInteger.setValue(42);
//     System.out.println(myInteger.getValue()); // Output: 42
//  }
 