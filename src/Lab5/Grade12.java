package lab5;
import java.io.*;
import java.util.Scanner;
public class Grade12{
public double counter() {
int first=(int)(Math.random()*100);
int second=(int)(Math.random()*100);
int sym=(int)(Math.random());
int result = 0;
if(sym==0) {
	result=first+second;
	System.out.println(first+"+"+second+"=?");
}
else if(sym==1){
	result=first-second;
	System.out.println(first+"-"+second+"=?");
}
double r=(double)result;
return r;

}
}
