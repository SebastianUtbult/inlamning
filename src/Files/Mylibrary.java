package Files;

public class Mylibrary {
	
	static double g = 6.67;
	static double R = 8.3144621;
	static double p_0 = 1000;
	static double c = 299792458;
	static double g_swe = 9.82;
	
	//1
	public static double FahrenheitToCelcius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}
	//2
	public static double kelvinToCelsius(double kelvin) {
		return kelvin+-273.15;
	}
	//3
	public static double fluidPressure(Fluidtable_ fluid, double deep) {
		return fluid.density * deep * g;
	}
	//4
	public static double pressureUnderWater(double deep) {
		double PUW = Fluidtable_.H20.density * deep * g;
		return PUW;
	}
	//5
	public static double kineticEnergy(double mass, double velocity) {
		return mass * (velocity * velocity)/2;
	}
	//6
	public static double potentialEnergy(double mass, double height) {
		return mass * height * g;
	}
	//7
	public static double fallspeed(double height) {
		return height * 9.82;
	}
	//8
	public static double delta(double first, double last) {
		return first - last;
	}
	//9
	public static double volumteToMass(Fluidtable_ fluid, double volume) {
		return fluid.density * volume;
	}
	//10
	public static double volumeToMass(Gastable_ gas, double volume) {
		return gas.density * volume;
	}
	//11
	public static double volumeToMass(Solidtable_ solid, double volume) {
		return solid.density * volume;
	}
	//12
	public static double svtVelocity(double time, double distance) {
		return distance / time;
	}
	//13
	public static double svtDistance(double time, double Velocity) {
		return Velocity / time;
	}
	//14
	public static double svtTime(double Velocity, double time) {
		return Velocity * time;
	}
	//15
	public static double work(double force, double distance) {
		return distance / force;
	}
	//16
	public static double power(double work, double time) {
		return work / time;
	}
	//17
	public static double heat(Solidtable_ solid, double mass, double deltaT) {
		return solid.heatCapacity * mass * deltaT;
	}
	//18
	public static double heat(Fluidtable_ fluid, double volume, double deltaT) {
		return fluid.heatCapacity * volume * deltaT;
	}
	//19
	public static double heat(Gastable_ gas, double volume, double deltaT) {
		return gas.heatCapacity * volume * deltaT;
	}
	//20
	public static double velocityToHeight (double velocity) {
		return velocity / g;
	}
	//21
	public static double HeightToVelocity (double Height) {
		return Height * g;
	}
	//22
	public static double PressureOnObj (double force, double Area ) {
		return force / Area;
	}
	//23
	public static double PascalToArea (double Pa, double force){
		return Pa * force;
	}
	//24
	public static double CentimeterToInches (double Centimeter) {
		return Centimeter * 0.3937;
	}
	//25
	public static double SWEtoDANISHcurrency (double kronor) {
		return kronor * 0.72345;
	}
	//26
	public static double tension (double force, double Area) {
		return force / Area;
	}
	//27
	public static double LiftForce (double mass, double Area) {
		return mass * Area;
	}
	//28
	public static double time (double work, double force) {
		return work * force;
	}
	//29
	public static double MeterToKm (double Meter) {
		return Meter *1000;
	}
	//30
	public static double KmToMiles (double km) {
		return km*10;
	}
	
	
	
	
	
}
