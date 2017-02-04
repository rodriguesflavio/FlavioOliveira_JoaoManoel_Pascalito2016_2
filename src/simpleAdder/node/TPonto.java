/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TPonto extends Token
{
    public TPonto()
    {
        super.setText(".");
    }

    public TPonto(int line, int pos)
    {
        super.setText(".");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPonto(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPonto(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPonto text.");
    }
}
