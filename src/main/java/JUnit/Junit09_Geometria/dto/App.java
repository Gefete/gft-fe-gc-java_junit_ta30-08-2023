package JUnit.Junit09_Geometria.dto;

public class App 
{
    public static void main( String[] args )
    {
	   //Creacion de Objeto Circulo
	   Geometria gm=new Geometria(2);
	   double areaCirc= gm.areaCirculo(2);
	   gm.setArea(areaCirc);    
	   System.out.println(gm);
	   
	   double areaPent= gm.areapentagono(4, 7);
	   gm.setArea(areaPent);    
	   System.out.println(gm);
    }
    
}
