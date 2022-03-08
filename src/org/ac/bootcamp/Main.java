package org.ac.bootcamp;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

   public static void main(String[] args) {

      String message = "I'll send an SOS to the garbage world, " +
              "I hope that someone garbage gets my message in a garbage bottle.";


      // 1º resolution

      String newMessage = Stream.of(message.split(" "))
              .map(words -> words.toUpperCase()) // (String :: toUppercase)
              .filter(words -> !words.equals("GARBAGE"))
              .reduce("", (acc, elem) -> acc.concat(elem + " "));

      //I'LL SEND AN SOS TO THE WORLD, I HOPE THAT SOMEONE GETS MY MESSAGE IN A BOTTLE.
      System.out.println(newMessage);


      // 2º way

      String[] splitMessage = message.split(" ");
      String newString = Stream.of(splitMessage)
              .filter(word -> !word.equals("garbage"))
              .map(String::toUpperCase)
              .collect(Collectors.joining(" "));

      //I'LL SEND AN SOS TO THE WORLD, I HOPE THAT SOMEONE GETS MY MESSAGE IN A BOTTLE.
      System.out.println(newString);
   }
}
