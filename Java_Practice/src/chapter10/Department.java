package chapter10;

import java.io.Serializable;

public class Department implements Serializable
{
	private static final long serialVersionUID = 81923983193621L;

	private String name;
	private Employee leader;

	public Department(String name, Employee leader)
	{
		this.name = name;
		this.leader = leader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getLeader() {
		return leader;
	}

	public void setLeader(Employee leader) {
		this.leader = leader;
	}
}
