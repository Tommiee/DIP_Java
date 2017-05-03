import java.util.Scanner;
public class Les6{
  Apple[] apple = new Apple[20]; //aanmaken van een apple
  Scanner scanner = new Scanner(System.in); //declareren scanner
  public static void main(String[] args) {
      Les6 les6 = new Les6();
  }
  public Les6(){
    showProblem();

  }
  private void showProblem(){
    //Met de onderstaande code kun je een appel eten.
    //Wat nu als je meer appels wil kunnen eten?
    //Moet ik dan de complete code kopieren?

    //Opdracht 1
    //Lees de onderstaande code regel voor regel door en zet per regel, in een comment erachter, wat de code doet
    //Als je een regel niet begrijpt zet je er een vraagteken achter.
    //Stel in de les vragen over regels die je niet begrijpt.

    //Opdracht 2
    //Pas de onderstaande code aan zodat je 3 appels tegelijk kunt eten.
    //Je hoeft nog niet te switchen tussen de appels met het "next" commando.

    for(int i = 0 ; i <apple.length ; i++){
      apple[i] = new Apple(); //for loop om de apple array vol te stoppen
    }

    while(true){ //begin while loop
      System.out.println("eat, look, next or exit?"); //vraagstelling
      String input = scanner.next(); //waarde van scanner opslaan in input

      if(input.equals("eat")){ //input vergelijken
        solveProblem();
      }
      else if(input.equals("look")){  //input vergelijken
        for(int i = 0 ; i < apple.length ; i++){
          apple[i].printAppleStatus(); //voor alle variabelen in apple de status uitprinten
        }
      }
      else if(input.equals("exit")){  //input vergelijken
        break;                        //loop beeindigen
      }else if(input.equals("next")){ //input vergelijken
        //ga naar de volgende appel
        System.out.println("there is only one apple!");
      }else{
        System.out.println("i don't understand.");
      }
    }
  }
private void solveProblem(){

  for(int i = 0 ; i < apple.length ; i++){
    apple[i].takeBite(); //takeBite aanroepen
  }

    //Opdracht 3
    //Maak een nieuwe functie aan met de naam solveProblem.
    //Plak de code voor het eten van de 3 appels erin.
    //Pas de code aan zodat je met behulp van een array 20 appels kunt eten met het "eat" commando.

    //Opdracht 4
    //Pas de code zo aan dat je ook 20 appels kunt bekijken met het "look" commando.

    //Extra opdracht 5
    //Verzin een manier om te switchen tussen de appels,
    //zodat je niet alle appels tegelijk eet maar dat je ze 1 voor 1 kunt eten en bekijken.
    //Gebruik hiervoor het "next" commando.

  }
}
