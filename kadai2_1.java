public class kadai2_1
{
	  public static void main(String args[])
	  {
		    String kekka; 
		    // �z��̐錾�B
		    int kuku[][] = new int[9][9];

		    // ���ʂ�z��ɕۑ��B
		    for( int i=0; i<9; i++ ) {
		      for( int j=0; j<9; j++ ){
		    	  kuku[i][j] = (i+1) * (j+1);
		      }
		    }

		    // ���ʂ�\���B
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