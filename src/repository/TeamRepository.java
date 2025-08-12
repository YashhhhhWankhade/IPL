package repository;

import entity.Team;

public class TeamRepository 
{
	
	public static Team getMITeamDetails()
	{
		Team team = new Team();
	 
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Rohit Sharma");
		team.setCoachName("Kayran Pollard");
		team.setnRR(2.3f);
		team.setQualified(false);
		
		return team;
	}
	
	
	public static Team getCSKTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("MS Dhoni");
		team.setCoachName("Jaywardhan");
		team.setnRR(2.2f);
		team.setQualified(false);
		
		return team;
	}
	
	public static Team getRCBTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(103);
		team.setTeamName("Royal Challange");
		team.setCaptainName("Virat Kohli");
		team.setCoachName("Fab Duplesi");
		team.setnRR(1.9f);
		team.setQualified(false);
		
		return team;
	}
	
	public static Team getGTTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(104);
		team.setTeamName("Gujrat Titans");
		team.setCaptainName("Shubhman Gill");
		team.setCoachName("Ashish Nehra");
		team.setnRR(2.3f);
		team.setQualified(false);
		
		return team;
	}
	
	
	public static Team getRRTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(105);
		team.setTeamName("Rajasthan Royals");
		team.setCaptainName("Jos Butller");
		team.setCoachName("Sanju Samson");
		team.setnRR(2.2f);
		team.setQualified(false);
		
		return team;
	}
	
	public static Team getSRHTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(106);
		team.setTeamName("Sunrisers Hyderabad");
		team.setCaptainName("Abhishek Sharma");
		team.setCoachName("Team David");
		team.setnRR(2.5f);
		team.setQualified(false);
		
		return team;
	}
	
	public static Team getPKTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(107);
		team.setTeamName("Punjab Kings");
		team.setCaptainName("Shreyash Ayyer");
		team.setCoachName("Priti Zinta");
		team.setnRR(2.1f);
		team.setQualified(false);
		
		return team;
	}
	
	public static Team getDCTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(108);
		team.setTeamName("Delhi Capitals");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Priti Zinta");
		team.setnRR(2.4f);
		team.setQualified(false);
		
		return team;
	}
	
	public static Team getKKRTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(108);
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Russel");
		team.setCoachName("Rinku Singh");
		team.setnRR(2.0f);
		team.setQualified(false);
		
		return team;
	}
	
	public static Team getLSGTeamDetails()
	{
		Team team = new Team();
	 
		team.setId(109);
		team.setTeamName("Lucknow Super Giants");
		team.setCaptainName("Michel Marsh");
		team.setCoachName("Pat Cummins");
		team.setnRR(2.7f);
		team.setQualified(false);
		
		return team;
	}
}
