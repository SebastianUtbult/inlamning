package Files;

public enum Solidtable_ {

	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	bly(11.3, 0.13, 327, 24.7),
	natrium(0.97, 1.23, 98, 113),
	tenn(7.3, 0.23, 232, 59)
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double meltEntalpy;
	
	Solidtable_(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}
}
