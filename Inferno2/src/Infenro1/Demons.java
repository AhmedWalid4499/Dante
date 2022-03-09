package Infenro1;

public abstract class Demons {
     String name;
     int level;
     int hp;
     String position;
     String sin;
     public Demons (String name, int level, String position, String sin){
    	 this.name=name;
    	 this.level=level;
    	 hp=100;
    	 this.position=position;
    	 this.sin=sin;
     }
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSin() {
		return sin;
	}
	public void setSin(String sin) {
		this.sin = sin;
	}
}
