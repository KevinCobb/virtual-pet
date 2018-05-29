public class VirtualPet {

	
	public static int hunger;
	public static int tired;
	public static int thirst;
	public static int boredom;
	

	public VirtualPet(int hunger, int tired, int thirst, int boredom) {
		this.hunger = hunger;
		this.tired = tired;
		this.thirst = thirst;
		this.boredom = boredom;
		
	}
	public void tick() {
		hunger = hunger - 5;
		thirst = thirst - 5;
		boredom = boredom - 10;
		tired = tired - 10;
	}

	public static int petFeeding(int fedFood) {
	hunger = hunger + fedFood;
	return hunger ;
	}
		
	public static int petSleeping(int petSlept) {
	    tired = tired + petSlept;
	    return tired;
		}
	
	public static int petWatering(int petWatered) {
		thirst = thirst + petWatered;
		return thirst;
		}
	
	public static int petPlaying(int funTime) {
		boredom = boredom + funTime;
		return boredom;
	 }

}