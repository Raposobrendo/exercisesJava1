package entities2;

public class Rooms {
	private String name;
	private String email;
	private boolean vacancy = false;
	private int room;
	
	public Rooms(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.vacancy = true;
		this.room = room;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setVacancy(boolean vacancy) {
		this.vacancy = vacancy;
	}
	
	public boolean getVacancy() {
		return vacancy;
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
	
	public int getRoom() {
		return room;
	}
	
	public String toString() {
		return room + ": " + name + ", " + email;
	}
}
