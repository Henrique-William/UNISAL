public class EventoEsportivo implements IEvento{
	private String desc;
	public String getDesc(){
		return desc;
	}
	public void setDesc(String d){
		desc = d;
	}
	public void mostraDesc(){
		System.out.println(desc);
	}
}