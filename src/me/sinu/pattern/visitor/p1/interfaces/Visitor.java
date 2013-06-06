package me.sinu.pattern.visitor.p1.interfaces;

import me.sinu.pattern.visitor.p1.impl.Element;
import me.sinu.pattern.visitor.p1.impl.ElementCollection;

public interface Visitor {

	public void visit(Element visitable);
	public void visit(ElementCollection visitable);
}
