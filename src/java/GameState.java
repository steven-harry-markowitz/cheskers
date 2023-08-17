interface GameState {

	Board getBoard();
	PieceColor whoseTurn(); // who moves next
	void print(); // print current board and whoseMove
}