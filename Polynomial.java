package DataStructures;

import java.util.ArrayList;

public class Polynomial {

	private ArrayList<PolyPair> degcoeff;
	private int degree;

	Polynomial()
	{
		degcoeff = new ArrayList<PolyPair>();
		degree = 0;
	}
	public int degree()
	{
		return degcoeff.get(degcoeff.size()-1).getDegree();
	}

	public void setCoefficient(int degree, int coeff)
	{
		for(int i = 0;i<degcoeff.size();i++)
		{
			PolyPair CurrentPair = degcoeff.get(i);
			if(CurrentPair.getDegree()==degree)
			{
				CurrentPair.setCoefficient(coeff);
				return;
			}
		}

		int pos = degcoeff.size()-1;
		PolyPair CurrentPair = degcoeff.get(pos);
		while(pos>=0&& CurrentPair.getDegree() >degree)
		{
			pos--;
			CurrentPair = degcoeff.get(pos);
		}
		PolyPair newPair = new PolyPair(degree, coeff);
		degcoeff.add(pos+1,newPair);
	}


public void print()
{
	for(int  i=0;i<degcoeff.size();i++)
	{
		PolyPair Currentpair = degcoeff.get(i);
		System.out.print(Currentpair.getDegree()+ " :" +Currentpair.getCoefficient()+" ");
	}
}






public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}
