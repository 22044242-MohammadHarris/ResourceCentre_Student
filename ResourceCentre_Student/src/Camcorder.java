
//test
public class Camcorder extends Item{
private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		//String output = "";
		String output = super.toString();
		output = String.format("%-60s %-20d ",output, opticalZoom);
		return output;
	}
}

