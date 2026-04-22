class  NotEligibleForEngineering extends RuntimeException
{
	NotEligibleForEngineering(String s){
		super(s);
	}
}
class NotEligibleForVJIT extends RuntimeException
{
	NotEligibleForVJIT(String s){
		super(s);		
	}
}
class TSEngineeringAdmission
{
	public static void main(String[] args){
		try{
			int score = Integer.parseInt(args[0]);
			if(score<50){
				throw new NotEligibleForEngineering("you re not eligible for engineering");
			}
			else if(score<70){
				throw new NotEligibleForVJIT("vjit won't accept you");
			}
			else{
				System.out.println("Welcome to VJIT-Thanks For Your Registration!");
			}
		}
				
		catch (NotEligibleForEngineering | NotEligibleForVJIT e){
			System.out.println("using e. printStackTrace():");
			e.printStackTrace();
			System.out.println("using e.getMessage():");
			e.getMessage();
			System.out.println("using e.toString():");
			e.toString();
		}
		System.out.println("Rest of the Code");
			
		
	}
}

		
			
		