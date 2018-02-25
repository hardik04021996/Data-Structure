package DataStructures;

public class PolyUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolynomialSub p1  =new PolynomialSub();
		p1.setCoefficient(0,7);
		p1.setCoefficient(2,6);
		p1.print();

		PolynomialSub p2 = new PolynomialSub();
		p2.setCoefficient(0,7);
		p2.setCoefficient(2,9);
		p2.print();

		PolynomialSub p3 = p1.Subtraction(p2);
		p3.print();

	}


}
