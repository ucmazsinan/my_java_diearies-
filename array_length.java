package diziuzunluğu;

public class dizi {
	public static int max(int a,int b) {
		int enb;
		if(a>b) {
			enb = a;
			return enb;
		}
		return -1;
	}
	public static void main(String args[]) {
	int [] aray = new int [15];
	int N = aray.length;
	int hi = aray.length-1;
	int lo = 0;
	System.out.println("dizi uzunluğu : "+N);
	System.out.println("dizinin en küçük elemanı : "+lo+"\ndizinin en büyük elemanı:"+hi);
	for(int i = 0; i<=hi; i++)
	{
		aray[i] = i;
		System.out.println("dizinin kendi elemanları:"+aray[i]);
	}
	System.out.println(max(4,12));
	

}
}
