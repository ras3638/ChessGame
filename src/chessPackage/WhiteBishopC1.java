package chessPackage;

public class WhiteBishopC1 extends Superclass_WhiteBishop {
	static int CurrentPositionX=2;
	static int CurrentPositionY=7;
	static int [] CurrentPositionXY = {2,7};
	private final static int  StartingPositionX = 2;
	private final static int StartingPositionY = 7;
	static boolean active = true;
	static void reset(){
		setActive(true);
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
		String Title = "White Bishop (C1)";
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
class WhiteBishopF1 extends Superclass_WhiteBishop {
	static int CurrentPositionX=5;
	static int CurrentPositionY=7;
	static int [] CurrentPositionXY = {5,7};
	private final static int  StartingPositionX = 5;
	private final static int StartingPositionY = 7;
	static boolean active = true;
	static void reset(){
		setActive(true);
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
		String Title = "White Bishop (F1)";
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
class WhiteBishopProm1 extends Superclass_WhiteBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
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
		String Title = "White Bishop (Prom1)";
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
class WhiteBishopProm2 extends Superclass_WhiteBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
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
		String Title = "White Bishop (Prom2)";
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
class WhiteBishopProm3 extends Superclass_WhiteBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
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
		String Title = "White Bishop (Prom3)";
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
class WhiteBishopProm4 extends Superclass_WhiteBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
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
		String Title = "White Bishop (Prom4)";
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
class WhiteBishopProm5 extends Superclass_WhiteBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
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
		String Title = "White Bishop (Prom5)";
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
class WhiteBishopProm6 extends Superclass_WhiteBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
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
		String Title = "White Bishop (Prom6)";
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
class WhiteBishopProm7 extends Superclass_WhiteBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
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
		String Title = "White Bishop (Prom7)";
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
class WhiteBishopProm8 extends Superclass_WhiteBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	private final static int  StartingPositionX = -10;
	private final static int StartingPositionY = -10;
	static boolean active = false;
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
		String Title = "White Bishop (Prom8)";
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