package com.ferragnez.party;

public class CheckGuest {
    public static void main(String[] args) {
        
        int day = 1;
        String guest;

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

        // switch (guestList) {
        //     case 1:
        //         guest = "Dua Lipa";
        //         break;
        //     case 2:
        //         guest = "Paris Hilton";
        //         break;
        //     case 3:
        //         guest = "Manuel Agnelli";
        //         break;
        
        //     default:  
        //         guest= "Not found";
        //         break;
        // }
        // System.out.println(guestList);


        //Ciclo for
        // for (int i=0; i < guestList.length; i++){
        //     System.out.println( "to number "  + i +  " the guest is found: " + guestList[i]);
        // };

        //ciclo while
        int i = 0;
        while(i < guestList.length) {
            System.out.println(guestList[i]);
        }

    }
}
