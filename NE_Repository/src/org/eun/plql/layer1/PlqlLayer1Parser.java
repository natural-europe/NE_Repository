/* The following code was generated by JFlex 1.4.1 on 4/6/10 5:26 PM */

/*
Copyright (C) 2006  David Massart and Chea Sereyvath, European Schoolnet

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/

package org.eun.plql.layer1;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 4/6/10 5:26 PM from the specification file
 * <tt>/Sandbox/eclipse/hmdb/plql2lucene/plql_layer1/src/conf/Layer1.flex</tt>
 */
class PlqlLayer1Parser {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING2 = 1;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\36\1\1\2\0\1\2\22\0\1\36\1\0\1\5\5\0"+
    "\1\11\1\12\4\0\1\14\1\4\12\13\1\0\1\3\1\4\1\15"+
    "\1\4\2\0\1\6\2\0\1\10\11\0\1\7\15\0\1\35\4\0"+
    "\1\33\1\0\1\17\1\16\1\24\1\0\1\25\1\0\1\26\2\0"+
    "\1\20\1\22\1\34\1\21\1\23\1\0\1\30\1\0\1\32\1\31"+
    "\2\0\1\27\uff87\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\10\1\11\7\1\1\12\1\13\1\14\1\13"+
    "\1\1\1\0\1\15\1\16\10\1\1\17\1\20\50\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\37\0\76\0\76\0\135\0\76\0\174\0\233"+
    "\0\174\0\174\0\272\0\331\0\174\0\370\0\u0117\0\u0136"+
    "\0\u0155\0\u0174\0\u0193\0\u01b2\0\174\0\174\0\174\0\u01d1"+
    "\0\u01f0\0\331\0\331\0\76\0\u020f\0\u022e\0\u024d\0\u026c"+
    "\0\u028b\0\u02aa\0\u02c9\0\u02e8\0\174\0\76\0\u0307\0\u0326"+
    "\0\u0345\0\u0364\0\u0383\0\u03a2\0\u03c1\0\u03e0\0\u03ff\0\u041e"+
    "\0\u043d\0\u045c\0\u047b\0\u049a\0\u04b9\0\u04d8\0\u04f7\0\u0516"+
    "\0\u0535\0\u0554\0\u0573\0\u0592\0\u05b1\0\u05d0\0\u05ef\0\u060e"+
    "\0\u062d\0\u064c\0\u066b\0\u068a\0\u06a9\0\u06c8\0\u06e7\0\u0706"+
    "\0\u0725\0\u0744\0\u0763\0\u0782\0\u07a1\0\u07c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\0\1\7\1\10\2\3"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\3\1\21\1\22\1\3\1\23\1\24\4\3\1\10"+
    "\1\3\1\0\1\25\5\26\1\27\27\26\1\30\1\26"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\17\3\2\0"+
    "\1\3\1\4\2\3\2\0\3\3\2\0\1\3\2\0"+
    "\17\3\41\0\4\3\2\0\1\3\1\31\1\3\2\0"+
    "\1\3\2\0\16\3\1\31\2\0\4\3\2\0\3\3"+
    "\2\0\1\13\1\32\1\0\17\3\15\0\1\33\23\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\1\3\1\34"+
    "\15\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\3\3\1\35\13\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\3\3\1\36\2\3\1\37\10\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\5\3\1\40"+
    "\1\41\10\3\2\0\4\3\2\0\3\3\2\0\1\3"+
    "\2\0\12\3\1\42\4\3\2\0\4\3\2\0\3\3"+
    "\2\0\1\3\2\0\12\3\1\43\4\3\2\0\4\3"+
    "\2\0\3\3\2\0\1\3\2\0\2\3\1\44\14\3"+
    "\7\0\1\45\31\0\4\3\2\0\2\3\1\46\2\0"+
    "\1\3\2\0\1\46\16\3\2\0\4\3\2\0\3\3"+
    "\2\0\1\3\2\0\16\3\1\47\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\4\3\1\34\12\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\15\3\1\50"+
    "\1\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\6\3\1\51\10\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\14\3\1\52\2\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\3\3\1\53\13\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\3\3\1\54"+
    "\13\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\3\3\1\55\13\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\14\3\1\56\2\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\12\3\1\57\4\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\7\3\1\34"+
    "\7\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\15\3\1\60\1\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\14\3\1\61\2\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\13\3\1\62\3\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\11\3\1\34"+
    "\5\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\6\3\1\63\10\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\16\3\1\64\2\0\4\3\2\0\3\3"+
    "\2\0\1\3\2\0\1\65\16\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\3\3\1\66\13\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\5\3\1\34"+
    "\11\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\16\3\1\67\2\0\4\3\2\0\3\3\2\0\1\3"+
    "\2\0\10\3\1\70\6\3\2\0\4\3\2\0\3\3"+
    "\2\0\1\3\2\0\15\3\1\71\1\3\2\0\4\3"+
    "\2\0\3\3\2\0\1\3\2\0\1\3\1\72\15\3"+
    "\2\0\4\3\2\0\3\3\2\0\1\3\2\0\14\3"+
    "\1\73\2\3\2\0\4\3\2\0\3\3\2\0\1\3"+
    "\2\0\16\3\1\74\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\14\3\1\75\2\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\3\3\1\76\13\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\1\3\1\77"+
    "\15\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\7\3\1\100\7\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\15\3\1\73\1\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\2\3\1\34\14\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\3\3\1\101"+
    "\13\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\3\3\1\102\13\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\2\3\1\103\14\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\13\3\1\104\3\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\2\3\1\105"+
    "\14\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\14\3\1\106\2\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\6\3\1\107\10\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\1\3\1\110\15\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\1\3\1\111"+
    "\15\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\3\3\1\112\13\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\14\3\1\113\2\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\4\3\1\114\12\3\2\0"+
    "\4\3\2\0\3\3\2\0\1\3\2\0\10\3\1\115"+
    "\6\3\2\0\4\3\2\0\3\3\2\0\1\3\2\0"+
    "\6\3\1\34\10\3\2\0\4\3\2\0\3\3\2\0"+
    "\1\3\2\0\3\3\1\116\13\3\2\0\4\3\2\0"+
    "\3\3\2\0\1\3\2\0\16\3\1\34\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2015];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\4\1\1\11\1\1\2\11\2\1\1\11\7\1"+
    "\3\11\2\1\1\0\12\1\1\11\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private PlqlLayer1Analyzer yyparser;
  
