
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5};
		int [] [] dub = new int[array.length][array.length];
		for(int i=0;i<dub.length;i++)
		{
			for(int j=0;j<dub[i].length;j++)
			{
				dub[i][j] = array[j]*i;
			}
		}
		dub = modDoubleArrayBy(dub,2);
		for(int i=0;i<dub.length;i++)
		{
			for(int j=0;j<dub[i].length;j++)
			{
				System.out.print(dub[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] modDoubleArrayBy(int[][] dub, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	


