/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.analysis;

import simpleAdder.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTAdicao(TAdicao node);
    void caseTSubtracao(TSubtracao node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivisao(TDivisao node);
    void caseTRestodivisao(TRestodivisao node);
    void caseTMenor(TMenor node);
    void caseTMaior(TMaior node);
    void caseTMenorigual(TMenorigual node);
    void caseTMaiorigual(TMaiorigual node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTNot(TNot node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTVirgula(TVirgula node);
    void caseTDoispontos(TDoispontos node);
    void caseTPontoevirgula(TPontoevirgula node);
    void caseTPonto(TPonto node);
    void caseTPontoponto(TPontoponto node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTAbreparenteses(TAbreparenteses node);
    void caseTFechaparenteses(TFechaparenteses node);
    void caseTAbrecolchetes(TAbrecolchetes node);
    void caseTFechacolchetes(TFechacolchetes node);
    void caseTIdentificador(TIdentificador node);
    void caseTNumero(TNumero node);
    void caseTVazio(TVazio node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
