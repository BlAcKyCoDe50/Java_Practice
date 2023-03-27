
//Abstract keyword is used when the Method is not declared then we have to write Abstract before class name.
//if the Class is have Abstract then it is compulsory that the function has to be Abstract .

//Abstract is used when method does not have any definition 
//EX:- sample(); <---in this mehtod it does not have any definiotion.

/*Write a program where Bank class have two methods one as Rules whose functionality will remain
same for its children but other method name ROI whose functionality will be defined by their
children classes(SBI and ICICI)*/

//HierarchicalInheritanceExample

abstract class Bank{
    abstract void ROI();
    final void rules(){
        System.out.println("rules should be followed");
    }
}

abstract class  ICICI extends Bank{
    void ROI(){
        System.out.println("Rate of interest of icici is 7%");
    }
    abstract void HomeLOan();
}

class SBI extends Bank{
    void ROI(){
        System.out.println("Rate of interest of SBI is 9%");
    }
}

class HierarchicalInheritanceExample{
    public static void main(String[] args) {
        Bank obj=new ICICI() {
            
        };
        obj.ROI();
        obj.rules();

        Bank obj1=new SBI();
        obj1.ROI();
        obj1.rules();
    }
}
