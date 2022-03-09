package Infenro1;
import java.util.Scanner;

import javax.swing.*;

public class Inferno {
	private boolean status;
	private String position;
	private String sin;
	private int level;
	private int steps;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level += level;
	}
	public String getPosition() {
		return position;
	}
	private int HP;
	public Inferno (boolean s, String sin){
		status=s;
		position="Earth";
		this.sin=sin;
		level=0;
		HP=100;
		steps=0;

	}
	public int getSteps() {
		return steps;
	}
	public void setSteps(int steps) {
		this.steps += steps;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String isPosition() {
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
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		this.HP += hP;
		if(this.HP>100){
			this.HP=100;
		}
		if(this.HP <0){
			this.HP=0;
		}
	}
	public void isDead(){
		if(status==true|| HP==0 ){
			System.out.println("is dead");
		}
		else{
			System.out.println("Alive and kicking");
		}
	}

	public void thesin(){
		switch(sin){
		case "None": System.out.println("No human has no sins. Tell me what your sins are");break;
		case"Lust": System.out.println("Go to the circle of lust!");this.position="Lust";break;
		case"Gluttony": System.out.println("Go to the circle of Gluttnoy"); this.position="Gluttony";break;
		case "Greed": System.out.println("Go to the circle of Greed"); this.position="Greed";break;
		case "Sloth": System.out.println("Go to the circle of Limbo"); this.position="Limbo";break;
		case "Envy": System.out.println("Go to the circle of Anger"); this.position="Anger";break;
		case "Wrath": System.out.println("Go to the circle of Violence"); this.position="Violence";break;
		case "Pirde": System.out.println("Go to the circle of Fraud"); this.position="Fraud";break;
		}
		if(HP==0){
			this.status=true;
		}
	}
	public void circlesofhell(){
		if(this.HP>0){
			switch (position){
			case "Earth": this.HP=HP;System.out.println("HP:"+this.HP+"     " + "on Earth");break;
			case "The gates of hell": this.HP-=1;System.out.println(this.HP + " " + "Abonden all hope behind, yee who enters here");break;
			case "Limbo": this.HP-=10;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Limbo");break;
			case "Lust": this.HP-=20;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Lust");break;
			case "Gluttony": this.HP-=30;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Gluttony");break;
			case "Greed": this.HP-=40;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Greed");break;
			case "Anger": this.HP-=50;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Anger");break;
			case "Heresy": this.HP-=60;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Heresy");break;
			case "Violence": this.HP-=70;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Violence");break;
			case "Fraud": this.HP-=80;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Fraud");break;
			case "Trechery": this.HP-=100;System.out.println("HP:"+" "+this.HP+ " " +"Go to the circle of Trechery");break;
			default: this.HP=HP; System.out.println("HP:"+" "+this.HP+ " " +"Not in hell, yet.");break;
			}
		}
		if(HP==0){
			status=true;
		}
	}
	public static int takeinputfromtheuser(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}

	public void thecircle(){
		if(this.getSteps()==4){
			this.setLevel(1);
			this.setPosition("The gates of hell");
			this.setSin("None");
			System.out.println("Abonden all hope behind, yee who enter here!");
		}
		if(this.getSteps()>4 && this.getSteps()<7){
			this.setLevel(1);
			this.setPosition("Limbo");
			this.setSin("None");
			System.out.println("Welcome to the first circle of hell");
		}
		if(this.getSteps()==7){
			this.setLevel(2);
			this.setPosition("Lust");
			this.setSin("Lust");
			System.out.println("Welcome to the Second circle of hell");
		}
		if(this.getSteps()>7 && this.getSteps()<9){
			this.setLevel(2);
			this.setPosition("Gluttony");
			this.setSin("Gluttony");
			System.out.println("Welcome to the third circle of hell");

		}

	}
	public static String takeString(){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		return a;
	}
	public static void Questions(Inferno x){

		System.out.println("1 to answer; 2 to stay where you are.");
		int r = takeinputfromtheuser();
		System.out.println("Answer the Question Depending on your circle");
		String s = takeString();
		if(r==1){

		}
		if(r==2){
			System.out.println("Stay.");
		}

	}
	public static void main(String[] args) {
		Inferno Dante = new Inferno(false, "None");
		SinDemon trex = new SinDemon("Trex", 1,Dante.getPosition() ,Dante.getSin() , Dante);
		trex.intro();
//		System.out.println("Your Level:"+" "+Dante.getLevel());
//		System.out.println("Your Steps:"+" "+Dante.getSteps());
//		System.out.println("Your Position:"+" "+Dante.getPosition());

	}

}
