/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author sp21-bse-061
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      //get an object of Shape Rectangle
      Shape shape = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape.draw();
      //get an object of Shape Square 
      Shape shapes = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shapes.draw();
       Shape shapeq = shapeFactory.getShape("Triangle");
      //call draw method of Shape Square
      shapeq.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      //get an object of Shape Rectangle
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape3.draw();
      //get an object of Shape Square 
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape4.draw();
       Shape shapeq1 = shapeFactory.getShape("Triangle");
      //call draw method of Shape Square
      shapeq1.draw();
      
      
    }
    
}
