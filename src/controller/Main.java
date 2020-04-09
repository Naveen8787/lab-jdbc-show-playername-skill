package controller;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;

public class Main{
	public static void main(String[] args) throws Exception {
		SkillDAO skilldao=new SkillDAO();    
		PlayerDAO playerdao =  new PlayerDAO();
		
		System.out.println("List of all player and their skill");
		
		List<Player> list=new ArrayList<Player>();
		list = playerdao.getAllPlayers();
		System.out.println("ID   Name  \t\t\t Country\t\t Skill");
		for(int i=0;i<list.size();i++) {
			System.out.println(i+1+".  "+list.get(i).getName()+"   \t\t"+list.get(i).getCountry()+"   \t\t"+skilldao.getSkillBylD(list.get(i).getSkill().getSkilIld()).getSkillName());
		}
	}
}