  private String temp;

  public PlqlLayer1Parser(java.io.Reader r, PlqlLayer1Analyzer yyparser) {
    this(r);
    this.yyparser = yyparser;
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  PlqlLayer1Parser(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  PlqlLayer1Parser(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 106) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 6: 
          { yyparser.yylval = new PlqlLayer1AnalyzerVal((String)yytext());
					return PlqlLayer1Analyzer.RIGHT_PARENTHESIS;
          }
        case 17: break;
        case 3: 
          { yyparser.yylval = new PlqlLayer1AnalyzerVal((String)yytext());
					return PlqlLayer1Analyzer.SEMICOLON;
          }
        case 18: break;
        case 13: 
          { String tempNumber = yytext().trim();					
						yyparser.yylval = new PlqlLayer1AnalyzerVal(Double.parseDouble(tempNumber));
						//System.out.println(Double.parseDouble(tempNumber));
						return PlqlLayer1Analyzer.REAL;
          }
        case 19: break;
        case 12: 
          { yybegin( YYINITIAL ) ;
					yyparser.yylval = new PlqlLayer1AnalyzerVal("\"" + temp.replaceAll("[:]", "\\\\:") + "\""); 
					return PlqlLayer1Analyzer.CHARSTRING2;
          }
        case 20: break;
        case 8: 
          { yyparser.yylval = new PlqlLayer1AnalyzerVal((String)yytext());
					return PlqlLayer1Analyzer.DOT;
          }
        case 21: break;
        case 16: 
          { yyparser.yylval = new PlqlLayer1AnalyzerVal((String)yytext());
					return PlqlLayer1Analyzer.AND;
          }
        case 22: break;
        case 9: 
          { yyparser.yylval = new PlqlLayer1AnalyzerVal((String)yytext());
					return PlqlLayer1Analyzer.OPERATORS;
          }
        case 23: break;
        case 2: 
          { return PlqlLayer1Analyzer.NL;
          }
        case 24: break;
        case 1: 
          { yyparser.yylval = new PlqlLayer1AnalyzerVal((String)yytext());
					return PlqlLayer1Analyzer.CHARSTRING1;
          }
        case 25: break;
        case 7: 
          { String tempNumber = yytext().trim();					
						yyparser.yylval = new PlqlLayer1AnalyzerVal(Integer.parseInt(tempNumber));
						//System.out.println(Integer.parseInt(tempNumber));
						return PlqlLayer1Analyzer.INTEGER;
          }
        case 26: break;
        case 11: 
          { temp += yytext() ;
          }
        case 27: break;
        case 15: 
          { temp += "\"" ;
          }
        case 28: break;
        case 4: 
          { yybegin( STRING2 ) ; temp = "" ;
          }
        case 29: break;
        case 5: 
          { yyparser.yylval = new PlqlLayer1AnalyzerVal((String)yytext()); 
					return PlqlLayer1Analyzer.LEFT_PARENTHESIS;
          }
        case 30: break;
        case 14: 
          { yyparser.yylval = new PlqlLayer1AnalyzerVal((String)yytext());
					return PlqlLayer1Analyzer.STANDARD;
          }
        case 31: break;
        case 10: 
          { 
          }
        case 32: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
