class Box {
    int Boxid;
    float length;
    float breadth;
    float height;


    void boxColor(String top, 
                  String bottom,
                  String front,
                  String back,
                  String left, 
                  String right) {

        String topColor = top;
        String bottomColor = bottom;
        String frontColor = front;
        String backColor = back;
        String leftColor = left;
        String rightColor = right;

        System.out.println("Top Color: " + topColor);
        System.out.println("Bottom Color: " + bottomColor);
        System.out.println("Front Color: " + frontColor);
        System.out.println("Back Color: " + backColor);
        System.out.println("Left Color: " + leftColor);
        System.out.println("Right Color: " + rightColor);
    }
}

public class Box1 {
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.Boxid =1;
        b1.length = 10.5f;
        b1.breadth = 3.4f;
        b1.height = 5.0f;
                
        System.out.println("Box ID:"+b1.Boxid);
        System.out.println("length:"+b1.length);
        System.out.println("breadth:"+b1.breadth);
        System.out.println("Height:"+ b1.height);
        b1.boxColor("Red", "Blue", "Green", "Yellow", "White", "Black");

        System.out.println();


       Box b2 = new Box();
       b2.Boxid=2;
       b2.length=12.3f;
       b2.breadth=23.4f;
       b2.height=9.4f;
       System.out.println("Box ID: " + b2.Boxid);
       System.out.println("length" + b2.length);
       System.out.println("breadth"+ b2.breadth);
       System.out.println("Height"+ b2.height);
       b2.boxColor("white","blue", "black", "yellow", "black", "black");
    
       System.out.println();
       
       Box b3= new Box();
       b3.Boxid=3;
       b3.length=23.4f;
       b3.breadth=23.2f;
       b3.height=34.1f;
       System.out.println("BoxId:"+ b3.Boxid);
       System.out.println("Boxlength:"+b3.length);
       System.out.println("BoxBreadth:"+b3.breadth);
       System.out.println("Height:"+b3.height);
      b3.boxColor("White", "white", "white", "black", "light", "red");
      
      System.out.println();

       Box b4= new Box();
       b4.Boxid=4;
       b4.length=24.4f;
       b4.breadth=13.2f;
       b4.height=14.1f;
       System.out.println("BoxId:"+ b4.Boxid);
       System.out.println("Boxlength:"+b4.length);
       System.out.println("BoxBreadth:"+b4.breadth);
       System.out.println("Height:"+b4.height);
       b4.boxColor("White", "white", "white", "black", "light", "red");
       
       System.out.println();

       Box b5 = new Box();
       b5.Boxid=5;
       b5.length=23.5f;
       b5.breadth=21.3f;
       b5.height=32.2f;
       System.out.println("BoxId:"+ b5.Boxid);
       System.out.println("Boxlength:"+b5.length);
       System.out.println("BoxBreadth:"+b5.breadth);
       System.out.println("Height:"+b5.height);
       b5.boxColor("White", "white", "white", "black", "light", "red");

       System.out.println();

       Box b6= new Box();
       b6.Boxid=6;
       b6.length=12.4f;
       b6.breadth=21.4f;
       b6.height=12.3f;
       System.out.println("BoxId:"+ b6.Boxid);
       System.out.println("Boxlength:"+b6.length);
       System.out.println("BoxBreadth:"+b6.breadth);
       System.out.println("Height:"+b6.height);
       b6.boxColor("yellow", "yellow", "white", "blue", "white", "white");

       System.out.println();

       Box b7= new Box();
       b7.Boxid=7;
       b7.length=12.4f;
       b7.breadth=1.9f;
       b7.height=12.4f;
       System.out.println("BoxId:"+ b7.Boxid);
       System.out.println("Boxlength:"+b7.length);
       System.out.println("BoxBreadth:"+b7.breadth);
       System.out.println("Height:"+b7.height);
       b7.boxColor("black", "green", "white", "black", "red", "black");
       
       System.out.println();

       Box b8= new Box();
       b8.Boxid=8;
       b8.length=12.4f;
       b8.breadth=12.4f;
       b8.height=11.11f;
       System.out.println("BoxId:"+ b8.Boxid);
       System.out.println("Boxlength:"+b8.length);
       System.out.println("BoxBreadth:"+b8.breadth);
       System.out.println("Height:"+b8.height);
       b8.boxColor("white", "green", "white", "white", "red", "yellow");
       
       System.out.println();

       Box b9= new Box();
       b9.Boxid=9;
       b9.length=1.4f;
       b9.breadth=2.4f;
       b9.height=1.15f;
       System.out.println("BoxId:"+ b9.Boxid);
       System.out.println("Boxlength:"+b9.length);
       System.out.println("BoxBreadth:"+b9.breadth);
       System.out.println("Height:"+b9.height);
       b9.boxColor("blue", "green", "black", "white", "green", "yellow");
       
       System.out.println();
       
       Box b10= new Box();
       b10.Boxid=10;
       b10.length=12.3f;
       b10.breadth=230.2f;
       b10.height=78.2f;
       System.out.println("BoxId:"+ b10.Boxid);
       System.out.println("Boxlength:"+b10.length);
       System.out.println("BoxBreadth:"+b10.breadth);
       System.out.println("Height:"+b10.height);
       b10.boxColor("green", "green", "blue", "blue", "green", "green");
       
     
    }
}
