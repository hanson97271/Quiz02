package test;
interface iShape03{
	public void show();
	public int srea();
}
interface iColor{
	public void showColor();
}
class CWin {
	protected int width;
	protected int height;
	protected String color;
	public CWin(int w,int h,String str) {
		width=w;
		height=h;
		color=str;
	}
	public void show() {
		System.out.println("color="+color);
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("area="+width*height);
	}
	public void area() {
		System.out.println("area="+width*height);
	}
	public void showColor() {
		System.out.print("color="+color);
	}
}

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin win=new CWin(5,7,"Green");
		win.show();
	}

}
