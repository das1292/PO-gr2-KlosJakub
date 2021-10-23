package com.company;
import java.util.Random;
public class zadania3_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100-1)+1;
        int[] tab = new int[n];
        for(int i=0;i<=n - 1;i++)
        {
            tab[i] = r.nextInt(1000+999)-999;
            System.out.println(tab[i]);
        }
        int p=0;
        int np=0;
        for(int j=0;j<=n-1;j++)
        {
            if(tab[j]%2==0)
            {
                p++;
            }
            else if(tab[j]%2==1)
            {
                np++;
            }
        }
        System.out.println("liczby parzyste: "+p);
        System.out.println("liczby nieparzyste: "+np);
        int dod = 0;
        int uj = 0;
        int zer = 0;
        for(int k=0;k<=n-1;k++)
        {
            if(tab[k]<0)
            {
                uj++;
            }
            else if(tab[k]>0)
            {
                dod++;
            }
            else if(tab[k]==0)
            {
                zer++;
            }
        }
        System.out.println("liczby dodatnie: "+dod);
        System.out.println("liczby ujemne: "+uj);
        System.out.println("zera: "+zer);
        int najwiekszy=tab[0];
        int ilenaj=0;
        for(int x=0;x<n-1;x++)
        {
            if(najwiekszy<tab[x])
                najwiekszy = tab[x];
        }
        for(int z=0;z<n-1;z++)
        {
            if(najwiekszy == tab[z])
                ilenaj++;
        }
        System.out.println("najwiekszy element to: "+najwiekszy+'\n'+"wystepuje on: "+ilenaj+" razy");
        int sumauj=0;
        int sumadod=0;
        for(int y=0;y<n-1;y++)
        {
            if(tab[y]<0)
            {
                sumauj+=tab[y];
            }
            if(tab[y]>0)
            {
                sumadod+=tab[y];
            }
        }
        System.out.println("suma liczb ujemnych: "+sumauj);
        System.out.println("suma liczb dodatnich: "+sumadod);
        int lendod=0;
        int maxlen=1;
        for(int l=0;l<n-1;l++)
        {
            if(tab[l]>0 && tab[l+1]>0)
            {
                lendod++;
                if(lendod>maxlen)
                {
                    maxlen=lendod;
                }

            }
        }
        System.out.println(maxlen);
        for(int w=0;w<n-1;w++)
        {
            if(tab[w]>0)
            {
                tab[w]=1;
            }
            else if(tab[w]<0)
            {
                tab[w]=0;
            }
        }
        for(int b=0;b<n-1;b++)
        {
            System.out.println(tab[b]);
        }
    }
}
