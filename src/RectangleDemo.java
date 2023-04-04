import java.util.Scanner;

class RectangleArea{
    static float SideA,SideB,Result;

    static void getData(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the length of the side a:\n");
        SideA = myObj.nextFloat();
        System.out.println("Enter the length of the side b:\n");
        SideB = myObj.nextFloat();
        computeField();

    }
    static float computeField(){
        Result = SideA*SideB;
        return Result;

    }
    static void fieldDisplay(){
        System.out.println("The RectangleArea of the Rectangle with side a "+SideA+" and side b "+SideB+" is : "+Result);
    }

}

public class RectangleDemo {

    public static void main(String[] args) {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();

    }
}