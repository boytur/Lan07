package Lab701;

public class Dolphin extends Fish{

    public Dolphin(String my_type) {
        super(my_type);
    }

    public Dolphin(String name, Organ o, String my_type) {
        super(name, o, my_type);
    }

    public Dolphin() {
    }
    
    public String move (){
        return " hover swimming";
    }

    public String eat (){
        return " seaweed" ;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " I like "+move()+" "+ " I eat " +eat();
    }
    
}
