package abfPack;

public class Main {

	public static void main(String[] args) {

		FactoryProducer fp = new FactoryProducer();
		
		AbstractFactory a,b;
		
		a = fp.getFactory("ShaPE");
		b = fp.getFactory("cOLoR");
	
		a.getShape("sQUaRe").draw();
		a.getShape("tRIaNgLE").draw();
		
		b.getColor("ReD").paint();
		b.getColor("grEEn").paint();
		
	}

}
