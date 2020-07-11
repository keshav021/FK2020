import java.io.*;
import java.util.*;


class Wheel{
	private int rim;
	private double tire;
	private double circumference;
	private double diameter;

	Wheel(int rim, double tire){
		this.rim = rim;
		this.tire = tire;
		diameter = rim + tire*2;
		circumference  = diameter*3.14;
	}

	double getDiameter(){
		return diameter;
	}

	double getCircumference(){
		return circumference;
	}
}