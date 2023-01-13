package Lab701;

public class Fish  extends Animal{
    String my_type;
    Organ o = new Organ("fins");

    public static int  checkFish = 0 ;
    
    public Fish (String name){
        super(name);
    }
    public Fish(String name, Organ o, String my_type) {
        super(name, o);
        this.my_type = my_type;
    }
    
    public String getMy_type() {
        return my_type;
    }

    public Fish (){
        o = new Organ("fins");
        my_type = "Fish";
    }
    public String toString (){
        return super.toString()+" I am a Fish. I habe "+o.getType();
    }

}
