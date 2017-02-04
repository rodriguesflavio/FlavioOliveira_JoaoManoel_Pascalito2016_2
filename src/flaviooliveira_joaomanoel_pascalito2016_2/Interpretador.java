/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flaviooliveira_joaomanoel_pascalito2016_2;

import java.io.IOException;
import simpleAdder.analysis.*;
import simpleAdder.node.*;
import simpleAdder.lexer.*;

/**
 *
 * @author Flavio
 */
class Interpretador /*extends DepthFirstAdapter*/ {

    Lexer lx;
    Token t;

    public Interpretador(Lexer l) throws LexerException, IOException {
        t = l.next();
        testeToken(t);
    }

    public void testeToken(Token t) {
        /*switch (t.getText()) {
            case 1:
                caseAdicao(t.getText());*/
        }
    

    public void caseAdicao(TAdicao node) {
        System.out.println(node.getText());
    }
}
