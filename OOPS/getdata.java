class Rectangle{
    int lenght;
    int width;

    void getdata(int x,int y){
        x=lenght;
        y=width;
    }
    int rectarea(){
        int  area=lenght*width;

        return area;
    }
}

public class getdata {
  public static void main(String[] args) {
    int area1,area2;

    Rectangle r1= new Rectangle();
    Rectangle r2= new Rectangle();

    r1.getdata(20, 30);
   int  c=r1.rectarea();
   System.out.println(c);
  }
    
}
