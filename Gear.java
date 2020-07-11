import java.io.*;
import java.util.*;


class Gear{
	private int chainring;
	private int cog;
	private float ratio;

	Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
	}

	float calculateRatio(){
		ratio = ((float)chainring)/cog;
		return ratio;
	}

	public static void main(String args[]){
		Gear g1=  new Gear(52, 11);
		Gear g2 = new Gear(30, 27);
		System.out.println(g1.calculateRatio());
		System.out.println(g2.calculateRatio());
	}

}