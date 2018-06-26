/*
* Mark Kwayisi
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class RPGPlayer{

	String Name; // Creates a string for the player's name. 
	int HP;
	int Strength;
	double Speed;
	String Weapon;
	public String name;

	public RPGPlayer() { // Denotes the player method.
	this.Name = "";
	this.HP = 0;
	this.Strength = 0;
	this.Speed = 0.0;
	this.Weapon = "";
	}

	public RPGPlayer(String Name, int HP, int Strength, double Speed, String Weapon) { // Sets Up Constructors.
	this.Name = Name;
	this.HP = HP;
	this.Strength = Strength;
	this.Speed = Speed;
	this.Weapon = Weapon;
	}

	public RPGPlayer(String fileName)// throws FileNotFoundException, IOException
	{
		try{
	BufferedReader br = new BufferedReader(new FileReader(fileName));
	String line = br.readLine();
	while(line != null)
	{
	String[] words = line.split(" ");
	if(words[0].equals("Name")){
	String name = "";
	for(int i = 1; i < words.length; i++)
	name += words[i] + " ";
	setName(name.trim());
	}

	if(words[0].equals("HP")){
	int hp = Integer.parseInt(words[1]);
	setHP(hp);
	}

	if(words[0].equals("Strength")){
	int strength = Integer.parseInt(words[1]);
	setStrength(strength);
	}

	if(words[0].equals("Speed")){
	double speed = Double.parseDouble(words[1]);
	setSpeed(speed);
	}

	if(words[0].equals("Weapon")){
	String weapon = "";
	for(int i = 1; i < words.length; i++)
	weapon += words[i] + " ";
	setWeapon(weapon.trim());
	}

	line = br.readLine();
	}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
		
	

	public int getHP() { // Sets Mutators
	return HP;
	}

	public void setHP(int HP) {
	this.HP = HP;
	}

	public String getName() {
	return Name;
	}

	public void setName(String Name) {
	this.Name = Name;
	}

	public double getSpeed() {
	return Speed;
	}

	public void setSpeed(double Speed) {
	this.Speed = Speed;
	}

	public int getStrength() {
	return Strength;
	}

	public void setStrength(int Strength) {
	this.Strength = Strength;
	}

	public String getWeapon() {
	return Weapon;
	}

	public void setWeapon(String Weapon) {
	this.Weapon = Weapon;
	}

	public void readPlayerFile(String fileName) // throws FileNotFoundException, IOException

	{
	try
	{
	BufferedReader br = new BufferedReader(new FileReader(fileName));
	String line = br.readLine();
	while(line != null)
	{
	String[] words = line.split(" ");
	if(words[0].equals("Name")){
	String name = "";
	for(int i = 1; i < words.length; i++)
	name += words[i] + " ";
	setName(name.trim());
	}

	if(words[0].equals("HP")){
	int hp = Integer.parseInt(words[1]);
	setHP(hp);
	}

	if(words[0].equals("Strength")){
	int strength = Integer.parseInt(words[1]);
	setStrength(strength);
	}

	if(words[0].equals("Speed")){
	double speed = Double.parseDouble(words[1]);
	setSpeed(speed);
	}

	if(words[0].equals("Weapon")){
	String weapon = "";
	for(int i = 1; i < words.length; i++)
	weapon += words[i] + " ";
	setWeapon(weapon.trim());
	}

	line = br.readLine();
	}
	br.close();
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	}
	
	public void writePlayerFile(String fileName)// throws FileNotFoundException
	{
		try
		{
	PrintWriter pw = new PrintWriter(fileName); // Prints Results Of Battle.
	pw.println("Name " + this.Name);
	pw.println("HP " + this.HP);
	pw.println("Strength " + this.Strength);
	pw.println("Speed " + this.Speed);
	pw.println("Weapon " + this.Weapon);
	pw.close();
	}
		catch(IOException e)

		{
			System.out.println(e.getMessage());
		}
	}
	public void printInfo() // Prints Final Results. 
	{
	System.out.println("The Player " + this.Name);
	System.out.println("HP : " + this.HP);
	System.out.println("Strength : " + this.Strength);
	System.out.println("Speed : " + this.Speed);
	System.out.println("Weapon : " + this.Weapon);
	}
	}

