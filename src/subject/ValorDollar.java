package subject;

import java.util.ArrayList;

import observer.Observer;

public class ValorDollar implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private float value;
	private String time;
	
	public void setMudancaValor(float value,String time){
		this.value = value;
		this.time = time;
		notifyObservers();
		
	}

	public void notifyObservers() {
		
		//atualiza todos os elementos da lista
		for (Observer observer : observers) {
			observer.update(value, time);
		}
		
	}
	
	public void registerObserver(Observer observer) {

		observers.add(observer);
		
	}

	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	
	
	
	
	
	
}
