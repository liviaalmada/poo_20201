
public class Calculadora {
	private int battery;
	private int maxBattery;//objeto
	
	public Calculadora(int maxBattery) {//parametro
		this.maxBattery = maxBattery;
		this.battery = 0;
	}
	
	public int getBattery( ) {
		return battery;
	}
	
	public void charge(int value) {
		battery += value;
		if (battery > maxBattery) {
			battery = maxBattery;
		}
	
	}
	
    public String sum(int a, int b) {
    	if(battery==0) {
    		return "fail: bateria insuficiente";
    	}
    	battery-=1;
    	return (a+b)+"";
    }
    
    public String div(int a, int b) {
    	if(battery==0) {
    		return "fail: bateria insuficiente";
    	}
    	battery-=1;
    	if (b==0) return "fail: divisao por zero";
    	return (a/b)+"";
    }
    
    
}
