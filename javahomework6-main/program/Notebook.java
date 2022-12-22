package program;

import java.util.Objects;

public class Notebook extends settings {

    public Notebook(String firma, int memory, int ssd, String color) {
        super(firma, memory, ssd, color);
        }


@Override
public int getRam() {
    return memory;
    
}
        
        @Override
        public boolean equals(Object obj) {
        if (obj instanceof Notebook) {
        Notebook anotherCat = (Notebook) obj;
        return firma.equals(anotherCat.firma);
        }
        
        return false;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(memory);
        }
        }    


