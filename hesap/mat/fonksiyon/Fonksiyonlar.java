//salihzekicamurcu
package hesap.mat.fonksiyon;
import hesap.mat.islem.*;
 public  class Fonksiyonlar extends Islemler
{
	protected static int fonk1i(int x,int y)
	{
		 int x1=carp(x,x);
		 int y1=carp(y,y);
		 int sonuc=Islemler.topla(x1,y1);
		return sonuc;
	}
	protected static  int fonk2i(int x,int y,int z)
	{
		 int x1=carp(3,x);
		 int x2=carp(x1,y);
		
		 int y1=carp(-5,z);
		 int y2=carp(y1,x);
		 int y3=carp(y2,y);
		
		 int sonuc=Islemler.topla(x2,y3);
		return sonuc;
	}
}
	