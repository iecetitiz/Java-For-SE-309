package se309.lab3;

public interface Const {
    final int LETTER = 0;
    final int DIGIT = 1;
    final int UNKNOWN = 99;

    final int INT_LIT  = 10;
    final int IDENT = 11;
    final int ASSIGN_OP = 20;
    final int ADD_OP = 21;
    final int SUB_OP = 22;
    final int MULT_OP = 23;
    final int DIV_OP = 24;
    final int LEFT_PAREN = 25;
    final int RIGHT_PAREN = 26;
    static final int EOF = -1;
}