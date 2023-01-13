package Lab701;

public class Duck extends Poulty {

    public Duck(String my_type) {
        super(my_type);
    }

    public Duck(String name, String my_type) {
        super(my_type);
    }

    public Duck(String name, Organ o, String my_type) {
        super(name, o, my_type);
    }

    public Duck() {
    }
    
    public String move (){
        return " swimming";
    }

    public String eat (){
        return "rice" ;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " I like "+move()+" "+ " I eat " +eat();
    }
}
