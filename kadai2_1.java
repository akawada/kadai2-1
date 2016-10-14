public class kadai2_1
{
	public static void main(String args[])
	{
		String kekka; 
		for( int i=0; i<9; i++ ) {
			for( int j=0; j<9; j++ ){
				kekka = String.valueOf((i+1) * (j+1));
				// 1の位を合わせるための処理
				if (kekka.length() ==1){
					kekka = " " + kekka ;
				}
				System.out.print(kekka + " ");
			}
			System.out.println(); 
		}
	}
}