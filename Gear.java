import java.io.*;
import java.util.*;


class Gear{
	private int chainring;
	private int cog;
	private int rim;
	private double tire;
	private double ratio;

	Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
	}

	Gear(int chainring, int cog, int rim, double tire){
		this(chainring, cog);
		this.rim = rim;
		this.tire = tire;
	}

	double calculateRatio(){
		ratio = ((double)chainring)/cog;
		return ratio;
	}

	double calculateGearInches(){
		return ratio*(rim + tire * 2);
	}

	public static void main(String args[]){
		Gear g1=  new Gear(52, 11, 24, 1.5);
		Gear g2 = new Gear(30, 27);
		System.out.println(g1.calculateRatio());
		System.out.println(g2.calculateRatio());
		System.out.println(g1.calculateGearInches());
	}

}