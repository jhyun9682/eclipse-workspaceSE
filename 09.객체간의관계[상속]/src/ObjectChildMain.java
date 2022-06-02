
public class ObjectChildMain {

	public static void main(String[] args) {
		ObjectChild oc1=new ObjectChild();
		int hashcode=oc1.hashCode();
		System.out.println(hashcode);
		System.out.println(Integer.toHexString(hashcode));
		String str1=oc1.toString();
		System.out.println(str1);

	}

}
