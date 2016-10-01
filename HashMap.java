{\rtf1\ansi\ansicpg1252\cocoartf1404\cocoasubrtf470
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 //Complete this code or write your own from scratch\
import java.util.*;\
import java.io.*;\
\
class Solution\{\
    public static void main(String []argh)\{\
        Scanner in = new Scanner(System.in);\
        int n = in.nextInt();\
        HashMap<String,Integer> hm = new HashMap<String,Integer>();\
        \
        for(int i = 0; i < n; i++)\{\
            String name = in.next();\
            int phone = in.nextInt();\
            // Write code here\
            hm.put(name,phone);\
        \}\
        \
        while(in.hasNext())\{\
            String s = in.next();\
            // Write code here\
            if(hm.containsKey(s))\{\
              System.out.println(s+"="+hm.get(s));\
            \}else\{ System.out.println("Not found"); \}\
        \}\
        in.close();\
        \
    \}\
\}}