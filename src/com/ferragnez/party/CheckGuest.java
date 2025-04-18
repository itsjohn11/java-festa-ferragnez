package com.ferragnez.party;

public class CheckGuest {
    public static void main(String[] args) {
        
        String[] guestList = {
            "Dua Lipa",
            "Paris Hilton" , 
            "Manuel Agnelli",
            "J-Ax",
            "Francesco Totti", 
            "Ilary Blasi", 
            "Bebe Vio", 
            "Luis", 
            "Pardis Zarei" , 
            "Martina Maccherone", 
            "Rachel Zeilic"
        };
        
        //Ciclo for
        for (int i=0; i < guestList.length; i++){
            System.out.println( "to number "  + i +  "the guest is found: " + guestList[i]);
        };

    }
}
