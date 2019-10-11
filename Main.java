/*
 * Michael Karimizadeh
 * 21/12/16
 * Main class
 * Allows user to Create and output information of zoo
 */
public class Main{
  public static void main(String[] args){
    Zoo zoo1= new Zoo("Metro Toronto Zoo", "361A Old Finch Avenue, Toronto, On, Canada");//Creates new zoo
    zoo1.addAnimal("Kermit", "Frog", 1, "Reebit");//Creates animal
    zoo1.addAnimal("King Kong", "Ape", 10, "Rooar!");//Creates animal
    zoo1.addAnimal("Wally", "Walrus", 2, "Woof!");//Creates animal
    zoo1.addInsect("Crawly", 6, 0.2, false, "psssss");//Creates insect
    zoo1.addInsect("Pester", 6, 0.4, true, "Bzzzzz Bzzzz");//Creates insect
    zoo1.printInfo();//Prints info about zoo
    System.out.println("\n");
    
    Zoo zoo2= new Zoo("New York Zoo", "13th Avenue, New York, New York, USA");//Creates new zoo
    zoo2.addAnimal("Willy", "Whale", 40, "bahhh!");//Creates animal
    zoo2.addAnimal("Jimbo", "Dolphin", 21, "mmmmmm!");//Creates animal
    zoo2.addInsect("Slimy", 8, 1, false, "Zzzzzzip");//Creates insect
    zoo2.addInsect("Gabby", 12, 3.4, true, "Bzzzzz Bzzzz");//Creates insect
    zoo2.printInfo();//Prints info about zoo
  }
}