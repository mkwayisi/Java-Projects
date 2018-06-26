
public class Phobia {
	private String name;
	   private String description;
	   public String getName() {
	       return name;
	   }
	   public void setName(String name) {
	       this.name = name;
	   }
	   public String getDescription() {
	       return description;
	   }
	   public void setDescription(String description) {
	       this.description = description;
	   }
	   public String toString(){
	       return getName() +" :: "+getDescription();
	   }
	   public boolean equlas(Phobia p){
	       if(name.equals(p.getName())){
	           return true;
	       }
	       else{
	           return false;
	       }
	   }
}
