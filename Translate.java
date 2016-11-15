/* 
Stephanie Caston
ITCS 1213
*/

//Creates the class Translate
public class Translate
{

//initalization of all instance fields 
String input;
String morseCode[];
char characters[];
String numLetters[];

//puts the input from the user in the translate class
public Translate(String input)
{
this.input = input;
}

//sets the user input 
public void setInput(String input)
{
this.input = input;
}

//Sets the loaded characters array
public void setNumLetters(String[] numLetters)
{
this.numLetters = numLetters;
}

//Sets the loaded morse character array
public void setMorseCode(String[] morseCode)
{
this.morseCode = morseCode;
}

//translates the input into Morse Code
public String getTranslate()
{ 
String output ="";

for(int i=0; i<input.length(); i++)
{
{
for(int index=0; index<characters.length; index++)
{
if(input.charAt(i) == characters[index])
{ 
output = output + " " + " "+ " " + morseCode[index]; 
}
}
}
}
return output;
}
} 