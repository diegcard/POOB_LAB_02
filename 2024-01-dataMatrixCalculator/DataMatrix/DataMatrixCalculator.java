import java.util.HashMap;

/** Data Matrix Calculator
 * 
 * @author CIS 2024-01
 */
    
public class DataMatrixCalculator{
    
    private HashMap<String, DataMatrix> variables;
    
    public DataMatrixCalculator(){
    }


    //Assign a matrix to a variable
    public void assign(String name, String values[][] ){
    }    
    
    //Consult the variables of a calculator
    public String[] variables(){
        return null;
    }    
       
  
    //Assigns the value of an operation to a variable (unary operations)
    // a := unary b
    //The unary operators are: s (hape), r (eshape)
    // shape returns a (1x2) matrix with the shape (rows, columns)
    // In reshape b is a (1x2) matrix with the shape (rows, columns)
    //If this is not possible, it returns the (1x1) matrix with a false value
    public void assign(String a, char unary, String b){
    }    
    
    
    //Assigns the value of an operation to a variable (simple binary operations)
    // a := b simple c
    //The simple operators are: +, -
     //If this is not possible, it returns the (1x1) matrix with a false value
    public void assign(String a, String b, char sBinary, String c){
    }   
    

    
    //Returns the string represention of a matrix. Columns must be aligned.
    public String toString(String variable){
        return null;
    }
    
    //If the last operation was successful
    public boolean ok(){
        return false;
    }
}
    



