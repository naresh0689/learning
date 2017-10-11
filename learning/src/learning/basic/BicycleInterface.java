package learning.basic;

public interface BicycleInterface {

public static int getID(){
	return 10;
}
	    //  wheel revolutions per minute
	    void changeCadence(int newValue);

	    void changeGear(int newValue);

	    void speedUp(int increment);

	    void applyBrakes(int decrement);
	
}
