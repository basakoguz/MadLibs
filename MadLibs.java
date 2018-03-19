import java.util.Random;
import java.util.Scanner;

public class MadLibs{

  Scanner scanner = new Scanner(System.in);
  String story;
  String name;
  String adjective1;
  String adjective2;
  String noun1;
  String noun2;
  String noun3;
  String adverb;
  String randomNums;
  Random rand = new Random();

  //Getters
  public String getStory(){
    return this.story;
  }

  public String getName(){
    return this.name;
  }

  public String getAdjective1(){
    return this.adjective1;
  }

  public String getAdjective2(){
    return this.adjective2;
  }

  public String getNoun1(){
    return this.noun1;
  }

  public String getNoun2(){
    return this.noun2;
  }

  public String getNoun3(){
    return this.noun3;
  }

  public String getAdverb(){
    return this.adverb;
  }

  public String getRandomNums(){
    return this.randomNums;
  }

  //Setters
  public void setStory(String story){
    this.story = story;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAdjective1(String adjective1){
    this.adjective1 = adjective1;
  }

  public void setAdjective2(String adjective2){
    this.adjective2 = adjective2;
  }

  public void setNoun1(String noun1){
    this.noun1 = noun1;
  }

  public void setNoun2(String noun2){
    this.noun2 = noun2;
  }

  public void setNoun3(String noun3){
    this.noun3 = noun3;
  }

  public void setAdverb(String adverb){
    this.adverb = adverb;
  }

  public void setRandomNums(){
    int num = Math.abs(rand.nextInt()) % 100;
    int index = 0;
    int[] numberHolder = new int[3];
    while (index < numberHolder.length){
      numberHolder[index] = num + index;
      index++;
    }
    this.randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
  }

  //Print out instructions.
  public void printInstruction(){
    System.out.println("Welcome to the MadLibs game!");
    System.out.println("If you type in words, we'll give you a story.");
    System.out.println("Start by typing in a name...");
  }

  //Get words the from player.
  public void enterName(){
    setName(scanner.nextLine());
  }

  public void enterNoun1(){
    System.out.println("Give me a noun!");
    setNoun1(scanner.nextLine());
  }

  public void enterNoun2(){
    System.out.println("Give me another noun!");
    setNoun2(scanner.nextLine());
  }

  public void enterNoun3(){
    System.out.println("Give me the last noun!");
    setNoun3(scanner.nextLine());
  }

  public void enterAdjective1(){
    System.out.println("I need an adjective!");
    setAdjective1(scanner.nextLine());
  }

  public void enterAdjective2(){
    System.out.println("I also need a pair of Louboutins..kidding. Give me another adjective.");
    setAdjective2(scanner.nextLine());
  }

  public void enterAdverb(){
    System.out.println("I badly need an adverb too!");
    setAdverb(scanner.nextLine());
  }

  public void play(){
    enterName();
    enterNoun1();
    enterAdjective1();
    enterAdjective2();
    enterNoun2();
    enterAdverb();
    enterNoun3();
    setRandomNums();
    putTogetherTheStory();
    System.out.println(getStory());
  }


  public void putTogetherTheStory(){
    String story;
    int num = Math.abs(rand.nextInt()) % 2;
    if (num == 0){
      story = "Jesse and her best friend " + getName() + " went to Disney World today! "
          + "They saw a " + getNoun1() + " in a show at the Magic Kingdom "
          + "and ate a " + getAdjective1() + " feast for dinner. The next day " + getName()
          + " ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2()
          + " and then gazed at the " + getRandomNums() + " " +
          getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
    } else {
      story = "Amanda and her frenemy " + getName() + " went to zoo last summer. " +
      "They saw a huge " + getNoun1() + " and a tiny little " + getNoun2() + ". That night"
      + " they decided to climb " + getAdverb() + " into the " + getNoun3() + " to get a closer look. "
      + "The zoo was " + getAdjective1() + " at night, but they didn't care... "
      + "until " + getRandomNums() + " " + getAdjective2() + " apes yelled in their faces, making "
      + "Amanda and " + getName() + " sprint all the way back home.";
    }

    setStory(story);
  }

  public static void main(String[] args){
    MadLibs game = new MadLibs();
    game.printInstruction();
    game.play();
  }
}
