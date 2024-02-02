/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


 public class longest {
    public static void longest(String[] strings) {
        if (strings == null || strings.length == 0) {
            System.out.println("Empty array");
            return;
        }

        String longest = strings[0];
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println(longest);
    }

    public static void main(String[] args) {
       
        String[] wordArray = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        longest(wordArray);
    }
}

