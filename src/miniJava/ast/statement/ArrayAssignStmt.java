package miniJava.ast.statement;

import miniJava.ast.expression.Expression;
import miniJava.ast.identifier.Identifier;
import miniJava.visitor.Visitor;

public class ArrayAssignStmt implements Statement {
    private Identifier array;
    private Expression index;
    private Expression assign;

    public ArrayAssignStmt(Identifier array, Expression index, Expression assign) {
        this.array = array;
        this.index = index;
        this.assign = assign;
    }

    public Identifier getArray() {
        return array;
    }

    public Expression getIndex() {
        return index;
    }

    public Expression getAssign() {
        return assign;
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}

