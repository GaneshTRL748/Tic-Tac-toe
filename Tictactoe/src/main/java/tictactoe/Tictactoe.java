package tictactoe;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Tictactoe {
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	Scanner p=new Scanner(System.in);
	public void player1filling()
	{
		out.println("\nPlayer-1 Enter the position you want to fill:");
		int temp=p.nextInt();
		switch(temp)
		{
					case 1:
					{
						if(this.arr[0][0]==' ')
						{
							this.arr[0][0]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					case 2:
					{

						if(this.arr[0][1]==' ')
						{
							this.arr[0][1]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					case 3:
					{
						if(this.arr[0][2]==' ')
						{
							this.arr[0][2]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					case 4:
					{
						if(this.arr[1][0]==' ')
						{
							this.arr[1][0]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					case 5:
					{
						if(this.arr[1][1]==' ')
						{
							this.arr[1][1]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					case 6:
					{
						if(this.arr[1][2]==' ')
						{
							this.arr[1][2]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					case 7:
					{

						if(this.arr[2][0]==' ')
						{
							this.arr[2][0]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					case 8:
					{
						if(this.arr[2][1]==' ')
						{
							this.arr[2][1]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					case 9:
					{
						if(this.arr[2][2]==' ')
						{
							this.arr[2][2]='X';
						}
						else {
							  display(1);
						}
						break;
					}
					default:
					{
						out.print("Invalid Choice!!!!");
						break;
					}
		}
		
	}
	public void player2filling()
	{
		out.println("\nPlayer-2 Enter the position you want to fill:");
		int temp=p.nextInt();
		switch(temp)
		{
					case 1:
					{
						if(this.arr[0][0]==' ')
						{
							this.arr[0][0]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					case 2:
					{

						if(this.arr[0][1]==' ')
						{
							this.arr[0][1]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					case 3:
					{
						if(this.arr[0][2]==' ')
						{
							this.arr[0][2]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					case 4:
					{
						if(this.arr[1][0]==' ')
						{
							this.arr[1][0]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					case 5:
					{
						if(this.arr[1][1]==' ')
						{
							this.arr[1][1]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					case 6:
					{
						if(this.arr[1][2]==' ')
						{
							this.arr[1][2]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					case 7:
					{

						if(this.arr[2][0]==' ')
						{
							this.arr[2][0]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					case 8:
					{
						if(this.arr[2][1]==' ')
						{
							this.arr[2][1]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					case 9:
					{
						if(this.arr[2][2]==' ')
						{
							this.arr[2][2]='O';
						}
						else {
							  display(2);
						}
						break;
					}
					default:
					{
						out.print("Invalid Choice!!!!");
						break;
					}
		}
	}
	public void winnercheck()
	{
		String temp=null;
		for(int i=0;i<8;i++)
		{
			switch(i)
			{
							case 0:
							{
								temp=Character.toString(this.arr[0][0])+Character.toString(this.arr[0][1])+Character.toString(this.arr[0][2]);
								break;
							}
							case 1:
							{
								temp=Character.toString(this.arr[1][0])+Character.toString(this.arr[1][1])+Character.toString(this.arr[1][2]);
								break;
							}
							case 2:
							{
								temp=Character.toString(this.arr[2][0])+Character.toString(this.arr[2][1])+Character.toString(this.arr[2][2]);
								break;
							}
							case 3:
							{
								temp=Character.toString(this.arr[0][0])+Character.toString(this.arr[1][0])+Character.toString(this.arr[2][0]);
								break;
							}
							case 4:
							{
								temp=Character.toString(this.arr[0][1])+Character.toString(this.arr[1][1])+Character.toString(this.arr[2][1]);
								break;
							}
							case 5:
							{
								temp=Character.toString(this.arr[0][2])+Character.toString(this.arr[1][2])+Character.toString(this.arr[2][2]);
								break;
							}
							case 6:
							{
								temp=Character.toString(this.arr[0][0])+Character.toString(this.arr[1][1])+Character.toString(this.arr[2][2]);
								break;
							}
							case 7:
							{
								temp=Character.toString(this.arr[0][2])+Character.toString(this.arr[1][1])+Character.toString(this.arr[2][0]);
								break;
							}
							default:
							{
								break;
							}
			}
			if(temp.equals("XXX"))
			{
				out.println("\nPlayer-1 Winner\n");
				displayboard();
				System.exit(0);
			}
			else if(temp.equals("OOO"))
			{
				out.print("\nPlayer-2 Winner\n");
				displayboard();
				System.exit(0);
			}
			else {
				continue;
			}
		}
		
	}
	public void  displayboard()
	{
		out.print("|---|---|---|\n");
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				//System.out.print("|");
				out.print("| "+arr[i][j]+" ");
			}
			out.print("|");
			out.print("\n|---|---|---|\n");
		}
	}
	public void display(int choice)
	{
		if(choice==1)
		{
			out.println("OOPS this position Already Filled!!!!!!!");
		    player1filling();
		}
		else {
			out.println("OOPS this position Already Filled!!!!!!!");
		    player2filling();
		}
		
	}
    char[][] arr= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	public static void main(String[] args) {
		Tictactoe a1=new Tictactoe();
		out.print("First player-X and second player player-O");
		a1.player1filling();
		a1.displayboard();
        a1.player2filling();
        a1.displayboard();
        a1.player1filling();
        a1.displayboard();
        a1.player2filling();
        a1.displayboard();
        a1.player1filling();
        a1.displayboard();
        a1.winnercheck();
        a1.player2filling();
        a1.displayboard();
        a1.winnercheck();
        a1.player1filling();
        a1.displayboard();
        a1.winnercheck();
        a1.player2filling();
        a1.displayboard();
        a1.winnercheck();
        a1.player1filling();
        a1.displayboard();
        a1.winnercheck();
        out.print("\nMatch draw");
	}

}
