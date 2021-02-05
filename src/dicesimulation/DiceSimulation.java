package dicesimulation;

//import java.lang.Math; 
import java.util.*;
  
class DiceSimulation { 
	//attributes of Dice face
	public int frequency;
	public double percentage;
	
	//constructor
	public DiceSimulation(){
		frequency=0;
		percentage=0.0;
	}
	
    //method to compute percentage
    public void computePercent(int freq){
    	percentage=((double)freq/1000) * 100;
    }
	

    // driver code: main method
    public static void main(String args[]) 
    { 
        //instantiate dice game faces
    	DiceSimulation face1= new DiceSimulation();
        DiceSimulation face2= new DiceSimulation();
        DiceSimulation face3= new DiceSimulation();
        DiceSimulation face4= new DiceSimulation();
        DiceSimulation face5= new DiceSimulation();
        DiceSimulation face6= new DiceSimulation();
        
   
    	
        double rand = 0.0; //variable to hold random values
        
        //loop a 1000 times, incrementing face frequency as appropriate
        for(int i=0; i<1000; i++){
        	
        	//Generate random numbers
        	rand = Math.random();
        	
        	
        	if (rand>=0 && rand<((double)1/6)){
        		face1.frequency+=1;
        	}
        	else if(rand>=(double)1/6 && rand<(double)2/6){
        		face2.frequency+=1;
        	}
        	else if(rand>=(double)2/6 && rand<(double)3/6){
        		face3.frequency+=1;
        	}
        	else if(rand>=(double)3/6 && rand<(double)4/6){
        		face4.frequency+=1;
        	}
        	else if(rand>=(double)4/6 && rand<(double)5/6){
        		face5.frequency+=1;
        	}
        	else if(rand>=(double)5/6){
        		face6.frequency+=1;
        	}
        }
        	
        	//computing percentages of each face
        	face1.computePercent(face1.frequency);
        	face2.computePercent(face2.frequency);
        	face3.computePercent(face3.frequency);
        	face4.computePercent(face4.frequency);
        	face5.computePercent(face5.frequency);
        	face6.computePercent(face6.frequency);
        	
        	//System.out.print("(double)");
        
            //printing formatted output of each face's frequency and percentage 
        	System.out.format("%-2s%20s%30s%n", "Face", "Frequency", "Percentage(%)");
        	System.out.format("%-2s%18s%28s%n", " 1 ", face1.frequency, (float)face1.percentage);
        	System.out.format("%-2s%18d%28s%n", " 2 ", face2.frequency, (float)face2.percentage);
        	System.out.format("%-2s%18d%28s%n", " 3 ", face3.frequency, (float)face3.percentage);
        	System.out.format("%-2s%18d%28s%n", " 4 ", face4.frequency, (float)face4.percentage);
        	System.out.format("%-2s%18d%28s%n", " 5 ", face5.frequency, (float)face5.percentage);
        	System.out.format("%-2s%18d%28s%n", " 6 ", face6.frequency, (float)face6.percentage);
    }
} 