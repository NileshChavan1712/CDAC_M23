class GrossSalary {
public static void main (String args [])
{
	double ba = 1000.8989009;
	System.out.println ("Basic Salary:" +ba);
	
	double ta = 5600.6778;
	System.out.println ("TA:" + ta);
	
	double pa = 7000.3443534546;
	System.out.println ("Petrol Allowance:" +pa);
	
	double da = 14*ba/100;
	System.out.println ("Dearness Allowance:" +da);
	
	double tax = 1.76*da/100;
	System.out.println ("Tax Deduction:" +tax);
	
	double gross = ba+ta+pa+da-tax;
	System.out.println ("GrossSalary:" +gross);
}

}