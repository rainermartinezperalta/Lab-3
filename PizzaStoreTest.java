{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import org.junit.Test;\
import static org.junit.Assert.*;\
\
public class PizzaStoreTest \{\
\
    @Test\
    public void testOrderCheesePizza() \{\
        PizzaFactory factory = new ConcretePizzaFactory();\
        PizzaStore store = new PizzaStore(factory);\
        Pizza pizza = store.orderPizza("Cheese");\
        assertNotNull(pizza);\
        assertTrue(pizza instanceof CheesePizza);\
    \}\
\
    @Test\
    public void testOrderPeperoniPizza() \{\
        PizzaFactory factory = new ConcretePizzaFactory();\
        PizzaStore store = new PizzaStore(factory);\
        Pizza pizza = store.orderPizza("Peperoni");\
        assertNotNull(pizza);\
        assertTrue(pizza instanceof PeperoniPizza);\
    \}\
\}\
}