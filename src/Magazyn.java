
public class Magazyn {
	
float  poj;
float tow;

Magazyn(float poj, float tow)
{this.poj=poj;
if (tow<poj)
{this.tow=tow;}
else {System.out.println("Caly towar nie zmiescil sie, wprowadzono maksymalna ilosc dla pojemnosci");}	
}

void addTow(float a)
{if ((tow+a)<=(poj))
		{tow+=a;}
else {System.out.println("Tyle towaru sie nie zmiesci podaj wartosc mniejsza lub rowna od  "+ (poj-tow));}
}
	
void getTow(float a)
{if(a>tow)
{System.out.println("Nie ma wystarczajaczej ilosci towaru, na sklep zostalo wystawione  towaru" + tow);
tow=0;
}
else {tow-=a;}

}

void showStat()
{System.out.println("Stan magazynu to "+tow+"/"+poj );}
	
}
