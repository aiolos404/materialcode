package music;

class Music {
	private static double _pitch = 440;
	public static void play(int duration){
			System.out.println("play for " + duration/1000.0 + ": " + _pitch);
	}
	public static void rest(int duration){
		System.out.println("rest for " + duration/1000.0);
	}
	public static void scalePitch(double factor){
		_pitch *= factor;
	}
	public void reset(){
		_pitch = 440;
	}
}
