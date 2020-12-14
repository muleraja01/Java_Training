/**
 * 
 */
package coreInterface;

/**
 * @author HP
 *
 */
public class TrafficRules implements CentralTraffic {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a=new TrafficRules();
		a.greenGo();
		a.redStop();
		a.flashYellow();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		
	}

}
