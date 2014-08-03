package chessPackage;

import java.util.ArrayList;

public class BlackKnightB8 extends Superclass_BlackKnight {
	static int CurrentPositionX=1;
	static int CurrentPositionY=0;
	static int [] CurrentPositionXY = {1,0};
	static final int  StartingPositionX = 1;
	static final int StartingPositionY = 0;
	static boolean active = true;
	static final String Title = "Black Knight (B8)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightG8 extends Superclass_BlackKnight {
	static int CurrentPositionX=6;
	static int CurrentPositionY=0;
	static int [] CurrentPositionXY = {6,0};
	static final int  StartingPositionX = 6;
	static final int StartingPositionY = 0;
	static boolean active = true;
	static final String Title = "Black Knight (G8)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightProm1 extends Superclass_BlackKnight {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Knight (Prom1)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightProm2 extends Superclass_BlackKnight {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Knight (Prom2)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightProm3 extends Superclass_BlackKnight {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Knight (Prom3)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightProm4 extends Superclass_BlackKnight {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Knight (Prom4)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightProm5 extends Superclass_BlackKnight {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Knight (Prom5)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightProm6 extends Superclass_BlackKnight {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Knight (Prom6)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightProm7 extends Superclass_BlackKnight {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Knight (Prom7)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class BlackKnightProm8 extends Superclass_BlackKnight {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Knight (Prom8)";
	
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
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}