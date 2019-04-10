package imic.buoi10;

public class BaiSo2
{
    static int i=0;

    //int bienSo;

    public static int timUSCLN(int BienSo) {
        int USCLN=0;

        for (i = 1; i < BienSo; i++)
        {
            if (BienSo % i == 0)
            {
                USCLN = i;
            }
        }
        return USCLN;
    }
public  static int timUSCLN2Number(int a, int b)
{
    int uocso1=0;
    //int uocso2;
for (int i=1; i<a;i++)
{
    if (a % i == 0)
    {
        if (b % i == 0)
        {
            uocso1 = i;
        }

    }
}
return  uocso1;
}
}
