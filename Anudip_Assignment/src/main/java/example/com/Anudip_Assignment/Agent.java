package example.com.Anudip_Assignment;

public class Agent {

	
	// agent id
	private int Id;
	
	//agent name
	private String Name;
	
	// Agent_comm= Agent commission
	private String Agent_comm;
	public int getId() {
		return Id;
	}
	
	// use getter and setter
	public void setId(int id) {
		Id = id;
	}
	

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAgent_comm() {
		return Agent_comm;
	}
	public void setAgent_comm(String agent_comm) {
		Agent_comm = agent_comm;
	}
	
	public Agent(int id, String name, String agent_comm) {
		super();
		Id = id;
		Name = name;
		Agent_comm = agent_comm;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
