package AST.Visitor;

import AST.*;
import Symtab.*;

public interface ObjectVisitor {
  public Object visit(Divide divide);
  public Object visit(Display n);
  public Object visit(Program n);
  public Object visit(MainClass n);
  public Object visit(ClassDeclSimple n);
  public Object visit(ClassDeclExtends n);
  public Object visit(VarDecl n);
  public Object visit(MethodDecl n);
  public Object visit(Formal n);
  public Object visit(IntArrayType n);
  public Object visit(BooleanType n);
  public Object visit(IntegerType n);
  public Object visit(IdentifierType n);
  public Object visit(Block n);
  public Object visit(If n);
  public Object visit(While n);
  public Object visit(Print n);
  public Object visit(Assign n);
  public Object visit(ArrayAssign n);
  public Object visit(And n);
  public Object visit(LessThan n);
  public Object visit(Plus n);
  public Object visit(Minus n);
  public Object visit(Times n);
  public Object visit(ArrayLookup n);
  public Object visit(ArrayLength n);
  public Object visit(Call n);
  public Object visit(IntegerLiteral n);
  public Object visit(True n);
  public Object visit(False n);
  public Object visit(IdentifierExp n);
  public Object visit(This n);
  public Object visit(NewArray n);
  public Object visit(NewObject n);
  public Object visit(Not n);
  public Object visit(Identifier n);
}