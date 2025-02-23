package minesweeper;
import java.io.*;
import java.util.*;

public class minesweeper
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        char [][] a=new char[9][9];
        char [][] b=new char[9][9];
        int i,j,r,c,mine=0,k;
        int count=48;                        // 48 is the ASCII value of ZERO 

        while (mine!=10)
        {
            r=(int)(Math.random()*10);       //type casting does not round off. 
            c=(int)(Math.random()*10);
            if ( r!=9 && c!=9)
            {
                if (a[r][c]==0)
                {
                    a[r][c]='*';
                    mine++;
                }
            }
        }

        for (i=0;i<9;i++)
        {
            for (j=0;j<9;j++)
            {
                if (a[i][j]=='*')
                System.out.print(a[i][j]+" ");
                else
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();

        for (i=0;i<9;i++)
        {
            for (j=0;j<9;j++)
            {   
                count=48;
                if (i==0 && j==0)               //checking for top right corner
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[0][1]=='*')             //checking conditions of neighbouring 3 grids
                    {count++;}
                    if(a[1][0]=='*')
                    {count++;}
                    if(a[1][1]=='*')
                    {count++;}
                    if(count==48)                //if no increament or no mine found, the position is a blank spot
                    {a[i][j]='#';}
                    if (count!=48)               //updating the number
                    {a[i][j]=(char)count;}
                }
                else if(i==0 && j==8)
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[0][7]=='*')
                    {count++;}
                    if(a[1][8]=='*')
                    {count++;}
                    if(a[1][7]=='*')
                    {count++;}
                    if(count==48)
                    {a[i][j]='#';}
                    if (count!=48)
                    {a[i][j]=(char)count;}
                }
                else if(i==8 && j==0)
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[8][1]=='*')
                    {count++;}
                    if(a[7][0]=='*')
                    {count++;}
                    if(a[7][1]=='*')
                    {count++;}
                    if(count==48)
                    {a[i][j]='#';}
                    if (count!=48)
                    {a[i][j]=(char)count;}
                }
                else if(i==8 && j==8)
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[7][8]=='*')
                    {count++;}
                    if(a[7][7]=='*')
                    {count++;}
                    if(a[8][7]=='*')
                    {count++;}
                    if(count==48)
                    {a[i][j]='#';}
                    if (count!=48)
                    {a[i][j]=(char)count;}
                }
                else if(i==0)
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[i][j-1]=='*')                 //we have to check 5 conditions
                    {count++;}
                    if(a[i][j+1]=='*')
                    {count++;}
                    if(a[i+1][j-1]=='*')
                    {count++;}
                    if(a[i+1][j]=='*')
                    {count++;}
                    if(a[i+1][j+1]=='*')
                    {count++;}
                    if(count==48)
                    {a[i][j]='#';}
                    if (count!=48)
                    {a[i][j]=(char)count;}
                }
                else if(i==8)
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[i][j-1]=='*')
                    {count++;}
                    if(a[i][j+1]=='*')
                    {count++;}
                    if(a[i-1][j-1]=='*')
                    {count++;}
                    if(a[i-1][j]=='*')
                    {count++;}
                    if(a[i-1][j+1]=='*')
                    {count++;}
                    if(count==48)
                    {a[i][j]='#';}
                    if (count!=48)
                    {a[i][j]=(char)count;}
                }
                else if(j==0)
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[i-1][j]=='*')
                    {count++;}
                    if(a[i+1][j]=='*')
                    {count++;}
                    if(a[i+1][j+1]=='*')
                    {count++;}
                    if(a[i][j+1]=='*')
                    {count++;}
                    if(a[i-1][j+1]=='*')
                    {count++;}
                    if(count==48)
                    {a[i][j]='#';}
                    if (count!=48)
                    {a[i][j]=(char)count;}
                }
                else if(j==8)
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[i-1][j]=='*')
                    {count++;}
                    if(a[i+1][j]=='*')
                    {count++;}
                    if(a[i-1][j-1]=='*')
                    {count++;}
                    if(a[i][j-1]=='*')
                    {count++;}
                    if(a[i+1][j-1]=='*')
                    {count++;}
                    if(count==48)
                    {a[i][j]='#';}
                    if (count!=48)
                    {a[i][j]=(char)count;}
                }
                else
                {
                    if(a[i][j]=='*')
                    {continue;}
                    if(a[i-1][j-1]=='*')            //we have to check 8 conditions
                    {count++;}
                    if(a[i-1][j]=='*')
                    {count++;}
                    if(a[i-1][j+1]=='*')
                    {count++;}
                    if(a[i][j+1]=='*')
                    {count++;}
                    if(a[i+1][j+1]=='*')
                    {count++;}
                    if(a[i+1][j]=='*')
                    {count++;}
                    if(a[i+1][j-1]=='*')
                    {count++;}
                    if(a[i][j-1]=='*')
                    {count++;}
                    if(count==48)
                    {a[i][j]='#';}
                    if (count!=48)
                    {a[i][j]=(char)count;}
                }
                
            }
        }

        for (i=0;i<9;i++)
        {
            for (j=0;j<9;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("   0 1 2 3 4 5 6 7 8");


        for (i=0;i<9;i++)
        {
            System.out.print(i+": ");
            for (j=0;j<9;j++)
            {
                b[i][j]='#';
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Lets start the game!");
        System.out.println("*:Mine \n~:Empty space \n^:Flag \no:To open a space");
        char ch;

        for(k=1;k<=81;k++)
        {
            System.out.println("Enter the row number");
            r=sc.nextInt();
            System.out.println("Enter the column number");
            c=sc.nextInt();
            while (b[r][c]!='#')
            {
                System.out.println("Block already opened!");
                System.out.println("Enter the row number again");
                r=sc.nextInt();
                System.out.println("Enter the column number again");
                c=sc.nextInt();   
            }

            System.out.println("Enter ^ for flag and o for opening a space");
            ch=(sc.next()).charAt(0);

            while (ch!='^' && ch!='o')
            {
                System.out.println("Invalid Input \nEnter ^ or o");
                ch=(sc.next()).charAt(0);
            }
            if (ch=='o')
            {
                if (a[r][c]=='*')
                {break;}
                else if(a[r][c]=='#')
                {b[r][c]='~';}
                else 
                {b[r][c]=a[r][c];}
            }
            else 
            {
                b[r][c]='^';
            }
            System.out.println("   0 1 2 3 4 5 6 7 8");
            for (i=0;i<9;i++)
            {
                System.out.print(i+": ");
                for (j=0;j<9;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        if (k<=81)
        {
            System.out.println("\nOh no!! \nGame over!!");
        }
        
        if (k==82)
        {
            System.out.println("\nCongratulations!! \nYou won!!");
        }
        sc.close();
    }
}