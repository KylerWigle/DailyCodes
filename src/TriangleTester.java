

public class TriangleTester
{

	public static void main(String[] args)
	{
		//Introduction
		System.out.println("Welcome to the Triangle tester!");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("This program will instantiate objects of Triangle and "
				+ "test all of the methods of the Triangle class.");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		// Create the first triangle
		Triangle triangle1 = new Triangle();
		
		
		// Testing getters
		System.out.println("For triangle1 length of base is:	       " + triangle1.getBase());
		System.out.println("For triangle1 length of side 1 is:	       " + triangle1.getSide1());
		System.out.println("For triangle1 length of side 2 is:	       " + triangle1.getSide2());
		System.out.println("For triangle1 colour is:		       " + triangle1.getColour());
		
		
		//create the second triangle
		Triangle triangle2 = new Triangle(3.0, 4.0, 5.0, "red");
		
		//Second triangle toString
		System.out.println("\nTriangle 2:");
		System.out.println(triangle2.toString());
		
		System.out.print("\nTesting setter methods on triangle1.");
		
		//testing setters
		triangle1.setBase(15.5);
		triangle1.setSide1(15.5);
		triangle1.setSide2(15.5);
		triangle1.setColour("green");
		
		// First Triangle toString
		System.out.println("\nTriangle 1:");
		System.out.println(triangle1.toString());
		
		// Testing utility methods
		System.out.println("For triangle1 the perimeter is:  " + triangle1.calculatePerimeter());
		System.out.println("For triangle2 the perimeter is:  " + triangle2.calculatePerimeter());
		System.out.println("");
		System.out.println("For triangle1 the area is:  " + triangle1.calculateArea());
		System.out.println("For triangle2 the area is:  " + triangle2.calculateArea());
		System.out.println("");
		System.out.println("Is triangle1 an isosceles triangle?  " + triangle1.isEquilateral());
		System.out.println("Is triangle2 an isosceles triangle?  " + triangle2.isEquilateral());
		System.out.println("");
		System.out.println("Is triangle1 an isosceles triangle?  " + triangle1.isIsosceles());
		System.out.println("Is triangle2 an isosceles triangle?  " + triangle2.isIsosceles());
		
		System.out.println("\nTesting bonus mark stratic perimeter method");
		System.out.println("For a triangle with Base of 4.75, Side 1 of 4.75, Side 2 of 4.75, the perimeter "
				+ "is:  " + triangle1.calculatePerimeter(4.75, 4.75, 4.75));
	}
	

}
