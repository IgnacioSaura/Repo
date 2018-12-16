package abfPack;

public class FactoryProducer {

	public AbstractFactory getFactory(String facType) {
		
		if(facType.equalsIgnoreCase("shape")) {
			
			return new ShapeFactory();
			
		}
		
		else if(facType.equalsIgnoreCase("color")) {
			
			return new ColorFactory();
			
		}
		
		return null;
		
	}
	
}
