import java.util.Scanner;

public class virtualPetAPP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPet virtualPet = new VirtualPet(75, 75, 40, 30);
		
		System.out.println("\n *** Kitty the virtual pet *** \n");
		System.out.println( "Congratulations, you just adopted Kitty! Now that Kitty has come home, you will"
				+ " need to keep it's satisfaction levels up to keep it happy and alive.\n As a responsible parent, I have faith in you. Good luck! \n");
		System.out.println("Let's start by giving Kitty a proper name.\n What should we name it?");
		String kittyName= input.nextLine();
		
		System.out.println("\n Ok, " + kittyName + " it is.\n Looks like " + kittyName + " really likes your home and has already settled in. \n Lets go ahead and get started.\n");
		
		while (virtualPet.hunger >= 1 && virtualPet.tired >= 1 && virtualPet.thirst >= 1) {

		 System.out.println("Here is " + kittyName + "'s current status:");
		 System.out.println("Hunger: " + virtualPet.hunger);
		 System.out.println("Tired: " + virtualPet.tired);
		 System.out.println("Thirst: " + virtualPet.thirst);
		 System.out.println("Boredom: " + virtualPet.boredom);
		 System.out.println(" ");				 
		 System.out.println("What would you like to do?");
		 System.out.println("1. Feed Kitty");
		 System.out.println("2. Put Kitty to sleep");
		 System.out.println("3. Give Kitty some water");
		 System.out.println("4. Play with Kitty");
		 System.out.println("5. Let Kitty have some alone time");
		 int userSelection = input.nextInt();
		 input.nextLine();
		 
		 int fedFood = +20;
		 int petSlept = +35;
		 int petWatered = +20;
		 int funTime = +30;
		 
		 while (userSelection != (1) && userSelection != (2) && userSelection != (3)
				 && userSelection != (4) && userSelection != (5)) {
			 
			     System.out.println("...........................");
				 System.out.println("\n that is not a valid option. please try again\n");
				
				 System.out.println("Here is " + kittyName + "'s current status:");
				 System.out.println("Hunger: " + virtualPet.hunger);
				 System.out.println("Tired: " + virtualPet.tired);
				 System.out.println("Thirst: " + virtualPet.thirst);
				 System.out.println("Boredom: " + virtualPet.boredom);
				 System.out.println(" ");				 
				 System.out.println("Please decide, What would Kitty like now?");
				 System.out.println("1. Feed Kitty ");
				 System.out.println("2. Put Kitty to sleep");
				 System.out.println("3. Give Kitty some water");
				 System.out.println("4. Play with Kitty");
				 System.out.println("5. Let Kitty have some alone time");
				 userSelection = input.nextInt();
				 input.nextLine();
		 }
		 
		 if(userSelection == 1) {
			 System.out.println("\n Feeding " + kittyName); 
			 virtualPet.hunger = virtualPet.petFeeding(fedFood);
			 System.out.println("This lowered Kitty's hunger which increased it's satisfaction level to: " + virtualPet.hunger + ", " + kittyName + " looks full.");	
			 System.out.println("\n  Let's check on " + kittyName + " in a little while....\n");
		 }
		 else if (userSelection == 2) {
			 System.out.println("\n Putting " + kittyName + " to sleep...... look, how cute...now we can wait awhile\n");
			 virtualPet.tired = virtualPet.petSleeping(petSlept);
			 System.out.println("This lowered " + kittyName + "'s sleepyness which increased it's satisfaction level to: " + virtualPet.tired + ", " + kittyName + " seems rested.");
			 System.out.println("\n  Let's check on Kitty in a little while....\n");
		 }
		 else if (userSelection == 3) {
		     System.out.println("\n Giving " + kittyName + " some water");
		     virtualPet.thirst = virtualPet.petWatering(petWatered);
		     System.out.println("This lowered " + kittyName + "'s thirst which increased it's satisfaction level to: " + virtualPet.thirst + ", " + kittyName + " is content.");
		     System.out.println("\n  Let's check on Kitty in a little while....\n");
		 }
	     else if (userSelection == 4) {
	    	 virtualPet.boredom = virtualPet.petPlaying(funTime);
	    	 System.out.println("\n Playing with " + kittyName + " \n  Let's check on Kitty in a little while....\n");
	    	 System.out.println("This raised " + kittyName + "'s happiness which increased it's satisfaction level to: " + virtualPet.boredom + ", " + kittyName + " enjoyed that.");
	    	 
	     }
	     else if (userSelection == 5) {
	    	 System.out.println("\n\n" + kittyName + " looks content for now. \n  Let's check on Kitty in a little while....");
	    	 System.out.println("Time for some me time! " + kittyName + " wonders off to another room.\n");
	    	 
	     }
	     else {
	    	
	     
	     }
		 virtualPet.tick();
		 
		}
		System.out.println("*******************************");
		System.out.println("\n Oh NO! " + kittyName + " the kitty died! You have to make sure it's food, water and rest needs are taking care of. Thanks for playing. Please try again.");
		
		input.close();
	     
	}

}	 
