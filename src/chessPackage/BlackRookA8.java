package chessPackage;

public class BlackRookA8 extends Superclass_BlackRook {
	static int CurrentPositionX=0;
	static int CurrentPositionY=0;
	static int [] CurrentPositionXY = {0,0};
	private final static int  StartingPositionX = 0;
	private final static int StartingPositionY = 0;
	static boolean active = true;
	static boolean FirstStrike = true;
	
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
		String Title = "Black Rook (A8)";
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
	private final static int  StartingPositionX = 7;
	private final static int StartingPositionY = 0;
	static boolean active = true;
	static boolean FirstStrike = true;
	
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
		String Title = "Black Rook (H8)";
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
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "Black Rook (Prom1)";
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
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "Black Rook (Prom2)";
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
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "Black Rook (Prom3)";
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
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "Black Rook (Prom4)";
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
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "Black Rook (Prom5)";
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
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "Black Rook (Prom6)";
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
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "Black Rook (Prom7)";
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
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "Black Rook (Prom8)";
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