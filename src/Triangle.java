-/**
 * Class Name:		Triangle
 * Purpose 			This object will represent a triangle
 * Coder:			Kyler
 * Date:			February 3nd, 2022
 */



public class Triangle
{
	private double base;
	private double side1;
	private double side2;
	private String colour;


	public Triangle()
	{
		this.base = 1.0;
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.colour = "Black";
	}
	
	public Triangle(double base, double side1, double side2, String colour)
	{
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
		this.colour = colour;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public void setBase(double base)
	{
		this.base = base;
	}
	
	public void setSide1(double side1)
	{
		this.side1 = side1;
	}
	
	public void setSide2(double side2)
	{
		this.side2 = side2;
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	/*Method Name: calculatePerimeter
	*Purpose: This will calculate the perimeter of a triangle
	*Accepts: 
	*Returns: The perimeter of the triangle
	*/
	public double calculatePerimeter()
	{
		double perimeter = side1 + side2 + base;
		return perimeter;
	}
	
	/*Method Name: calculatePerimeter
	*Purpose: This will calculate the perimeter of a triangle
	*Accepts: double side1, double side2, double base
	*Returns: The perimeter of the triangle
	*/
	public double calculatePerimeter(double side1, double side2, double base)
	{
		double perimeter = side1 + side2 + base;
		return perimeter;
	}
	
	/*Method Name: calculateArea
	*Purpose: This will calculate the Area of a triangle
	*Accepts: double side1, double side2, double base
	*Returns: The Area of the triangle
	*/
	public double calculateArea()
	{
		 double p = (side1+side2+base)/2;       
	     return Math.sqrt(p*(p-side1)*(p-side2)*(p-base));
	}
	
	
	/*Method Name: isEquilateral
	*Purpose: This will return true or false if the triangle is equilateral
	*Accepts: double side1, double side2, double base
	*Returns: true or false if the triangle is equilateral
	*/
	public boolean isEquilateral()
	{
		if (side1 == side2 && side1 == base && side2 == base)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/*Method Name: isIsosceles
	*Purpose: This will return true or false if the triangle is Isosceles
	*Accepts: double side1, double side2, double base
	*Returns: true or false if the triangle is Isosceles
	*/
	public boolean isIsosceles()
	{
		if (side1 == side2 || side1 == base || side2 == base)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/*Method Name: toString
	*Purpose: This will return a table with all of the traingles information
	*Accepts: double side1, double side2, double base
	*Returns: String
	*/
	public String toString()
	{
		return "Base:        " + base + "\n" + "Side 1:      " + side1 + "\n" + "Side 2:      "
				+ side2 + "\n" + "Colour:      " + colour + "\n";
		
	}
	
	
	
	
	
	
}