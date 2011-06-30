package de.vogella.junit.first;
/*
 * Homework 3 part 2
 * name: Jared Dunn 
 * Teacher:Olga
 * bugs:none
 */
public class Package 
{
public double Weight;
public String Trans;
public double Costs[]= {2.00 ,1.50, .50, 3.00, 2.35, 1.50, 4.50, 3.25, 2.15};
public double Price;
public String Box;

public Package()
 {
	Weight = 2.0;
//	Box = new String ("Your Weight is "+ Weight + " Ounces    Your Transportation is " + Trans + "    Your Price of Shipping is $" + this.getCost());	
 }
public double getWeight(String c, double a, double b)
 {
	return Weight + a + b;
 }

public char getTrans()
 {
	return Trans.charAt(0);
 }
public double getCost( String T)
 {
	;
	Trans = T;
	
  if(Weight <= 8)
	{
	  if (Trans.charAt(0) == 'A' || Trans.charAt(0) == 'a')
	  {
		  Price = Costs[0];
	  } 
	  else if (Trans.charAt(0) == 'T' || Trans.charAt(0) == 't')
	  {
		  Price = Costs[1];
	  }
	  else if (Trans.charAt(0) == 'M'||Trans.charAt(0) == 'm')
	  {
		  Price = Costs[2];	
	  }
  }
  else if(Weight >=9 && Weight<= 16)
	{
	  if (Trans.charAt(0) == 'A' || Trans.charAt(0) == 'a')
	  {
		 Price = Costs[3];
	  } 
	  else if (Trans.charAt(0) == 'T' || Trans.charAt(0) == 't')
	  {
		 Price = Costs[4];
	  }
	  else if (Trans.charAt(0) == 'M'||Trans.charAt(0) == 'm')
	  {
		 Price = Costs[5];	
	  }
    }
  else
	{
	  if (Trans.charAt(0) == 'A' || Trans.charAt(0) == 'a')
	  {
		 Price = Costs[6];
	  } 
	  else if (Trans.charAt(0) == 'T' || Trans.charAt(0) == 't')
	  {
		 Price = Costs[7];
	  }
	  else if (Trans.charAt(0) == 'M'||Trans.charAt(0) == 'm')
	  {
		 Price = Costs[8];	
	  }
	}
 return Price;
 }

public String toString()
 {
   return Box;
 }
}