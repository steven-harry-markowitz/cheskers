public class PieceWithColor {

	private Piece piece;
	private PieceColor color;

	public Piece getPiece() {
		return this.piece;
	}

	public PieceColor getColor() {
		return this.color;
	}

	public PieceWithColor(Piece piece, PieceColor color) {

		this.piece = piece;
		this.color = color;

	}
}