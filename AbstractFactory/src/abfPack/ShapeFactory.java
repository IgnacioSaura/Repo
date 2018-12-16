package abfPack;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("triangle")) {
			
			return new Triangle();
			
		}
		
		else if(shapeType.equalsIgnoreCase("square")) {
			
			return new Square();
			
		}
		
		return null;
		
	}
	
	@Override 
	public Color getColor(String color) {
		
		return null;
		
	}

}
