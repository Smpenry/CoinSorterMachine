/**
 * Coin Machine Project
 * @author spenry
 * @version 03.30.23
 */

public abstract class Coin {
    public abstract double getValue();
    public abstract String getName();
    public String getPluralName() {
        return (getName().equals("penny") ? "pennies" : getName() + "s");
    }

    public boolean equals(Object other){
        if(other instanceof Coin){
            return this.getValue()== ((Coin)other).getValue();

        }
        return false;
    }
}

      // penny - pennies
    // nickel - nickels// define in the class: pennies, dimes..

