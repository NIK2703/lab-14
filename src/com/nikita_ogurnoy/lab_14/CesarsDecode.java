package com.nikita_ogurnoy.lab_14;

import java.util.HashMap;

public class CesarsDecode {
    String ABC;
    int ABClen;

    CesarsDecode(String ABC)
    {
        this.ABC = ABC;
        ABClen = ABC.length();
    }

    String decode(String str, int shift)
    {
        char[] strc = str.toCharArray();
        String dstr = "";
        for(char c: strc)
        {
            char buffer = c;
            int ABCpos = ABC.indexOf(c);
            if(ABCpos >= 0)
            {
                if(ABCpos + shift < 0)
                {
                    buffer = ABC.charAt(ABCpos + shift + ABClen);
                }
                else if (ABCpos + shift >= ABClen)
                {
                    buffer = ABC.charAt(ABCpos + shift - ABClen);
                }
                else
                {
                    buffer = ABC.charAt(ABCpos + shift);
                }

            }
            dstr += buffer;
        }
        return dstr;
    }

    HashMap<Integer,String> allDecode(String str)
    {
        HashMap<Integer,String> decodeVariant = new HashMap<Integer,String>();
        for(int i=0; i<ABClen; i++)
        {
            decodeVariant.put(i, decode(str,i));
        }
        return decodeVariant;
    }
}
