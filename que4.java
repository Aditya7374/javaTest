/*
Q4:Write a Java Program to find the duplicate characters in a string.

*/


public class DuplStr {
 public static void main(String argu[]) {

  String str = "Aditya";
  int cnt = 0;
  char[] inp = str.toCharArray();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (inp[i] == inp[j]) {
     System.out.println(inp[j]);
     cnt++;
     break;
    }
   }
  }
 }
}