package tictactoe;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Tictactoe {
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	
	public void playerfilling(int num,char fill)
	{
		if(num<4)
		{
			this.arr[(num-num)][(num-1)]=fill;
		}
		else if(num<7)
		{
			this.arr[(num-(num-1))][(num-4)]=fill;
		}
		else {
			this.arr[(num-(num-2))][(num-7)]=fill;
		}
	}
	public void check(String temp)
	{
		if(temp.equals("XXX"))
	     {
	    	 out.print("\nPlayer-1 Winner!!!!!");
	    	 System.exit(0);
	     }
	     if(temp.equals("OOO"))
	     {
	    	 out.print("\nPlayer-2 Winner!!!!!");
	    	 System.exit(0);
	     }
	}
	public void winnercheck()
	{
		StringBuilder temp=new StringBuilder();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				temp.append(this.arr[i][j]);
			}
			check(temp.toString());
			temp.delete(0,temp.length());
			for(int j=0;j<3;j++)
			{
				temp.append(this.arr[j][i]);
			}
			check(temp.toString());
			temp.delete(0,temp.length());
		}
		temp.delete(0,temp.length());
		for(int i=0;i<3;i++)
		{
			temp.append(this.arr[i][i]);
		}
		check(temp.toString());
		temp.delete(0,temp.length());
		for(int i=0,j=2;i<3;i++,j--)
		{
			temp.append(this.arr[i][j]);
		}
		check(temp.toString());
		temp.delete(0,temp.length());
	}
	public void  displayboard()
	{
		out.print("|---|---|---|\n");
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				out.print("| "+arr[i][j]+" ");
			}
			out.print("|");
			out.print("\n|---|---|---|\n");
		}
	}
    char[][] arr= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		Tictactoe a1=new Tictactoe();
		out.print("First player-X and second player player-O");
		int num;
		for(int i=1;i<=8;i++)
		{
			if(i%2==0)
			{
				out.println("\nPlayer-2 Enter the position you want to fill:");
				num=p.nextInt();
				a1.playerfilling(num,'O');
				a1.displayboard();
			}
			else {
				out.println("\nPlayer-1 Enter the position you want to fill:");
				num=p.nextInt();
				a1.playerfilling(num,'X');
		        a1.displayboard();
			}
			if(i>4)
			{
				a1.winnercheck();
			}
		}
        out.print("\nMatch draw");
	}

}
