/*
 * Michael Karimizadeh
 * 21/12/16
 * Insect class
 * Allows user to display info about insect
 */
public class Insect{
  private String name;//Creates name holder
  private int numOfLegs;//Creates number of leg holder
  public double age;//Creates age holder
  private boolean wings;//Creates wing holder
  private String noise;//Creates noise holder
  public Insect(String nam, int nOlegs, double aa, boolean wing, String noisee){
    //Constructs insect based on name, number of legs, age, whether it has wings, and noise
    name= nam;
    numOfLegs= nOlegs;
    age=aa;
    wings= wing;
    noise=noisee;
  }
  public String printInfo(){
    //Prints info of insect
    if(wings ==false){//Prints if no wings are present
      return name+", "+ numOfLegs+", "+ age+", "+noise+", no";
    }
    else{//Prints if wings are present
      return name+", "+ numOfLegs+", "+ age+", "+noise+", yes";
    }
  }
  public void makeNoise(){
    //Displays noise made
    System.out.println(noise);
  }
}