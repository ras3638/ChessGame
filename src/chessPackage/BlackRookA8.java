package chessPackage;

public class BlackRookA8 extends Superclass_BlackRook {
	static int CurrentPositionX=0;
	static int CurrentPositionY=0;
	static int [] CurrentPositionXY = {0,0};
	static final int  StartingPositionX = 0;
	static final int StartingPositionY = 0;
	static boolean active = true;
	static boolean FirstStrike = true;
	static final String Title = "Black Rook (A8)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setFirstStrike(boolean a){
		FirstStrike = a;
	}
	static boolean getFirstStrike(){
		return FirstStrike;
	}	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}

class BlackRookH8 extends Superclass_BlackRook {
	static int CurrentPositionX=7;
	static int CurrentPositionY=0;
	static int [] CurrentPositionXY = {7,0};
	static final int  StartingPositionX = 7;
	static final int StartingPositionY = 0;
	static boolean active = true;
	static boolean FirstStrike = true;
	static final String Title = "Black Rook (H8)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setFirstStrike(boolean a){
		FirstStrike = a;
	}
	static boolean getFirstStrike(){
		return FirstStrike;
	}	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackRookProm1 extends Superclass_BlackRook {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Rook (Prom1)";
	
	static void reset(){
		setActive(false);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackRookProm2 extends Superclass_BlackRook {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Rook (Prom2)";
	
	static void reset(){
		setActive(false);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackRookProm3 extends Superclass_BlackRook {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Rook (Prom3)";
	
	static void reset(){
		setActive(false);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackRookProm4 extends Superclass_BlackRook {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Rook (Prom4)";
	
	static void reset(){
		setActive(false);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackRookProm5 extends Superclass_BlackRook {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Rook (Prom5)";
	
	static void reset(){
		setActive(false);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackRookProm6 extends Superclass_BlackRook {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Rook (Prom6)";
	
	static void reset(){
		setActive(false);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackRookProm7 extends Superclass_BlackRook {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Rook (Prom7)";
	
	static void reset(){
		setActive(false);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackRookProm8 extends Superclass_BlackRook {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Rook (Prom8)";
	
	static void reset(){
		setActive(false);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){

		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){
		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}