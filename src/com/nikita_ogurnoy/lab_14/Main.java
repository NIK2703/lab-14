package com.nikita_ogurnoy.lab_14;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        final String ABC = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        final String text = "ЗТЕФТИ ЧЦФТ!\n" +
                "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.";

        CesarsDecode cd = new CesarsDecode(ABC);

        String[]  strText =  text.split("\n");
        int[] shiftValStr =  { -4, +8, +15};

        for (int i=0; i<shiftValStr.length; i++) {
            System.out.println(cd.decode(strText[i], shiftValStr[i]));
        }

        String[] words = strText[3].split(" ");
        int[] shiftValWord =  { +3, -5, +10, +2, -1, -4, +1, +7, -2, -3};

        for (int i=0; i<shiftValWord.length; i++) {
            System.out.print(cd.decode(words[i], shiftValWord[i])+" ");
        }
        System.out.println();



        /*
        System.out.println("Варанты декодирования 3-й строки:");
        HashMap<Integer,String> decodeVariantStr = cd.allDecode(strText[2]);
        for(Map.Entry<Integer, String> variant: decodeVariantStr.entrySet())
        {
            System.out.println(variant.getKey() + " : " + variant.getValue());
        }
        */

        /*
        System.out.println("Варанты декодирования слов 4-й строки:");
        for(int i=0; i<words.length; i++) {
            HashMap<Integer, String> decodeVariantWord = cd.allDecode(words[i]);
            System.out.println("\n----------" + words[i] + "----------");
            for (Map.Entry<Integer, String> variant : decodeVariantWord.entrySet()) {
                System.out.println(variant.getKey() + " : " + variant.getValue());
            }
        }
        */
    }
}
