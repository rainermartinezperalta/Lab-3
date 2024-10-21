{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class ConcretePizzaFactory implements PizzaFactory \{\
    @Override\
    public Pizza createPizza(String type) \{\
        switch (type) \{\
            case "Cheese":\
                return new CheesePizza();\
            case "Greek":\
                return new GreekPizza();\
            case "Peperoni":\
                return new PeperoniPizza();\
            case "GlutenFree":\
                return new GlutenFreePizza();\
            default:\
                return null;\
        \}\
    \}\
\}\
}