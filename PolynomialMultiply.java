package DataStructures;

import java.util.ArrayList;

public class PolynomialMultiply {
	private ArrayList<PolyPair> degcoeff;
	
	
	
	public  PolynomialMultiply()
	{
		degcoeff = new ArrayList<PolyPair>();
	}
	public int degree()
	{
		return degcoeff.get(degcoeff.size()-1).getDegree();
	}


	public void setCoefficient(int degree,int coeff)
	{
		for(int i =0; i < degcoeff.size(); i++){
			PolyPair currentPair = degcoeff.get(i);
			if(currentPair.getDegree() == degree){
				currentPair.setCoefficient(coeff);
				return;
			}
		}
		int pos = degcoeff.size() - 1;
		while(pos >= 0 && degcoeff.get(pos).getDegree() > degree){
			pos--;
		}
		PolyPair newPair = new PolyPair(degree,coeff);
		degcoeff.add(pos+1, newPair);
	}
	
	
	public PolynomialMultiply Multipliation(PolynomialMultiply p)
	{
		int i =0,j=0;
		PolyPair Currentpair1;
		PolyPair Currentpair2;
		PolynomialMultiply output = new PolynomialMultiply();
	}
}
