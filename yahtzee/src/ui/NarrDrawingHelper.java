package ui;

public class NarrDrawingHelper {

	private static NarrDrawingHelper singleton;

	private NarrDrawingHelper() {

	}

	public static NarrDrawingHelper instance() {
		if (singleton == null) {
			singleton = new NarrDrawingHelper();
		}
		return singleton;
	}

	public void drawSelectableDie() {
		// TODO Auto-generated method stub

	}

}
