package chessPackage;

import java.util.ArrayList;

public class BlackBishopC8 extends Superclass_BlackBishop {
	static int CurrentPositionX=2;
	static int CurrentPositionY=0;
	static int [] CurrentPositionXY = {2,0};
	static final int  StartingPositionX = 2;
	static final int StartingPositionY = 0;
	static boolean active = true;
	static final String Title = "Black Bishop (C8)";
	
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
class BlackBishopF8 extends Superclass_BlackBishop {
	static int CurrentPositionX=5;
	static int CurrentPositionY=0;
	static int [] CurrentPositionXY = {5,0};
	static final int  StartingPositionX = 5;
	static final int StartingPositionY = 0;
	static boolean active = true;
	static final String Title = "Black Bishop (F8)";
	
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
class BlackBishopProm1 extends Superclass_BlackBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Bishop (Prom1)";
	
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
class BlackBishopProm2 extends Superclass_BlackBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Bishop (Prom2)";
	
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
class BlackBishopProm3 extends Superclass_BlackBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Bishop (Prom3)";
	
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
class BlackBishopProm4 extends Superclass_BlackBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Bishop (Prom4)";
	
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
class BlackBishopProm5 extends Superclass_BlackBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Bishop (Prom5)";
	
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
class BlackBishopProm6 extends Superclass_BlackBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Bishop (Prom6)";
	
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
class BlackBishopProm7 extends Superclass_BlackBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Bishop (Prom7)";
	
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
class BlackBishopProm8 extends Superclass_BlackBishop {
	static int CurrentPositionX=-10;
	static int CurrentPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static final int  StartingPositionX = -10;
	static final int StartingPositionY = -10;
	static boolean active = false;
	static final String Title = "Black Bishop (Prom8)";
	
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
