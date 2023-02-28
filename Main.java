

public class Main
{
	public static void main(String[] args) {
		
		Planet Myplanet = Planet.EARTH;
		IsItHabitable(firstPlanet);
	}
	
	static void IsItHabitable(Planet Myplanet){
	    switch(Myplanet){
	        case EARTH:
	            System.out.println("Breath freely");
                System.out.println("This is planet nr" + Myplanet.number);
	            break;
	       default:
	       System.out.println("Keep your hemlet on !!!");
           System.out.println("This is planet nr" + Myplanet.number);
	       break;
	    }
	}
}


// create an enum of planets:
enum Planet{
    // adding values to the constants:
    MERCURY(1), 
    VENUS(2), 
    EARTH(3), 
    MARS(4), 
    UPITER(5), 
    SATURN(6), 
    URANUS(7), 
    NEPTUNE(8), 
    PLUTO(9)

    int number;
    // create a coonstructor for the enum:
    Planet(int number){
        this.number = number;
    }
}


// create an enum oof moons:
enum Moon {
    LUNA, PHOBOS, TITAN, EUROPA
}