package DataStructures;

public class PolyPair {
	private int degree;
	private int coeff;

	public PolyPair(int degree,int coeff) {
		this.degree = degree;
		this.coeff = coeff;
	}
	
	public void setDegree(int  degree)
	{
		this.degree = degree;
	}

	public void setCoefficient(int coeff)
	{
		this.coeff = coeff;
	}

	public int getDegree()
	{
		return degree;
	}

	public int getCoefficient()
	{
		return coeff;

	}
}
