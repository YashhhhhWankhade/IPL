package service;

import entity.Team;
import repository.TeamRepository;


public class TeamService 
{

	public void printMITeamDetails()
	{
	
	Team team = TeamRepository.getMITeamDetails();
    System.out.println(team.getId());		
    System.out.println(team.getTeamName());
    System.out.println(team.getCaptainName());
    System.out.println(team.getCoachName());
    System.out.println(team.getnRR());
    System.out.println(team.isQualified());
    
	}
	
	public void printCSKTeamDetails()
	{
		
		Team team = TeamRepository.getCSKTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
        System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
	    System.out.println(team.isQualified());
	}
	
	public void printRCBTeamDetails()
	{
		
		Team team = TeamRepository.getRCBTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
        System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
	    System.out.println(team.isQualified());
	}
	
	public void printGTTeamDetails()
	{
		
		Team team = TeamRepository.getGTTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
        System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
	    System.out.println(team.isQualified());
	}
	
	public void printRRTeamDetails()
	{
		
		Team team = TeamRepository.getRRTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
        System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
	    System.out.println(team.isQualified());
	}
	
	
	public void printSRHTeamDetails()
	{
		
		Team team = TeamRepository.getSRHTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
        System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
	    System.out.println(team.isQualified());
	}
	
	public void printPKTeamDetails()
	{
		
		Team team = TeamRepository.getPKTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
        System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
	    System.out.println(team.isQualified());
	}
	
	public void printDCTeamDetails()
	{
		
		Team team = TeamRepository.getDCTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
        System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
	    System.out.println(team.isQualified());
	}
	
	public void printLSGTeamDetails()
	{
		
		Team team = TeamRepository.getLSGTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
        System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
	    System.out.println(team.isQualified());
	}
}
