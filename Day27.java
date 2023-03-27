import java.util.Scanner;
class Employee{
     private int id,age;
    Employee(int id,int age){
        this.id=id;
        this.age=age;
}



class Day27{
    public void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
    int n=sc.nextInt();
    if(n<1 ||n>10){
        System.out.println("Inavalid Input");
    }

    int[] arr= new int[n];
    int id,age;
    for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter id:- ");
             id=sc.nextInt();
            System.out.println("Enter age:- ");
             age= sc.nextInt();
             if(age<18 || id<10){
                System.out.println("Invalid data");
             }
             Employee e1= new Employee(id, age);
             if(id<30){
                System.out.println(id);
                System.out.println(age);
                
            }
}

}

    
}


