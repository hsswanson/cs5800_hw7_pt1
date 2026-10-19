import java.util.Arrays;

public class Pizza {
    private String[] toppings;
    private String size;
    private String chain;

    protected Pizza(String chain, String size, String[] toppings){
        if(size == null){
            throw new IllegalStateException("Pizza size not set.");
        }
        this.chain=chain;
        this.size=size;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return this.size + " size pizza from " +this.chain +" with "+ Arrays.toString(this.toppings);

    }
    public void eat(){
        System.out.println("Eating a "+ this +".");
    }
}
