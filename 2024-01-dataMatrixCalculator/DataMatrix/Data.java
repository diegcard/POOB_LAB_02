
/**
 * Represents a simple data: boolean ('TRUE', 'FALSE'), numerical (integer or real), character (any character, if it is a digit it is considered numeric)
 *
 * @author ECI-2024-01
 */
public class Data{
    

    /**
     * Constructs a new Data given its value, If it is not possible, it is assumed FALSE
     */
    public Data(String s){
       
    }

  
     /**
     * Add the specified data with this data
     */   
    // boolean + boolean. + is OR
    // numerical + numerical. + is +
    // character + character. + is the largest character
    // boolean + numerical. Transform the number to boolean. If 0, true. False otherwise.
    // boolean + character. Transform the boolean to character. TRUE is T and FALSE is F.
    // + is commutative
    public Data add(Data b){
        return null;
    }
    
  
     /**
     * Substract the specified data with this data
     */   
    // boolean - boolean. - is AND
    // numerical - numerical. + is -
    // character - character. - is the smaller character
    // boolean - numerical. Transform the number to boolean. If 0, true. False otherwise.
    // boolean - character. Transform the boolean to character. TRUE is T and FALSE is F.
    // + is commutative
    public Data sub(Data b){
        return null;
    }
    
    /**
     * Returns the data type
     * @returns 'b', 'n', or 'c'
     */
    public char type(Data b){
        return '?';
    }
    
    @Override
    //Return the string representation of the data, not the original string
    public String toString () {
          return null;
    }   
    
     /**
     * Return the string used to create the Data without leading or trailing blanks
     */   
    public String string() {
          return null;
    }  
    
}
