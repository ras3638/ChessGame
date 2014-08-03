package chessPackage;

import java.util.ArrayList;

public class Piece {
	static ArrayList<int[]> aggregateBlacks(){
		
		ArrayList<int[]> BlackAggregate = new ArrayList<int []>();

		if (BlackQueenD8.getActive()){
			BlackAggregate.add(BlackQueenD8.getCurrentPositionXY());
		}
		
		if(BlackKingE8.getActive()){
			BlackAggregate.add(BlackKingE8.getCurrentPositionXY());
		}
	
		if(BlackRookH8.getActive()){
			BlackAggregate.add(BlackRookH8.getCurrentPositionXY());
		}
	
		if(BlackRookA8.getActive()){
			BlackAggregate.add(BlackRookA8.getCurrentPositionXY());
		}


		
		if (BlackBishopC8.getActive()){
			BlackAggregate.add(BlackBishopC8.getCurrentPositionXY());
		}

		if(BlackBishopF8.getActive()){
			BlackAggregate.add(BlackBishopF8.getCurrentPositionXY());
		}
		if(BlackKnightG8.getActive()){
			BlackAggregate.add(BlackKnightG8.getCurrentPositionXY());
		}
		if(BlackKnightB8.getActive()){
			BlackAggregate.add(BlackKnightB8.getCurrentPositionXY());
		}

		if(BlackPawnA7.getActive()){
			BlackAggregate.add(BlackPawnA7.getCurrentPositionXY());
		}
		if(BlackPawnB7.getActive()){
			BlackAggregate.add(BlackPawnB7.getCurrentPositionXY());
		}
		
		if(BlackPawnC7.getActive()){
			BlackAggregate.add(BlackPawnC7.getCurrentPositionXY());
		}
		if(BlackPawnD7.getActive()){
			BlackAggregate.add(BlackPawnD7.getCurrentPositionXY());
		}
		if(BlackPawnE7.getActive()){
			BlackAggregate.add(BlackPawnE7.getCurrentPositionXY());
		}
		if(BlackPawnF7.getActive()){
			BlackAggregate.add(BlackPawnF7.getCurrentPositionXY());
		}
		if(BlackPawnG7.getActive()){
			BlackAggregate.add(BlackPawnG7.getCurrentPositionXY());
		}
		if(BlackPawnH7.getActive()){
			BlackAggregate.add(BlackPawnH7.getCurrentPositionXY());
		}
		
		
		if(BlackRookProm1.getActive()){
			BlackAggregate.add(BlackRookProm1.getCurrentPositionXY());
		}
		
		if(BlackRookProm2.getActive()){
			BlackAggregate.add(BlackRookProm2.getCurrentPositionXY());
		}
		if(BlackRookProm3.getActive()){
			BlackAggregate.add(BlackRookProm3.getCurrentPositionXY());
		}
		if(BlackRookProm4.getActive()){
			BlackAggregate.add(BlackRookProm4.getCurrentPositionXY());
		}
		if(BlackRookProm5.getActive()){
			BlackAggregate.add(BlackRookProm5.getCurrentPositionXY());
		}
		if(BlackRookProm6.getActive()){
			BlackAggregate.add(BlackRookProm6.getCurrentPositionXY());
		}
		if(BlackRookProm7.getActive()){
			BlackAggregate.add(BlackRookProm7.getCurrentPositionXY());
		}
		if(BlackRookProm8.getActive()){
			BlackAggregate.add(BlackRookProm8.getCurrentPositionXY());
		}
		if(BlackQueenProm1.getActive()){
			BlackAggregate.add(BlackQueenProm1.getCurrentPositionXY());
		}
		if(BlackQueenProm2.getActive()){
			BlackAggregate.add(BlackQueenProm2.getCurrentPositionXY());
		}
		if(BlackQueenProm3.getActive()){
			BlackAggregate.add(BlackQueenProm3.getCurrentPositionXY());
		}
		if(BlackQueenProm4.getActive()){
			BlackAggregate.add(BlackQueenProm4.getCurrentPositionXY());
		}
		if(BlackQueenProm5.getActive()){
			BlackAggregate.add(BlackQueenProm5.getCurrentPositionXY());
		}
		
		if(BlackQueenProm6.getActive()){
			BlackAggregate.add(BlackQueenProm6.getCurrentPositionXY());
		}
		if(BlackQueenProm7.getActive()){
			BlackAggregate.add(BlackQueenProm7.getCurrentPositionXY());
		}
		
		if(BlackQueenProm8.getActive()){
			BlackAggregate.add(BlackQueenProm8.getCurrentPositionXY());
		}
		
		
		if(BlackBishopProm1.getActive()){
			BlackAggregate.add(BlackBishopProm1.getCurrentPositionXY());
		}
		if(BlackBishopProm2.getActive()){
			BlackAggregate.add(BlackBishopProm2.getCurrentPositionXY());
		}
		if(BlackBishopProm3.getActive()){
			BlackAggregate.add(BlackBishopProm3.getCurrentPositionXY());
		}
		if(BlackBishopProm4.getActive()){
			BlackAggregate.add(BlackBishopProm4.getCurrentPositionXY());
		}
		if(BlackBishopProm5.getActive()){
			BlackAggregate.add(BlackBishopProm5.getCurrentPositionXY());
		}
		
		if(BlackBishopProm6.getActive()){
			BlackAggregate.add(BlackBishopProm6.getCurrentPositionXY());
		}
		if(BlackBishopProm7.getActive()){
			BlackAggregate.add(BlackBishopProm7.getCurrentPositionXY());
		}
		if(BlackBishopProm8.getActive()){
			BlackAggregate.add(BlackBishopProm8.getCurrentPositionXY());
		}
		
		
		if(BlackKnightProm1.getActive()){
			BlackAggregate.add(BlackKnightProm1.getCurrentPositionXY());
		}
		if(BlackKnightProm2.getActive()){
			BlackAggregate.add(BlackKnightProm2.getCurrentPositionXY());
		}
		if(BlackKnightProm3.getActive()){
			BlackAggregate.add(BlackKnightProm3.getCurrentPositionXY());
		}
		if(BlackKnightProm4.getActive()){
			BlackAggregate.add(BlackKnightProm4.getCurrentPositionXY());
		}
		if(BlackKnightProm5.getActive()){
			BlackAggregate.add(BlackKnightProm5.getCurrentPositionXY());
		}
		if(BlackKnightProm6.getActive()){
			BlackAggregate.add(BlackKnightProm6.getCurrentPositionXY());
		}
		if(BlackKnightProm7.getActive()){
			BlackAggregate.add(BlackKnightProm7.getCurrentPositionXY());
		}
		if(BlackKnightProm8.getActive()){
			BlackAggregate.add(BlackKnightProm8.getCurrentPositionXY());
		}
		
		return BlackAggregate;
	}
	static ArrayList<int[]> aggregateWhites(){
		
		ArrayList<int[]> WhiteAggregate = new ArrayList<int []>();
		
		if(WhitePawnB2.getActive()){
			WhiteAggregate.add(WhitePawnB2.getCurrentPositionXY());
		}
		
		if(WhitePawnA2.getActive()){
			WhiteAggregate.add(WhitePawnA2.getCurrentPositionXY());
		}
		
		if(WhiteKingE1.getActive()){
			WhiteAggregate.add(WhiteKingE1.getCurrentPositionXY());
		}
		
		if(WhiteKnightB1.getActive()){
			WhiteAggregate.add(WhiteKnightB1.getCurrentPositionXY());
		}
		
		if(WhitePawnC2.getActive()){
			WhiteAggregate.add(WhitePawnC2.getCurrentPositionXY());
		}
		
		if(WhiteRookA1.getActive()){
			WhiteAggregate.add(WhiteRookA1.getCurrentPositionXY());
		}

		if (WhiteBishopC1.getActive()){
			WhiteAggregate.add(WhiteBishopC1.getCurrentPositionXY());
		}
		if (WhiteQueenD1.getActive()){
			WhiteAggregate.add(WhiteQueenD1.getCurrentPositionXY());
		}
		
	
		if(WhiteRookH1.getActive()){
			WhiteAggregate.add(WhiteRookH1.getCurrentPositionXY());
		}
		if(WhitePawnD2.getActive()){
			WhiteAggregate.add(WhitePawnD2.getCurrentPositionXY());
		}
		if(WhiteBishopF1.getActive()){
			WhiteAggregate.add(WhiteBishopF1.getCurrentPositionXY());
		}
		if(WhiteKnightG1.getActive()){
			WhiteAggregate.add(WhiteKnightG1.getCurrentPositionXY());
		}
		if(WhitePawnE2.getActive()){
			WhiteAggregate.add(WhitePawnE2.getCurrentPositionXY());
		}
		if(WhitePawnF2.getActive()){
			WhiteAggregate.add(WhitePawnF2.getCurrentPositionXY());
		}
		if(WhitePawnG2.getActive()){
			WhiteAggregate.add(WhitePawnG2.getCurrentPositionXY());
		}
		if(WhitePawnH2.getActive()){
			WhiteAggregate.add(WhitePawnH2.getCurrentPositionXY());
		}
		
		
		if(WhiteRookProm1.getActive()){
			WhiteAggregate.add(WhiteRookProm1.getCurrentPositionXY());
		}
		
		if(WhiteRookProm2.getActive()){
			WhiteAggregate.add(WhiteRookProm2.getCurrentPositionXY());
		}
		if(WhiteRookProm3.getActive()){
			WhiteAggregate.add(WhiteRookProm3.getCurrentPositionXY());
		}
		if(WhiteRookProm4.getActive()){
			WhiteAggregate.add(WhiteRookProm4.getCurrentPositionXY());
		}
		if(WhiteRookProm5.getActive()){
			WhiteAggregate.add(WhiteRookProm5.getCurrentPositionXY());
		}
		if(WhiteRookProm6.getActive()){
			WhiteAggregate.add(WhiteRookProm6.getCurrentPositionXY());
		}
		if(WhiteRookProm7.getActive()){
			WhiteAggregate.add(WhiteRookProm7.getCurrentPositionXY());
		}
		if(WhiteRookProm8.getActive()){
			WhiteAggregate.add(WhiteRookProm8.getCurrentPositionXY());
		}
		if(WhiteQueenProm1.getActive()){
			WhiteAggregate.add(WhiteQueenProm1.getCurrentPositionXY());
		}
		if(WhiteQueenProm2.getActive()){
			WhiteAggregate.add(WhiteQueenProm2.getCurrentPositionXY());
		}
		if(WhiteQueenProm3.getActive()){
			WhiteAggregate.add(WhiteQueenProm3.getCurrentPositionXY());
		}
		if(WhiteQueenProm4.getActive()){
			WhiteAggregate.add(WhiteQueenProm4.getCurrentPositionXY());
		}
		if(WhiteQueenProm5.getActive()){
			WhiteAggregate.add(WhiteQueenProm5.getCurrentPositionXY());
		}
		
		if(WhiteQueenProm6.getActive()){
			WhiteAggregate.add(WhiteQueenProm6.getCurrentPositionXY());
		}
		if(WhiteQueenProm7.getActive()){
			WhiteAggregate.add(WhiteQueenProm7.getCurrentPositionXY());
		}
		
		if(WhiteQueenProm8.getActive()){
			WhiteAggregate.add(WhiteQueenProm8.getCurrentPositionXY());
		}
		
		
		if(WhiteBishopProm1.getActive()){
			WhiteAggregate.add(WhiteBishopProm1.getCurrentPositionXY());
		}
		if(WhiteBishopProm2.getActive()){
			WhiteAggregate.add(WhiteBishopProm2.getCurrentPositionXY());
		}
		if(WhiteBishopProm3.getActive()){
			WhiteAggregate.add(WhiteBishopProm3.getCurrentPositionXY());
		}
		if(WhiteBishopProm4.getActive()){
			WhiteAggregate.add(WhiteBishopProm4.getCurrentPositionXY());
		}
		if(WhiteBishopProm5.getActive()){
			WhiteAggregate.add(WhiteBishopProm5.getCurrentPositionXY());
		}
		
		if(WhiteBishopProm6.getActive()){
			WhiteAggregate.add(WhiteBishopProm6.getCurrentPositionXY());
		}
		if(WhiteBishopProm7.getActive()){
			WhiteAggregate.add(WhiteBishopProm7.getCurrentPositionXY());
		}
		if(WhiteBishopProm8.getActive()){
			WhiteAggregate.add(WhiteBishopProm8.getCurrentPositionXY());
		}
		
		
		if(WhiteKnightProm1.getActive()){
			WhiteAggregate.add(WhiteKnightProm1.getCurrentPositionXY());
		}
		if(WhiteKnightProm2.getActive()){
			WhiteAggregate.add(WhiteKnightProm2.getCurrentPositionXY());
		}
		if(WhiteKnightProm3.getActive()){
			WhiteAggregate.add(WhiteKnightProm3.getCurrentPositionXY());
		}
		if(WhiteKnightProm4.getActive()){
			WhiteAggregate.add(WhiteKnightProm4.getCurrentPositionXY());
		}
		if(WhiteKnightProm5.getActive()){
			WhiteAggregate.add(WhiteKnightProm5.getCurrentPositionXY());
		}
		if(WhiteKnightProm6.getActive()){
			WhiteAggregate.add(WhiteKnightProm6.getCurrentPositionXY());
		}
		if(WhiteKnightProm7.getActive()){
			WhiteAggregate.add(WhiteKnightProm7.getCurrentPositionXY());
		}
		if(WhiteKnightProm8.getActive()){
			WhiteAggregate.add(WhiteKnightProm8.getCurrentPositionXY());
		}
	
		
		return WhiteAggregate;
	}

}
