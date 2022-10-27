public class Businfo{
	private int Busno;
	private boolean Ac;
	private int capacity;    //get and set method to get in public

	Businfo(int no,boolean ac,int cap){
		 Busno=no;
	     Ac=ac;
	     capacity=cap;

	}
	public int getBusno(){
		return Busno;
	}
	public boolean getAc(){
		return Ac;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setAc(boolean ac){
		Ac=ac;
	}
	public void setCapacity(int cap){
		capacity=cap;
	}
	public void displaybusinformation(){
		System.out.println("Busno :" +Busno+ "  Ac :" +Ac+ "  Total Capacity : "+capacity);
			}
}