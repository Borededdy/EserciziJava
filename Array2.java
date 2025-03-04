/*
 * Creare un array bidimensionale per raprresentare l'area 
 * di gioco del TRIS. 
 * Inserire nell'array X e O nel modo seguente:
 * 
 *   X |   |
 *  ----------- 
 *   O | O | X
 *  ----------- 
 *   X | O | 
 * 
 * Stampare la griglia. 
 *   
 */


public class Array2 {
	public static void main(String[] args) {
		String[][] tris = {{"X"}, {"0", "0", "X"}, {"X", "0"}};

		for (int i = 0; i < tris.length; i++) {
			for (int j = 0; j < tris[i].length; j++) {
				System.out.print(tris[i][j] + " ");
			}
			System.out.println();
		}
	}
}
