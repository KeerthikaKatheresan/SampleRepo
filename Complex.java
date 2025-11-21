package com.mphasis.Day1MavenProject;

public class Complex {
	private double real;
	private double imag;
	public Complex(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public Complex add(Complex other)
	{
		double newReal=this.real+other.real;
		double newImag=this.imag+other.imag;
		return new Complex(newReal,newImag);
	}
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
	

}
