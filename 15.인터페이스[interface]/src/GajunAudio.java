
public class GajunAudio implements GajunOnOff,GajunVolume{
	public void method1() {
		System.out.println("Audio.method1()");
	}
	public void method2() {
		System.out.println("Audio.method2()");
	}
	@Override
	public void volumeUp() {
		System.out.println("Audio.volumUp()");
		
		
	}@Override
	public void volumeDown() {
		System.out.println("Audio.volumDown()");
		
		
	}@Override
	public void on() {
		System.out.println("Audio.on()");
		
		
	}@Override
	public void off() {
		System.out.println("Audio.off()");
		
		
	}
	

}
