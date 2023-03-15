package com.craftinginterpreters.lox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Lox {
  public static void main(String[] args) throws IOException {
    // if (args.length > 1) {
    //   System.out.println("Usage: jlox [script]");
    //   System.exit(64); 
    // } else if (args.length == 1) {
    //   runFile(args[0]);
    // } else {
    //   runPrompt();
    // }
  }

  private static void runFile (String path) throws IOException {
  byte[] bytes = Files.readAllBytes(Paths.get(path) );
  run (new String(bytes, Charset.defaultCharset()));
}
private static void runPrompt () throws IOException {
  InputStreamReader input= new InputStreamReader (System.in);
  BufferedReader reader = new BufferedReader(input);

  for (;;) {
    System.out.print("> ");
    String line = reader.readLine();
    if (line == null) break;
    run(line);
  }
}
private static void run(String source) {
  Scanner scanner = new Scanner(source);
  List<Token> tokens = scanner.scanTokens();

  // For now, just print tokens.
  for (Token token : tokens) {
    System.out.println(token);
  }
}
static void error(int line, String message) {
  report(line, "", message);
}

private static void report(int line, String where,
 String message) {

  System.err.println(
  "[line] " + line + "] Error" + where + ":" +
  message);
       hadError = true;
 }

 public class Lox {
  static boolean hadError = false;

run(new String(bytes, Charset.defaultCharset()));

//Indicate an error in the exit code.
 if (hadError) System.exit(65);
 }
 run(line);
 hadError = false;
}
var language = "lox";

package com.craftinginterpreters.lox;

enum TokenType {
  // Single-character tokens.
  LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, 
  COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

  // One or two character tokens.
  BANG, BANG_EQUAL,
  EQUAL, EQUAL_EQUAL,
  GREATER, GREATER_EQUAL,
  LESS, LESS_EQUAL,

  // Literals.
  IDENTFIER, STRING, NUMBER,

  // Keywords.
  AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR, 
  PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,
  EOF
}


                        




  