
public class RGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RGBcompare("010FCB");

	}
	public static void RGBcompare(String RGB){
		int R = Integer.parseInt(RGB.substring(0,2), 16);
		int G = Integer.parseInt(RGB.substring(2,4), 16);
		int B = Integer.parseInt(RGB.substring(4,6), 16);
		
		System.out.println(Integer.parseInt(RGB.substring(4,6),16));
		
		System.out.println("R: " + R + "  G: " + G + "  B: " + B);
		
	}
}
