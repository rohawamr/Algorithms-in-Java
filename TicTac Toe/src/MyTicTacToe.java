public class MyTicTacToe {
	private char t[][];
	private char currplayer;

	public MyTicTacToe() {
		t = new char[3][3];
		System.out.println("The Tic Tac Toe application is here: ");
		currplayer = 'X';
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				t[i][j]='-';
			}
		}
	}

	public void display() {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				System.out.print("\t"+t[i][j]);
			}
			System.out.println();
		}
	}

	public void play(int i) {
		switch (i) {
		case 1:
			t[0][0] = currplayer;
			break;

		case 2:
			t[0][1] = currplayer;
			break;
		case 3:
			t[0][2] = currplayer;
			break;
		case 4:
			t[1][0] = currplayer;
			break;
		case 5:
			t[1][1] = currplayer;
			break;
		case 6:
			t[1][2] = currplayer;
			break;
		case 7:
			t[2][0] = currplayer;
			break;
		case 8:
			t[2][1] = currplayer;
			break;
		case 9:
			t[2][2] = currplayer;
			break;

		}
		this.display();
		this.checkWin();
		this.playerChange();
	}

	public void playerChange() {
		if (currplayer == 'X') {
			currplayer = 'Y';
		} else {
			currplayer = 'X';
		}

	}

	public void checkWin() {
		if (currplayer == 'X') {
			if(checkXrows() || checkXcols() || checkXdiag()){
				System.out.println("X Wins");
			}
					
			
		} 
		if (currplayer == 'Y') {
			if(checkYrows() || checkYcols() || checkYdiag()){
				System.out.println("Y Wins");
			}
					
			
		}

	}

	public boolean checkXrows() {
		boolean winX = false;

		for (int i = 0; i < 3; i++) {
			int countX = 0;
			for (int j = 0; j < 3; j++) {
				if (t[i][j] == 'X') {
					countX +=1;

					if (countX == 3) {
						winX = true;
						break;
					}
				}

			}

		}

		return winX;
	}

	public boolean checkYrows() {
		boolean winY = false;

		for (int i = 0; i < 3; i++) {
			int countY = 0;
			for (int j = 0; j < 3; j++) {
				if (t[i][j] == 'Y') {
					countY += 1;
					if (countY == 3) {
						winY = true;
						break;
					}
				}

			}

		}
		return winY;
	}

	public boolean checkXcols() {
		boolean winX = false;

		for (int i = 0; i < 3; i++) {
			int countX = 0;
			for (int j = 0; j < 3; j++) {
				if (t[j][i] == 'X') {
					countX += 1;
					if (countX == 3) {
						winX = true;
						break;
					}
				}

			}

		}
		return winX;
	}

	public boolean checkYcols() {
		boolean winY = false;

		for (int i = 0; i < 3; i++) {
			int countY = 0;
			for (int j = 0; j < 3; j++) {
				if (t[j][i] == 'Y') {
					countY += 1;
					if (countY == 3) {
						winY = true;
						break;
					}
				}

			}

		}
		return winY;
	}
	
	public boolean checkXdiag() {
		boolean winX = false;
		int countXd1 = 0;
		int countXd2 = 0;

		for (int i = 0; i < 3; i++) {
			if (t[i][i] == 'X') {
				countXd1 += 1;
				if (countXd1 == 3) {
					winX = true;
					break;
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			if (t[i][2-i] == 'X') {
				countXd2 += 1;
				if (countXd2 == 3) {
					winX = true;
					break;
				}
			}

		}

		
		return winX;
	}
	
	public boolean checkYdiag() {
		boolean winY = false;
		int countYd1 = 0;
		int countYd2 = 0;

		for (int i = 0; i < 3; i++) {
			if (t[i][i] == 'Y') {
				countYd1 += 1;
				if (countYd1 == 3) {
					winY = true;
					break;
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			if (t[i][2-i] == 'Y') {
				countYd2 += 1;
				if (countYd2 == 3) {
					winY = true;
					break;
				}
			}

		}

		
		return winY;
	}

}