class testdemo
{

int id;
String name;

int age; 
testdemo(int id,String name)
{

id=id;

name =name;
}
testdemo(int id,String name,int age)
{
age=age;
 this(id,name);

void detail()
{

System.out.println(name+","+id+","+age);} 
public static void main(String args[]){

testdemo t=new testdemo(34,"shruti",10);

t.detail();
}
}