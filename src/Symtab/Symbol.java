package Symtab;

import AST.*;

public abstract class Symbol
{
    protected String type;
    protected String name;
    protected Symbol parent;
	
    public Symbol(String n, String t) 
    {
    	this.type = t;
    	this.name = n;
    }

    public String getType()
    {
        return type;
    }

    public String getName() {
        return name;
    }

    public Symbol getParent() {
    	return parent;
    }
    
    public void setParent(Symbol s) {
    	parent = s;
    }
    
    public abstract String toString();
    
    public abstract Symbol copy();
    
    public abstract boolean equals(Symbol s);
}
