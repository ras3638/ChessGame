package chessPackage;

import java.util.ArrayList;

public class Piece {
	static int[][] aggregateBlacks(){
		
		int [][] BlackAggregate = new int [48][2];
		
		BlackAggregate[0]=BlackPawnA7.getCurrentPositionXY();
		BlackAggregate[1]=BlackPawnB7.getCurrentPositionXY();
		BlackAggregate[2]=BlackKingE8.getCurrentPositionXY();
		BlackAggregate[3]=BlackKnightB8.getCurrentPositionXY();
		BlackAggregate[4]=BlackPawnC7.getCurrentPositionXY();
		BlackAggregate[5]=BlackRookA8.getCurrentPositionXY();
		BlackAggregate[6]=BlackBishopC8.getCurrentPositionXY();
		BlackAggregate[7]=BlackQueenD8.getCurrentPositionXY();
		
		BlackAggregate[8]=BlackRookProm1.getCurrentPositionXY();
		BlackAggregate[9]=BlackRookProm2.getCurrentPositionXY();
		BlackAggregate[10]=BlackRookProm3.getCurrentPositionXY();
		BlackAggregate[11]=BlackRookProm4.getCurrentPositionXY();
		BlackAggregate[12]=BlackRookProm5.getCurrentPositionXY();
		BlackAggregate[13]=BlackRookProm6.getCurrentPositionXY();
		BlackAggregate[14]=BlackRookProm7.getCurrentPositionXY();
		BlackAggregate[15]=BlackRookProm8.getCurrentPositionXY();
		
		BlackAggregate[16]=BlackQueenProm1.getCurrentPositionXY();
		BlackAggregate[17]=BlackQueenProm2.getCurrentPositionXY();
		BlackAggregate[18]=BlackQueenProm3.getCurrentPositionXY();
		BlackAggregate[19]=BlackQueenProm4.getCurrentPositionXY();
		BlackAggregate[20]=BlackQueenProm5.getCurrentPositionXY();
		BlackAggregate[21]=BlackQueenProm6.getCurrentPositionXY();
		BlackAggregate[22]=BlackQueenProm7.getCurrentPositionXY();
		BlackAggregate[23]=BlackQueenProm8.getCurrentPositionXY();
		
		BlackAggregate[24]=BlackBishopProm1.getCurrentPositionXY();
		BlackAggregate[25]=BlackBishopProm2.getCurrentPositionXY();
		BlackAggregate[26]=BlackBishopProm3.getCurrentPositionXY();
		BlackAggregate[27]=BlackBishopProm4.getCurrentPositionXY();
		BlackAggregate[28]=BlackBishopProm5.getCurrentPositionXY();
		BlackAggregate[29]=BlackBishopProm6.getCurrentPositionXY();
		BlackAggregate[30]=BlackBishopProm7.getCurrentPositionXY();
		BlackAggregate[31]=BlackBishopProm8.getCurrentPositionXY();
		
		BlackAggregate[32]=BlackKnightProm1.getCurrentPositionXY();
		BlackAggregate[33]=BlackKnightProm2.getCurrentPositionXY();
		BlackAggregate[34]=BlackKnightProm3.getCurrentPositionXY();
		BlackAggregate[35]=BlackKnightProm4.getCurrentPositionXY();
		BlackAggregate[36]=BlackKnightProm5.getCurrentPositionXY();
		BlackAggregate[37]=BlackKnightProm6.getCurrentPositionXY();
		BlackAggregate[38]=BlackKnightProm7.getCurrentPositionXY();
		BlackAggregate[39]=BlackKnightProm8.getCurrentPositionXY();
		
		BlackAggregate[40]=BlackRookH8.getCurrentPositionXY();
		BlackAggregate[41]=BlackPawnD7.getCurrentPositionXY();
		BlackAggregate[42]=BlackBishopF8.getCurrentPositionXY();
		BlackAggregate[43]=BlackKnightG8.getCurrentPositionXY();
		BlackAggregate[44]=BlackPawnE7.getCurrentPositionXY();
		BlackAggregate[45]=BlackPawnF7.getCurrentPositionXY();
		BlackAggregate[46]=BlackPawnG7.getCurrentPositionXY();
		BlackAggregate[47]=BlackPawnH7.getCurrentPositionXY();
		
		return BlackAggregate;
	}
	static int[][] aggregateWhites(){
		
		int [][] WhiteAggregate = new int [48][2];
		
		WhiteAggregate[0]=WhitePawnB2.getCurrentPositionXY();
		WhiteAggregate[1]=WhitePawnA2.getCurrentPositionXY();
		WhiteAggregate[2]=WhiteKingE1.getCurrentPositionXY();
		WhiteAggregate[3]=WhiteKnightB1.getCurrentPositionXY();
		WhiteAggregate[4]=WhitePawnC2.getCurrentPositionXY();
		WhiteAggregate[5]=WhiteRookA1.getCurrentPositionXY();
		WhiteAggregate[6]=WhiteBishopC1.getCurrentPositionXY();
		WhiteAggregate[7]=WhiteQueenD1.getCurrentPositionXY();
	
		WhiteAggregate[8]=WhiteRookH1.getCurrentPositionXY();
		WhiteAggregate[9]=WhitePawnD2.getCurrentPositionXY();
		WhiteAggregate[10]=WhiteBishopF1.getCurrentPositionXY();
		WhiteAggregate[11]=WhiteKnightG1.getCurrentPositionXY();
		WhiteAggregate[12]=WhitePawnE2.getCurrentPositionXY();
		WhiteAggregate[13]=WhitePawnF2.getCurrentPositionXY();
		WhiteAggregate[14]=WhitePawnG2.getCurrentPositionXY();
		WhiteAggregate[15]=WhitePawnH2.getCurrentPositionXY();
		
		WhiteAggregate[16]=WhiteRookProm1.getCurrentPositionXY();
		WhiteAggregate[17]=WhiteRookProm2.getCurrentPositionXY();
		WhiteAggregate[18]=WhiteRookProm3.getCurrentPositionXY();
		WhiteAggregate[19]=WhiteRookProm4.getCurrentPositionXY();
		WhiteAggregate[20]=WhiteRookProm5.getCurrentPositionXY();
		WhiteAggregate[21]=WhiteRookProm6.getCurrentPositionXY();
		WhiteAggregate[22]=WhiteRookProm7.getCurrentPositionXY();
		WhiteAggregate[23]=WhiteRookProm8.getCurrentPositionXY();
		WhiteAggregate[24]=WhiteQueenProm1.getCurrentPositionXY();
		WhiteAggregate[25]=WhiteQueenProm2.getCurrentPositionXY();
		WhiteAggregate[26]=WhiteQueenProm3.getCurrentPositionXY();
		WhiteAggregate[27]=WhiteQueenProm4.getCurrentPositionXY();
		WhiteAggregate[28]=WhiteQueenProm5.getCurrentPositionXY();
		WhiteAggregate[29]=WhiteQueenProm6.getCurrentPositionXY();
		WhiteAggregate[30]=WhiteQueenProm7.getCurrentPositionXY();
		WhiteAggregate[31]=WhiteQueenProm8.getCurrentPositionXY();
		
		WhiteAggregate[32]=WhiteBishopProm1.getCurrentPositionXY();
		WhiteAggregate[33]=WhiteBishopProm2.getCurrentPositionXY();
		WhiteAggregate[34]=WhiteBishopProm3.getCurrentPositionXY();
		WhiteAggregate[35]=WhiteBishopProm4.getCurrentPositionXY();
		WhiteAggregate[36]=WhiteBishopProm5.getCurrentPositionXY();
		WhiteAggregate[37]=WhiteBishopProm6.getCurrentPositionXY();
		WhiteAggregate[38]=WhiteBishopProm7.getCurrentPositionXY();
		WhiteAggregate[39]=WhiteBishopProm8.getCurrentPositionXY();
		
		WhiteAggregate[39]=WhiteKnightProm1.getCurrentPositionXY();
		WhiteAggregate[40]=WhiteKnightProm2.getCurrentPositionXY();
		WhiteAggregate[41]=WhiteKnightProm3.getCurrentPositionXY();
		WhiteAggregate[42]=WhiteKnightProm4.getCurrentPositionXY();
		WhiteAggregate[43]=WhiteKnightProm5.getCurrentPositionXY();
		WhiteAggregate[44]=WhiteKnightProm6.getCurrentPositionXY();
		WhiteAggregate[45]=WhiteKnightProm7.getCurrentPositionXY();
		WhiteAggregate[46]=WhiteKnightProm8.getCurrentPositionXY();
		

		
		return WhiteAggregate;
	}
	public static int[][] arrayConverter(int[][] m) {
		//reduces the size of int [][] by removing nulls and out of reach board cells
		ArrayList<int []> EM = new ArrayList<int []>();
		
		for(int i = 0 ; i < m.length ; i++){
			if(m[i] != null){
				if(m[i][0] > -1 && m[i][0] < 8 && m[i][1] > -1 && m[i][1] < 8)
					EM.add(m[i]);
			}
		}
		
		int [][]MultiArray = EM.toArray(new int [][] {});
		
		return MultiArray;
	}
}
