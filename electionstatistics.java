import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class electionstatistics {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashMap<String, Integer> candidates=new HashMap<>();
	String input = "";
	System.out.println("a.entercandate\n b.castvote \n c.countvote \n d.listvote \n e.getwinner \n f.exit");
   String in="";
	while (in!="exit") {
		System.out.println(" ");
    	 in=sc.next();
    	 
    	switch(in){
    	case "entercandate":{
    		System.out.println("enter name");
    		String str=sc.next();
    		candidates.put(str, 0);
    		System.out.println("Candidate added");
    		break;
    	}
    	case "castvote":{

    		

    			System.out.println("enter  name");
        		String name=sc.next();
    		if(candidates.containsKey(name))
    		{
    		 candidates.put(name, candidates.get(name) + 1);
    		System.out.println("you voted succesfully for: "+name);
    		}
    		else{
    			System.out.println("Candidate is not eligible");
    		}
    		break;
    		
    	}
    	case "countvote":{
			System.out.println("enter candidate name");
    		String name=sc.next();
    		candidates.containsKey(name);
    		System.out.println(name + " has " + candidates.get(name) + " votes.");
    		break;
    		
    	}
    	case "listvote":{
    
        	System.out.println(candidates+"\n");
        	break;
    	}
    	case "getwinner":{
    		String winner="";
    		int maxVotes = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
                String candidate = entry.getKey();
                int votes = entry.getValue();
				if (votes > maxVotes) {
                    winner = candidate;
                    maxVotes = votes;
                }
            }
            System.out.println("Winner is " + winner + " with " + maxVotes + " votes.");
            break;
    	}
    	case "exit":
    	{
    		System.out.println("exited");
    		break;
    		
    	}
    	default :{
    		System.out.println("enter proper option");
    	}
    	}
    	
}
}}
