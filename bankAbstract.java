/*Write a Program where bank have two methods one as Rules whose functionality will remain same
//for its children but other method name ROI whose Functionaliity will be defined by their 
 children classes(SBI and ICICI)*/
// /HierachicalInheritanceExample


 class Bank{
      void Rules();


}
class  sbi extends Bank{

}
class  ICICI extends Bank{

     abstract void loan();
}

public class bankAbstract {
 public static void main(String[] args) {
    
 }   
}
