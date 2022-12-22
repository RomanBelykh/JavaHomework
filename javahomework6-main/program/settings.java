package program;
public class settings {
    protected String firma;
    protected int memory;
    protected int ssd;
    protected String color;
        
    public settings(String firma, int memory, int ssd, String color) {
        this.firma=firma;
        this.memory=memory;
        this.ssd=ssd;
        this.color=color;
    }

    public int getRam(){
return memory;
    }
@Override
public String toString(){
    return "[" + firma + "] {"+ memory+ "} {"+ssd +"} {" + color+ "}";
}
}