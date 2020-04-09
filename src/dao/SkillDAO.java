package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public Skill getSkillBylD(Long id) throws Exception {
		
		Skill skill = null;
		
		ConnectionManager cm=new ConnectionManager();
		Connection con=cm.getConnection();
		
		Statement st=con.createStatement();
		String sql="select name from skillnames where id ="+id;
		//String sql="select name from skill ";

		st.execute(sql);
		ResultSet rs=st.executeQuery(sql);	
		
		while(rs.next()) {
			skill = new Skill();
			//System.out.println(rs.getString("name"));
			skill.setSkillName(rs.getString("name"));
		}
		
		rs.close();
		st.close();
		con.close();
		return skill;
		
	}
}
