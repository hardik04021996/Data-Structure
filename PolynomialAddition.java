package DataStructures;

import java.util.ArrayList;

public class PolynomialAddition {

	private ArrayList<PolyPair> degcoeff;
	//private int degree;

	public PolynomialAddition() 
	{
		degcoeff = new ArrayList<PolyPair>();
		//degree = 0;
	}
	public int degree()
	{
		return degcoeff.get(degcoeff.size()-1).getDegree();
	}

	public void setCoefficient(int degree, int coeff){

		for(int i =0; i < degcoeff.size(); i++){
			PolyPair currentPair = degcoeff.get(i);
			if(currentPair.getDegree() == degree){
				currentPair.setCoefficient(coeff);
				return;
			}
		}
		int pos = degcoeff.size() - 1;
		//if(pos!=-1)


		//PolyPair currentPair = degcoeff.get(pos);
		while(pos >= 0 && degcoeff.get(pos).getDegree() > degree){
			pos--;
			//currentPair = degcoeff.get(pos);
		}
		//}
		PolyPair newPair = new PolyPair(degree,coeff);
		degcoeff.add(pos+1, newPair);
	}



	public PolynomialAddition Addition(PolynomialAddition p)
	{
		int i =0,j=0;
		PolyPair Currentpair1;
		PolyPair Currentpair2;
		PolynomialAddition output = new PolynomialAddition();

		while(i<degcoeff.size() && j<p.degcoeff.size())
		{
			Currentpair1 = degcoeff.get(i);
			Currentpair2 = p.degcoeff.get(j);
			if(Currentpair1.getDegree()==Currentpair2.getDegree())
			{
				output.setCoefficient(Currentpair1.getDegree(),Currentpair1.getCoefficient()+Currentpair2.getCoefficient());
				i++;
				j++;
			}
			else if(Currentpair1.getDegree()<Currentpair2.getDegree())
			{
				output.setCoefficient(Currentpair1.getDegree(),Currentpair1.getCoefficient());
				i++;
			}
			else
			{
				output.setCoefficient(Currentpair2.getDegree(), Currentpair2.getCoefficient());
				j++;
			}
		}
		while(i<degcoeff.size())
		{
			Currentpair1 = degcoeff.get(i);
			output.setCoefficient(Currentpair1.getDegree(),Currentpair1.getCoefficient());
			i++;
		}
		while(j<p.degcoeff.size())
		{
			Currentpair2 = p.degcoeff.get(j);
			output.setCoefficient(Currentpair2.getDegree(), Currentpair2.getCoefficient());
			j++;
		}
		return output;
	}


	public void print()
	{
		System.out.println(degcoeff.size());
		for(int  i=0;i<degcoeff.size();i++)
		{
			PolyPair Currentpair = degcoeff.get(i);
			System.out.print(Currentpair.getDegree()+ " :" +Currentpair.getCoefficient()+" ");
			System.out.println("inside");
		}
		System.out.println("outside");
	}


}








