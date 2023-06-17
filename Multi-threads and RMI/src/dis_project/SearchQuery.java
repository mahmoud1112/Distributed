/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dis_project;
// Java program to implement the Search interface
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class SearchQuery extends UnicastRemoteObject implements Search {
	// Default constructor to throw RemoteException
	// from its parent constructor
	SearchQuery() throws RemoteException{
		super();
	}

        
        public int count(String string){
         String str = string;    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
                count++;    
        }    
        //Displays the total number of characters present in the given string    
            return count;
        }
        
        
        
        
        
        public ArrayList repeatedwords(String str){
            
        int count;
 
        //Converts the string into lowercase  
        str = str.toLowerCase();  
          ArrayList<String> arr = new ArrayList<String>(); 
        //Split the string into words using built-in function  
        String words[] = str.split(" ");  
          
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    count++;  
                    //Set words[j] to 0 to avoid printing visited word  
                    words[j] = "0";  
                }  
            }  
              
            //Displays the duplicate word if count is greater than 1  
            if(count > 1 && words[i] != "0")  
                arr.add(words[i]);  
        }
        return arr;
        }  
        
        
        
        
        
        
        public String longest(String search)throws RemoteException{
      String string = search;   
      String word = "", small = "", large="";    
      String[] words = new String[1000];    
      int length = 0;    
          
      //Add extra space after string to get the last word in the given string    
      string = string + " ";    
          
      for(int i = 0; i < string.length(); i++){    
          //Split the string into words    
          if(string.charAt(i) != ' '){    
              word = word + string.charAt(i);    
          }    
          else{    
              //Add word to array words    
              words[length] = word;    
              //Increment length    
              length++;    
              //Make word an empty string    
              word = "";    
          }    
      }            
      //Initialize small and large with first word in the string    
      small = large = words[0];    
          
      //Determine smallest and largest word in the string    
      for(int k = 0; k < length; k++){    
              
          //If length of small is greater than any word present in the string    
          //Store value of word into small    
          if(small.length() > words[k].length())    
              small = words[k];    
   
          //If length of large is less than any word present in the string    
          //Store value of word into large    
          if(large.length() < words[k].length())    
              large = words[k];    
      }    
		return large;
	}
        
        
        
        
     
        
        
        
        
	// Implementation of the query interface
public String shortest(String search)throws RemoteException{
      String string = search;   
      String word = "", small = "", large="";    
      String[] words = new String[1000];    
      int length = 0;    
          
      //Add extra space after string to get the last word in the given string    
      string = string + " ";    
          
      for(int i = 0; i < string.length(); i++){    
          //Split the string into words    
          if(string.charAt(i) != ' '){    
              word = word + string.charAt(i);    
          }    
          else{    
              //Add word to array words    
              words[length] = word;    
              //Increment length    
              length++;    
              //Make word an empty string    
              word = "";    
          }    
      }            
      //Initialize small and large with first word in the string    
      small = large = words[0];    
          
      //Determine smallest and largest word in the string    
      for(int k = 0; k < length; k++){    
              
          //If length of small is greater than any word present in the string    
          //Store value of word into small    
          if(small.length() > words[k].length())    
              small = words[k];    
   
          //If length of large is less than any word present in the string    
          //Store value of word into large    
          if(large.length() < words[k].length())    
              large = words[k];    
      }    
		return small;
	}
        
        
        
        
        
        
        
        
        
        public Map Repeat(String str){
        Map<String,Integer> mp=new TreeMap<>();
 
        // Splitting to find the word
        String arr[]=str.split(" ");
 
        // Loop to iterate over the words
        for(int i=0;i<arr.length;i++)
        {
            // Condition to check if the
            // array element is present
            // the hash-map
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        
        // Loop to iterate over the
        // elements of the map
        return mp;
    }
}
