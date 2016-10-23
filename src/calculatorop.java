/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abel2
 */
public class calculatorop {
    public double operation(String ope,double a,double b){
        switch(ope){
            case "sum" :
                        return a+b;
            case "minus":return a-b;
            case "multiply":return a*b;
            case "divide":return a/b;
             
                
        }
        return 0.0;
    }
}
