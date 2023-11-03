package variables;
// if you create variable here its is global

/**
 *  local variable   - variables which are declared inside the method or inside constructors are called
 *                    local variables
 *  Scope             - within the method
 *  Memory allocation - when method starts
 *  Memory            - stack
 */

public class LocalVariables {
    public static void main(String[] args) {
      // a is a local variable - why? because it is inside the method
        int a = 2;
        System .out.println(a);
        a = 3;
        System.out.println(a);

    }

    // public static void main(String [] args){

    }

