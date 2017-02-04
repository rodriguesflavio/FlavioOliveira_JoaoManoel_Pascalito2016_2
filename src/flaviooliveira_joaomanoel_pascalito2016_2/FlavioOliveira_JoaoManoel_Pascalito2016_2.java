/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flaviooliveira_joaomanoel_pascalito2016_2;

import java.io.*;
import jdk.jfr.events.FileReadEvent;
import simpleAdder.lexer.*;
import simpleAdder.node.*;
import simpleAdder.parser.*;
import simpleAdder.analysis.*;

/**
 *
 * @author Flavio
 */
public class FlavioOliveira_JoaoManoel_Pascalito2016_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, LexerException {
        FileReader fr = new FileReader(args[0]);
        //BufferedReader br = new BufferedReader(fr);
        PushbackReader pushbackReader = new PushbackReader(fr);

        String linha = new String();
        Lexer lx = new Lexer(new PushbackReader(fr, 1024));
        Token t = lx.next();
        while (t != null) {
            System.out.println(t.getText());
             t = lx.next();
        }
        Interpretador interp = new Interpretador(lx);

        /*int data = pushbackReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = pushbackReader.read();
        }
         */
    }
}
