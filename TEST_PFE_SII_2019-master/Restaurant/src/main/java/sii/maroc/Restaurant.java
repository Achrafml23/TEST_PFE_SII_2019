package sii.maroc;

public class Restaurant {

	private int ballsMozarella ;
	private int tomatoes;
	private int oliveOil;
	private int pepper;
	private int salt;
	private int flour;
	private int water;
	
	
	public Restaurant(String string, String string2, String string3, String string4) {
		ballsMozarella=0 ;
		tomatoes=0;
		oliveOil=0;
		pepper=0;
		salt=0;
		flour=0;
		water=0;
		
		String[] ingredientName = string.split(" ");
		if (string.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName[0] );
		}else if(string.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName[0] );
		}else if(string.contains("olive")){
			oliveOil = 100000000;
		}else if(string.contains("pepper")){
			pepper = 100000000;
		}else if(string.contains("salt")){
			salt = 100000000;
		}else if(string.contains("water")){
			water = 100000000;
		}else if(string.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
		
		String[] ingredientName2 = string2.split(" ");
		if (string2.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName2[0] );
		}else if(string2.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName[0] );
		}else if(string2.contains("olive")){
			oliveOil = 100000000;
		}else if(string2.contains("pepper")){
			pepper = 100000000;
		}else if(string2.contains("salt")){
			salt = 100000000;
		}else if(string2.contains("water")){
			water = 100000000;
		}else if(string2.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
		
		String[] ingredientName3 = string3.split(" ");
		if (string3.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName3[0] );
		}else if(string3.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName3[0] );
		}else if(string3.contains("olive")){
			oliveOil = 100000000;
		}else if(string3.contains("pepper")){
			pepper = 100000000;
		}else if(string3.contains("salt")){
			salt = 100000000;
		}else if(string3.contains("water")){
			water = 100000000;
		}else if(string3.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
		
		String[] ingredientName4 = string4.split(" ");
		if (string4.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName4[0] );
		}else if(string4.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName4[0] );
		}else if(string4.contains("olive")){
			oliveOil = 100000000;
		}else if(string4.contains("pepper")){
			pepper = 100000000;
		}else if(string4.contains("salt")){
			salt = 100000000;
		}else if(string4.contains("water")){
			water = 100000000;
		}else if(string4.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}

		// TODO Auto-generated constructor stub
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		ballsMozarella=0 ;
		tomatoes=0;
		oliveOil=0;
		pepper=0;
		salt=0;
		flour=0;
		water=0;
		String[] ingredientName = string.split(" ");
		if (string.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName[0] );
		}else if(string.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName[0] );
		}else if(string.contains("olive")){
			oliveOil = 100000000;
		}else if(string.contains("pepper")){
			pepper = 100000000;
		}else if(string.contains("salt")){
			salt = 100000000;
		}else if(string.contains("water")){
			water = 100000000;
		}else if(string.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
		
		String[] ingredientName2 = string2.split(" ");
		if (string2.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName2[0] );
		}else if(string2.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName[0] );
		}else if(string2.contains("olive")){
			oliveOil = 100000000;
		}else if(string2.contains("pepper")){
			pepper = 100000000;
		}else if(string2.contains("salt")){
			salt = 100000000;
		}else if(string2.contains("water")){
			water = 100000000;
		}else if(string2.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
		
		String[] ingredientName3 = string3.split(" ");
		if (string3.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName3[0] );
		}else if(string3.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName3[0] );
		}else if(string3.contains("olive")){
			oliveOil = 100000000;
		}else if(string3.contains("pepper")){
			pepper = 100000000;
		}else if(string3.contains("salt")){
			salt = 100000000;
		}else if(string3.contains("water")){
			water = 100000000;
		}else if(string3.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
		
		String[] ingredientName4 = string4.split(" ");
		if (string4.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName4[0] );
		}else if(string4.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName4[0] );
		}else if(string4.contains("olive")){
			oliveOil = 100000000;
		}else if(string4.contains("pepper")){
			pepper = 100000000;
		}else if(string4.contains("salt")){
			salt = 100000000;
		}else if(string4.contains("water")){
			water = 100000000;
		}else if(string4.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
		
		String[] ingredientName5 = string5.split(" ");
		if (string5.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName5[0] );
		}else if(string5.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName5[0] );
		}else if(string5.contains("olive")){
			oliveOil = 100000000;
		}else if(string5.contains("pepper")){
			pepper = 100000000;
		}else if(string5.contains("salt")){
			salt = 100000000;
		}else if(string5.contains("water")){
			water = 100000000;
		}else if(string5.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
		
		
		String[] ingredientName6 = string6.split(" ");
		if (string6.contains("tomatoes")){
			tomatoes = Integer.parseInt(ingredientName6[0] );
		}else if(string6.contains("Mozarella")){
			ballsMozarella = Integer.parseInt(ingredientName6[0] );
		}else if(string6.contains("olive")){
			oliveOil = 100000000;
		}else if(string6.contains("pepper")){
			pepper = 100000000;
		}else if(string6.contains("salt")){
			salt = 100000000;
		}else if(string6.contains("water")){
			water = 100000000;
		}else if(string6.contains("Flour")){
			String flourQuantity = ingredientName[0];
			String flourString = flourQuantity.substring(0, flourQuantity.length() - 2);
			flour = Integer.parseInt(flourString ) * 1000;
		}
	}

	
	
	
	
	
	
	
	public Ticket order(String string) {
		String[] orderString = string.split(" ");
		if (string.contains("Pizza")){
			int nmbrPlat= Integer.parseInt(orderString[0]);
			String plat = "Pizza";
			Ticket ticket = new Ticket(nmbrPlat,plat);
			this.setBallsMozarella(this.getBallsMozarella() - 1*nmbrPlat);
			this.setTomatoes(this.getTomatoes()- 4 * nmbrPlat);
			this.setFlour(this.getFlour() - 300 * nmbrPlat);
			
			return ticket;
		}else if(string.contains("Mozzarella Salad")){
			int nmbrPlat= Integer.parseInt(orderString[0]);
			String plat = "Tomato Mozzarella Salad";
			Ticket ticket = new Ticket(nmbrPlat,plat);
			this.setBallsMozarella(this.getBallsMozarella() - 1*nmbrPlat);
			this.setTomatoes(this.getTomatoes()- 2 * nmbrPlat);
			return ticket;
		}
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
	
	public int getBallsMozarella() {
		return ballsMozarella;
	}

	public void setBallsMozarella(int ballsMozarella) {
		this.ballsMozarella = ballsMozarella;
	}

	public int getTomatoes() {
		return tomatoes;
	}

	public void setTomatoes(int tomatoes) {
		this.tomatoes = tomatoes;
	}

	public int getOliveOil() {
		return oliveOil;
	}

	public void setOliveOil(int oliveOil) {
		this.oliveOil = oliveOil;
	}

	public int getPepper() {
		return pepper;
	}

	public void setPepper(int pepper) {
		this.pepper = pepper;
	}

	public int getSalt() {
		return salt;
	}

	public void setSalt(int salt) {
		this.salt = salt;
	}

	public int getFlour() {
		return flour;
	}

	public void setFlour(int flour) {
		this.flour = flour;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	
	
	public Meal retrieve(Ticket ticket) {
		Meal meal = new Meal();
		int cookingTime =0;
		int pizzaCookingDuration = 10;
		int tomatoMozarellaSaladCookingDuration = 6;
		
		
		if(ticket.getPlat().equals("Pizza")) {
			cookingTime = pizzaCookingDuration + (  (ticket.getNombrePlat()-1)  * pizzaCookingDuration/2 );
			
		}
		if(ticket.getPlat().equals("Tomato Mozzarella Salad")) {
			cookingTime = tomatoMozarellaSaladCookingDuration + (  (ticket.getNombrePlat()-1)  * tomatoMozarellaSaladCookingDuration/2 );
		}
		
		meal.setCookingDurationMinutes(cookingTime);
		meal.setServedDishesNumber(ticket.getNombrePlat());
		// TODO Auto-generated method stub
		return meal;
	}

	
	
	
	
	
	
	
	

	
}
