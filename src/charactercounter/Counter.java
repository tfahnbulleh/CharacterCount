/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactercounter;

/**
 *
 * @author Tamu Fahnbulleh
 */
public class Counter 
{
    //instance variables
    private final String Phrase; //the phrase to search for a specific character
    private final char CharacterToCount; //the charater to search
    private int NumberOfTimes;
    private int Counter=0;
   
    //constructor
     public Counter(String phrase, char characterToCount)
    {
        this.NumberOfTimes = 0;
        this.Phrase=phrase;
        this.CharacterToCount=characterToCount;
        count();
    }

     
     //return the value of instance variable NumberOfTimes
    public int getNumberOfTimes() 
    {
        return NumberOfTimes;
    }
    //return the value of instance variable Phrase
    public String getPhrase() 
    {
        return Phrase;
    }

    //return the value of instance varaible CharacterToCount 
    public char getCharacterToCount() 
    {
        return CharacterToCount;
    }
    
    
    //method to count the number of times a character is in a phrase
    private void count()
    {
        char[] array=this.Phrase.toCharArray(); //conver string to char array
       
        if (this.Counter==array.length)  //if the value of Counter is equal the length of array
        {
          
        }
        
        //not equal
        else
        {
            if (array[this.Counter]==this.CharacterToCount) //if the value at array[Counter] is equal CharacterToCount
            {
                this.NumberOfTimes++; //increase by 1
            }
            this.Counter++; //increase by one
            count(); //recursive call
        }
    }
   
}
