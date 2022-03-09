package Infenro1;

import java.util.Scanner;

public class SinDemon extends Demons {
	private Inferno x;
	private String s;
	public SinDemon(String n, int l, String p, String s, Inferno x){
		super(n,l,p,s);
		this.x=x;
	}
	public void releaseDemon(Inferno x){
		if( x.getSin()=="Pride"){
			this.setSin("Pride");
			this.setPosition("Fraud");
			System.out.println("The Demon will take you to the Eighth circle; Get ready for torture");
			System.out.println();
			this.hp+=10;
			x.setHP(x.getHP()-10);
		}

		if(x.getSin()=="Envy"){
			this.setSin("Envy");
			this.setPosition("Anger");
			System.out.println("Right");
			System.out.println();
			System.out.println("The Demon will take you to the fifth Circle; Get ready for torture");
			System.out.println();
			//			this.hp+=10;
			x.setHP(x.getHP()-10);
		}
		if(x.getSin()=="Wrath"){
			this.setSin("Wrath");
			this.setPosition("Violence");
			System.out.println("The Demon will take you to the Seventh Circle; Get ready for torture");
			System.out.println();
			this.hp+=10;
			x.setHP(x.getHP()-10);
		}
		if(x.getSin()=="Lust"){
			this.setSin("Lust");
			this.setPosition("Lust");
			System.out.println("The Demon will take you to the Second Circle; Get ready for torture");
			System.out.println();
			this.hp+=10;
			x.setHP(x.getHP()-10);
		}
		if(x.getSin()=="Sloth"){
			this.setSin("Sloth");
			this.setPosition("Limbo");
			System.out.println("The Demon will take you to the First Circle; Get ready for torture");
			System.out.println();
			this.hp+=10;
			x.setHP(x.getHP()-10);
		}
		if(x.getSin()=="Gluttony"){
			this.setSin("Gluttony");
			this.setPosition("Gluttony");
			System.out.println("The Demon will take you to the First Circle; Get ready for torture");
			System.out.println();
			this.hp+=10;
			x.setHP(x.getHP()-10);
		}
		if(x.getSin()=="Greed"){
			this.setSin("Greed");
			this.setPosition("Greed");
			System.out.println("The Demon will take you to the four Circle; Get ready for torture");
			System.out.println();
			this.hp+=10;
			x.setHP(x.getHP()-10);
		}
		if(x.getSin()=="None"){
			this.setSin("Still in progress...");
			this.setPosition("The gates of hell");
			System.out.println("What are you doing here???");
			System.out.println();
		}
	}
	public void The3Quests(){
		TheQuestNumbers(x);
		TheQuestWords(x);
		TheQuestQuestion(x);
		howmanycirclesinhell();
		insidehell();
		releaseDemon(x);
	}
	public void startthegame(){
		System.out.println("The rules are the following: Answer the questions correctly; you will increase the level.");
		System.out.println();
		System.out.println("With enough levels you can go to the next circle and go head to a new place. Are you ready");
		System.out.println();
		System.out.println("Press 1 to start. press 2 to close.");
		System.out.println();
		int res = takeinputfromtheuser();
		if(res==1){
			thebeggining();
		}
		if(res==2){
			System.out.println("Bye");
			return;
		}
	}
	public void thebeggining(){
		WherewaswithDante();
		WhowaswithDante();
		whosentVirgil();
		The3Quests();
	}
	public void TheQuestNumbers(Inferno x){
		System.out.println("What is the calculation of +23*4-6");
		System.out.println();
		if(takeinputfromtheuser()==14){
			System.out.println("You are corrent");
			System.out.println();
			x.setHP(10);
			x.setSteps(1);
			x.thecircle();
		}
		else{
			System.out.println("Idiot!");
			System.out.println();
			x.setHP(-10);
		}
	}
	public static int takeinputfromtheuser(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}
	public void TheQuestWords(Inferno x){
		System.out.println("D a n - e: Complete the word: 1 for t; 2 for r; 3 for y");
		System.out.println();
		int res=takeinputfromtheuser();
		if(res==1){
			System.out.println("You are correct");
			System.out.println();
			System.out.println("The word is Dante! The name of the person who imagined the hell you are in!");
			System.out.println();
			x.setHP(10);
			x.setSteps(1);
			x.thecircle();
		}
		else if(res==2 || res==3){
			System.out.println("Idiot");
			System.out.println();
			x.setHP(-10);
		}
		else{
			System.out.println("Try again");
			System.out.println();
			TheQuestWords(x);
		}
	}
	public void TheQuestQuestion(Inferno x){
		System.out.println("What is the name of the angel trapped deep in the Dante's inferno? 1: Lucifer Morningstar 2: Azriel 3: Raziel");
		System.out.println();
		int res=takeinputfromtheuser();
		if(res==1){
			System.out.println("You are correct: He is Lucifer, AKA, Satan!");
			System.out.println();
			x.setHP(10);
			x.setSteps(1);
			x.thecircle();
		}
		else if(res==2 || res==3){
			System.out.println("Idiot!");
			System.out.println();
			x.setHP(-10);
		}
		else{
			System.out.println("Try again");
			System.out.println();
			TheQuestQuestion(x);
		}
	}
	public void WherewaswithDante(){
		System.out.println("Where was Dante when he began his Trip? 1: A forest 2: A street 3: His house");
		System.out.println();
		int res = takeinputfromtheuser();
		if(res==1){
			System.out.println("Correct!!!");
			System.out.println();
			x.setSteps(1);
			x.thecircle();
		}
		else if(res==2 || res == 3){
			System.out.println("Idiot!!");
			System.out.println();
			x.setHP(-10);
		}
		else{
			System.out.println("Try Agin");
			System.out.println();
			WherewaswithDante();
		}
	}
	public void WhowaswithDante(){
		System.out.println("Why couldn't Dante Climb the mountain?? "
				+ "1: He was tired 2: He met monsters 3: He was sleepy");
		System.out.println();
		int res = takeinputfromtheuser();
		if(res==2){
			System.out.println("Correct!!!");
			System.out.println();
			x.setSteps(1);
			x.thecircle();
		}
		else if(res==1 || res == 3){
			System.out.println("Idiot!!");
			System.out.println();
			x.setHP(-10);
		}
		else{
			System.out.println("Try Agin");
			System.out.println();
			WhowaswithDante();
		}
	}
	public void whosentVirgil(){
		System.out.println("Who sent Virgil to Dante to take him to hell");
		System.out.println("1: His Mother 2: The pope he hated 3: His dead girlfriend");
		System.out.println();
		int res = takeinputfromtheuser();
		if(res==3){
			System.out.println("Correct!!!");
			System.out.println();
			x.setSteps(1);
			x.thecircle();
		}
		else if(res==2 || res == 1){
			System.out.println("Idiot!");
			System.out.println();
			x.setHP(-10);
		}
		else{
			System.out.println("Try Agin");
			System.out.println();
			whosentVirgil();
		}
	}
	public void howmanycirclesinhell(){
		System.out.println("How many cricles in hell: 9 - 10 - 3");
		System.out.println();
		int res = takeinputfromtheuser();
		if(res==9){
			System.out.println("Correct!!!");
			System.out.println();
			x.setSteps(2);
			x.thecircle();
		}
		else{
			System.out.println("Try Agin");
			System.out.println();
			howmanycirclesinhell();
		}
	}
	public void intro(){
		System.out.println("In the middle of his life, Dante walked the same path as you.");
		System.out.println();
		System.out.println("Ready to satisfy hell?");
		System.out.println();
		System.out.println("Click 1 then enter, if you dare.");
		int res = takeinputfromtheuser();
		if(res==1){
			startthegame();
		}
		else{
			intro();
		}
	}
	public String takestringfromuser(){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
	public void insidehell(){
		System.out.println("You are now in: " + " " + x.getPosition());
		System.out.println();
		System.out.println("Ready to take the Question that determine what will happen to you, Human?");
		System.out.println();
		int res = takeinputfromtheuser();
		
		if(res==1){
			if(x.getPosition()=="The gates of hell"){
				System.out.println("What do you have to say here?");
				System.out.println();
				System.out.println("Will you be useless?");
				if(s=="I will go back home"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP:"+" " +"Level:"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("The gates of hell");
				}
			}
			if(x.getPosition()=="Limbo"){
				System.out.println("Will you be useless?");
	
				String s = takestringfromuser();
				if(s=="I am sorry"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("The gates of hell");
				}
			}
			if(x.getPosition()=="Lust"){
				System.out.println("What do you have to say here?");
				System.out.println();
				System.out.println("Answer.");
				String s = takestringfromuser();
				if(s=="I am sorry"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("Limbo");
				}
			}
			if(x.getPosition()=="Gluttony"){
				System.out.println("What do you have to say here?");
				System.out.println();
				System.out.println("Answer.");
				String s = takestringfromuser();
				if(s=="I won't eat that much again"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("Lust");
				}
			}
			if(x.getPosition()=="Greed"){
				System.out.println("What do you have to say here?");
				System.out.println();
				if(s=="I won't be greedy"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("Gluttony");
				}
			}
			if(x.getPosition()=="Anger"){
				System.out.println("What do you have to say here?");
				System.out.println();
				if(s=="I will not be angry again"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("Greed");
				}
			}
			if(x.getPosition()=="Heresy"){
				System.out.println("What do you have to say here?");
				System.out.println();
				if(s=="I will not harase anyone again"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("Anger");
				}
			}
			if(x.getPosition()=="Violence"){
				System.out.println("What do you have to say here?");
				System.out.println();
				if(s=="I will not be violent again"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("Heresy");
				}
			}
			if(x.getPosition()=="Fraud"){
				System.out.println("What do you have to say here?");
				System.out.println();
				if(s=="I Will not do any frauds again"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("Violence");
				}
			}
			if(x.getPosition()=="Trechery"){
				System.out.println("What do you have to say here?");
				System.out.println();
				if(s=="I will not be treachrous again"){
					x.setHP(10);
					System.out.println(x.getHP()+" "+"HP"+" " +"Level"+" "+ x.getLevel()+ " " +"You are correct");
					x.setLevel(x.getLevel() + 1);
					x.setPosition("Fraud");
				}
			}
			if(x.getPosition()=="Earth"){
				System.out.println("What do you have to say here?");
				System.out.println();
				if(s=="Earth"){
					System.out.println("Go home u drunk");
				}
			}
		}
		else{
			System.out.println("No. start again!");
			System.out.println();
			insidehell();
		}
	}

}
