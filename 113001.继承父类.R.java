package App;

public class R {

	static void Shuzu() {
		String boy_filePath = "img/boy.gif";
		String girl_filePath = "img/girl.gif";
		int[][] array2d = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(boy_filePath);
		System.out.println(girl_filePath);
		int i,j;
		for(i=0; i<array2d.length;i++)
		{
			for (j=0; j< array2d.length; ++j) {
				System.out.println(array2d[i][j]);
			}
		}
	}
}
