class computer extends Machine{ //Child class of Parent Class
    void getPrice(){
        System.out.println("price="+price);
    }
}
class Machine{     //Parent
    int price;
}
    class DownCastingExample{
        public static void main(String[] args) {
            computer c1= new computer();     
            Machine m1= new Machine();
            DownCastingExample b1= new DownCastingExample(); 
            b1.display(m1);
            b1.display(c1);

        }
        void display(Machine mc){
            if( mc instanceof computer){
                computer c2= (computer)mc; //Downcasting
                c2.getPrice();
            }
            else{
                System.out.println("Downcasting not Possible");
            }
        }
    }
