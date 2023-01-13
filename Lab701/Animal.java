package Lab701;

public class Animal{
    protected String name ;
    protected Organ o = new Organ();
    public Animal (){}

    public Animal (String name ){
        this.name = name;
    }
    public Animal(String name, Organ o) {
        this.name = name;
        this.o = o;
    }
    public String getName() {
        return name;
    }
    public Organ getO() {
        return new Organ();
    }
    public String toString (){
        return "Hello, my name is "+getName();
    }
}
