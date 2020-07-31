import java.util.ArrayList;

public class Rezept {
	
	
	String name;
	Object zutat;
	String text;
	
	Rezept(){
		
	}
	
	Rezept(String name){
		this.name = name;
	}
	
	
	public void setRname(String name) {
		this.name = name;
	}
	
	
	public String getRname() {
		return name;
	}
	
	public void setZutat(Object zutat) {
		this.zutat= zutat;
	}
	public Object getZutat() {
		return zutat;
	}
	
	public void setBeschreibung(String text) {
		this.text = text;
	}
	
	public String getBeschreibung() {
		return text;
	}
	
	
	
	
	
	
	
	

}
