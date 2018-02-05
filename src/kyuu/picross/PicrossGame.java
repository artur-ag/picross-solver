package kyuu.picross;

public class PicrossGame {
	
	int width;
	int height;

	int[] verticalHints;
	int[] horizontalHints;

	public PicrossGame(int width, int height, int[] verticalHints, int[] horizontalHints) {
		this.width = width;
		this.height = height;
		this.verticalHints = verticalHints;
		this.horizontalHints = horizontalHints;
	}
}
