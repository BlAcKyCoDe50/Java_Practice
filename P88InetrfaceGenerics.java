interface a<T>     //interface can also be type of Generic Type..
{
    T max(T z);
}
class P88InetrfaceGenerics<T> implements a<T>
{
    public T max(T z){
        return z;
    }
    
    public static void main(String[] args) {
        
        P88InetrfaceGenerics<Integer> obj= new P88InetrfaceGenerics<Integer>();
        int abc= obj.max(33);
        System.out.println(abc);
    }
}
