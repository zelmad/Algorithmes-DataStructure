import java.util.*;
import java.io.*;
import java.lang.Math;

public class String_String
{
	public static void main(String[] args)
	{
		Scanner clv=new Scanner(System.in);
		String chain = clv.nextLine();
		String chaine = clv.nextLine();
		String chin = clv.nextLine();
		System.out.println(AffectLet(chain, chaine, chin));
	}
	static String AffectLet(String chain1, String chain2, String chain3)
	{
		String arr="";
		for(int i=0; i<chain3.length(); i++)
		{
			int a = function(chain1, Character.toLowerCase(chain3.charAt(i)));
			if(a != -1){
				boolean zzz= Character.isUpperCase(chain3.charAt(i));
				if(zzz){
					arr = arr + String.valueOf(Character.toUpperCase(chain2.charAt(a)));
				}
				else{
					arr = arr + String.valueOf(chain2.charAt(a));
				}
			}
			else{
				boolean zzz= Character.isUpperCase(chain3.charAt(i));
				if(zzz){
					arr = arr + String.valueOf(Character.toUpperCase(chain3.charAt(i)));
				}
				else{
					arr = arr + String.valueOf(chain3.charAt(i));
				}
			}
		}
		return arr;
	}
	static int function(String chain, char a)
	{
		int e = 0;
		for(int i=0;i<chain.length(); i++)
		{
			if(chain.charAt(i)==a)
			{
				e = i;
				break;
			}
			else{
				e = -1;
			}
		}
		return e;
	}
}