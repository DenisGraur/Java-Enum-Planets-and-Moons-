

public class Main
{
	public static void main(String[] args) {
		
		Planet Myplanet = Planet.EARTH;
		Planet firstPlanet = Planet.MERCURY;
		Planet secondPlanet = Planet.VENUS;
		IsItHabitable(firstPlanet);
	}
	
	static void IsItHabitable(Planet Myplanet){
	    switch(Myplanet){
	        case EARTH:
	            System.out.println("Breath freely");
	            break;
	       default:
	       System.out.println("Keep your hemlet on !!!");
	       break;
	    }
	}
}


// create an enum of planets:

enum Planet{
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO
}

// create an enum oof moons:

enum Moon {
    LUNA, PHOBOS, TITAN, EUROPA
}