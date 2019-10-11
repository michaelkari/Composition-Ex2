/*
 * Michael Karimizadeh
 * 21/12/16
 * Animal class
 * Allows user to display info about animal
 */
public class Animal{
  private String name;//Creates name holder
  private String species;//Creates species holder
  public int age;//Creates age holder
  private String noise;//Creates noise holder
  public Animal(String namee, String specc, int aa, String noisee){
    //Constructs animal from name, species, age, and noise made
    name= namee;
    species= specc;
    age=aa;
    noise=noisee;
  }
  public String printInfo(){
    //Displays attributes
    return name+", "+ species+", "+ age+", "+ noise;
  }
  public void talk(){
    //Displays animal noise
    System.out.println(noise);
  }
}