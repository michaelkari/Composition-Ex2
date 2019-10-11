/*
 * Michael Karimizadeh
 * 21/12/16
 * Zoo class
 * Allows user to Create and output information of zoo
 * Allows user to add animals and insects
 */
public class Zoo{
  private String name;//Creates name holder
  private String location;//Creates location holder
  public Animal[] animals=new Animal[0];//Creates animal array
  public Insect[] insects= new Insect[0];//Creates insect array
  public Zoo(String nam, String loc){
    //Constructs zoo using name and location
    name= nam;
    location= loc;
  }
  public void addAnimal(String nam, String spec, int a, String noise){
    //Creates animal from name, species, age, and noise
    int x= animals.length;//Records original array length
    Animal[] anitemp= new Animal[x];//Creates temp animal array
    for(int i=0; i<animals.length; i++){
      anitemp[i]=animals[i];//Moves insect array into temp animal array
    }
    animals= new Animal[x+1];//Resizes animal array
    for(int i=0; i<anitemp.length; i++){
      animals[i]=anitemp[i];//Moves temp insect array into animal array
    }
    animals[x]= new Animal(nam, spec,a,noise);//Create new animal 
  }
  public void addInsect(String n, int nlegs, double a, boolean w, String noise){
    //Creates insect from name, number of legs, age, whether it has wings, and noise
    int x= insects.length;//Records original array length
    Insect[] intemp= new Insect[x];//Creates temp insect array
    for(int i=0; i<insects.length; i++){
      intemp[i]=insects[i];//Moves insect array into temp insect array
    }
    insects= new Insect[x+1];//Resizes insect array
    for(int i=0; i<intemp.length; i++){
      insects[i]=intemp[i];//Moves temp insect array into insect array
    }
    insects[x]= new Insect(n, nlegs ,a, w, noise);//Create new insect
  }
  public void printInfo(){
    //Prints all attributes
    System.out.println(name);
    System.out.println(location);
    for (int i=0; i<animals.length; i++){
      //Prints all animals in zoo
      System.out.println( animals[i].printInfo());
    }
    for (int i=0; i<insects.length; i++){
      //Prints all insects in zoo
      System.out.println(insects[i].printInfo());
    }
  }
}