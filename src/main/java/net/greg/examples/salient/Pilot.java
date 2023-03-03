package net.greg.examples.salient;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
  https://bit.ly/3tB1xjl | POM MODS-11
 */
public class Pilot {

  public static void main(String ... args) {

    System.err.println(
      GRN + "\n\nPilot " + args[0] + "\n\n" + NC);

    Map<String,String> anyone = new ConcurrentHashMap();
  ///  var anytwo = new ConcurrentHashMap<String,String>();


    anyone.put("one","1");
///    anytwo.put("one","1");

    anyone.put("two","2");
///    anytwo.put("two","2");

    anyone.put("three","3");
///    anytwo.put("three","3");

    System.err.println(
      GRN + "\n\n anyone " + NC + anyone +
      /// GRN + "\n anytwo "  + NC + anytwo +
      "\n\n\t ...  ...  ...\n\n");
  }


  public static final String RED = "\033[1;91m";
  public static final String GRN = "\033[1;92m";
  public static final String YLW = "\033[1;93m";
  public static final String NC = "\u001B[0m";
}
