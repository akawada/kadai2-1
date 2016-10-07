public class kadai2_1
{
	  public static void main(String args[])
	  {
		    String kekka; 
		    // 配列の宣言。
		    int kuku[][] = new int[9][9];

		    // 結果を配列に保存。
		    for( int i=0; i<9; i++ ) {
		      for( int j=0; j<9; j++ ){
		    	  kuku[i][j] = (i+1) * (j+1);
		      }
		    }

		    // 結果を表示。
		    for( int i=0; i<9; i++ ) {
		      for( int j=0; j<9; j++ ) {
		    	  kekka = String.valueOf(kuku[i][j]);
		    	  if (kekka.length() ==1){
		    		  kekka = " " + kekka ;
		    	  }
		    	  System.out.print(kekka + " ");
		      }
		      	  System.out.println(); 
		    }
	  }
}