public class VirtualPet {

	
	public int hunger;
	public int tired;
	public int thirst;
	public int boredom;
	

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

	public int petFeeding(int fedFood) {
	hunger = hunger + fedFood;
	return hunger ;
	}
		
	public int petSleeping(int petSlept) {
	    tired = tired + petSlept;
	    return tired;
		}
	
	public int petWatering(int petWatered) {
		thirst = thirst + petWatered;
		return thirst;
		}
	
	public int petPlaying(int funTime) {
		boredom = boredom + funTime;
		return boredom;
	 }

}