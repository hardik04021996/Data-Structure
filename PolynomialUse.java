package DataStructures;

public class PolynomialUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolynomialAddition p1  =new PolynomialAddition();
		p1.setCoefficient(5,7);
		p1.setCoefficient(2,6);
		p1.print();

		PolynomialAddition p2 = new PolynomialAddition();
		p2.setCoefficient(0,1);
		p2.setCoefficient(9,3);
		p2.print();

		PolynomialAddition p3 = p1.Addition(p2);
		p3.print();
		
	}

}
