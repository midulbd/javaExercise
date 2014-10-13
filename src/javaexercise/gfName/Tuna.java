
package javaexercise.gfName;

public class Tuna {
    private String girlName;
    
    public void setName(String name)
        {
            girlName=name;
        }
    public String getname()
        {
            return girlName;
        }
    public void saying()
        {
            System.out.printf("your first gfs was %s ", getname());
        }
    
}
