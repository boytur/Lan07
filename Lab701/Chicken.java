package Lab701;

public class Chicken extends Poulty{

    public Chicken(String my_type) {
        super(my_type);
    }

    public Chicken(String name, Organ o, String my_type) {
        super(name, o, my_type);
    }

    public Chicken() {
    }
    
    public String move (){
        return "walking";
    }
    public String eat (){
        return "worm";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ " I like "+move()+" "+ " I eat " +eat();
    }
}
