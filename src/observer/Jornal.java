package observer;

public class Jornal implements Observer{
	
	private float value;
	private String time;
	
	//getters and setters
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public float getValue() {
		return value;
	}
	
	public void setValue(float value) {
		this.value = value;
	}
	
	//atualiza os dados do jornal sobre o dollar
	public void update(float value, String time){
		this.value=value;
		this.time=time;
		
	}
	
	
	//jornal publica a noticia
	public void publish(){
		
		System.out.println(" Jornal \n " + " Dollar: " + value + " \n " + " Time: " + time);
	}
	
}