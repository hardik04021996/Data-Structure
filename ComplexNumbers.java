package DataStructures;

public class ComplexNumbers {
	private int real;
	private int imag;


	public ComplexNumbers(int real,int imag)
	{
		this.real = real;
		this.imag = imag;
	}

	public void setRealPart(int real)
	{
		this.real = real;
	}


	public void setImaginaryPart(int imag)
	{
		this.imag = imag;
	}

	public int getRealPart()
	{
		return real;
	}

	public int getImaginaryPart()
	{
		return imag;
	}


}
