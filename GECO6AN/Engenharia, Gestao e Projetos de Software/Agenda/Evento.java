public abstract class Evento implements IEvento{
	private String desc;
	//gets and sets
	public String getDesc(){
		return desc;
	}
	public void setDesc(String d) {
		desc = d;	
	}
	public void mostraDesc(){
		System.out.println(desc);
	}
}