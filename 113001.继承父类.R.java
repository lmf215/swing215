package App;

public class R {

	static void Shuzu() {
		String boy_filePath = "img/boy.gif";
		String girl_filePath = "img/girl.gif";
		int[][] array2d = { {1,2},{3,4},{5,6}};
		System.out.println(boy_filePath);
		System.out.println(girl_filePath);
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				System.out.println(array2d[row][column]+"");
			}
			System.out.println();
		}
	}
}
