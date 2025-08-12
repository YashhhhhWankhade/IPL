package in.main;

import service.TeamService;

public class Test {

	public static void main(String[] args) 
	{
	
		TeamService team = new TeamService();
		team.printMITeamDetails();
		System.out.println("-----------------------------------------------------");
		team.printCSKTeamDetails();
		System.out.println("-----------------------------------------------------");
        team.printRCBTeamDetails();
		System.out.println("-----------------------------------------------------");
        team.printGTTeamDetails();
		System.out.println("-----------------------------------------------------");
        team.printRRTeamDetails();
		System.out.println("-----------------------------------------------------");
        team.printSRHTeamDetails();
		System.out.println("-----------------------------------------------------");
        team.printPKTeamDetails();
		System.out.println("-----------------------------------------------------");
        team.printDCTeamDetails();
		System.out.println("-----------------------------------------------------");
        team.printLSGTeamDetails();
        
        
        System.out.println("Hello Yash P Wankhade");
	}
	
}
