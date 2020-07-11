import java.io.*;
import java.util.*;


class Gear{
	private int chainring;
	private int cog;
	private int rim;
	private Wheel w;
	private double ratio;
	private double diameter;

	Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
		this.w = null;
		this.diameter = 0;
	}
	
	Gear(int chainring, int cog, Wheel w){
		this(chainring, cog);
		this.w = w;
		this.diameter = this.w.getDiameter();
	}


	double getGearInches(){
		ratio = ((double)chainring)/cog;
		return ratio * diameter;
	}
	

	public static void main(String args[]){
		Wheel w = new Wheel(24, 1.5);
		Gear g1=  new Gear(52, 11, w);
		Gear g2 = new Gear(30, 27, w);
		
		System.out.println(w.getDiameter());
		System.out.println(w.getCircumference());
		System.out.println(g1.getGearInches());
		// System.out.println(g1.calculateRatio());
		// System.out.println(g2.calculateRatio());
		// System.out.println(g1.calculateGearInches());
	}

}