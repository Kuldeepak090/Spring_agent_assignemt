package example.com.Anudip_Assignment;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao {
	
	// use jdbctemplate
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getjdbcTemplate() {
		return jdbcTemplate;
	}

	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// insert agent details
	public int saveAgent(Agent a)

	{
		String query = "insert into agent(id,name,commission) value(?,?,?)";
		return jdbcTemplate.update(query, a.getId(), a.getName(), a.getAgent_comm());
	}

	// update agent details
	public int updateAgent(Agent a) {
		String query = "update agent set name='" + a.getName() + "',commission='" + a.getAgent_comm()
				+ "' where id='" + a.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	// delete agent details
	public int deleteAgent(Agent a) {
		String query = "delete From agent where id='" + a.getId() + "' ";
		return jdbcTemplate.update(query);
	}
}
