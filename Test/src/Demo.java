
public class Demo {

	public static void main(String[] args) {
		int[] a={02,11,03,22,15,34,25,78,10};
		int t=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1]){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
}
