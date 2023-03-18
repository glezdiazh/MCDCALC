package es.ehu.oms.utils;

import es.ehu.oms.model.Params;
import java.util.Random;

/**
 *
 * @author paula.carracedorebor
 */
public class Utils {
    
    public String randomNameFile()
	{
		String cadenaAleatoria = "";
		long milis = new java.util.GregorianCalendar().getTimeInMillis();
		Random r = new Random(milis);
		
		int i = 0;
		while ( i < 11){
			char c = (char)r.nextInt(255);
			if ( (c >= '0' && c <='9') || (c >='A' && c <='Z') ){
				cadenaAleatoria += c;
				i ++;
			}
		}
		
		return cadenaAleatoria;
	}
	
	public int calculaTiemmpo(String cadena)
	{	
		String[] lineas = cadena.replaceAll(" ","").split("\\r?\\n");
		Double sec = new Double(lineas.length/10);
		return sec.intValue();
		
	}
        
        public int cuentaComas(String cadena)
        {
            int comas = 0;
            for(int i = 0; i < cadena.length(); i++) {
                if(cadena.charAt(i) == ',') comas++;
            }
            return comas;
        }

	public String formateaCadenas(String cadena)
	{		 
		String cadenaFormateada = "";
		String[] lineas = cadena.replaceAll(" ","").split("\\r?\\n");
		
		for (int i = 0; i<=lineas.length-1; i++) {           
	       
			if (!lineas[i].equals(""))
			{
				int comas = cuentaComas(lineas[i]);
				
				if (!lineas[i].contains(",") || comas > 1)
				{
					int j = i+1;
					cadenaFormateada = "Incorrect format, line" +j+": "+lineas[i];
					break;
				}
				else
				{
					cadenaFormateada = cadenaFormateada + lineas[i]+"\n";
				}
			}
	    }
		
		return cadenaFormateada;
	}
	

	public String atomProperties(Params parameters)
	{
		String atomPropertiesUnselected = " ";
		
				
		if (!parameters.isaPolar())
		{
			atomPropertiesUnselected = atomPropertiesUnselected + "aPolar,";
		}
		
		if (!parameters.isEa())
		{
			atomPropertiesUnselected = atomPropertiesUnselected + "EA,";
		}
		
		if (!parameters.isSae())
		{
			atomPropertiesUnselected = atomPropertiesUnselected + "SAe,";
		}
		
		if (!parameters.isVvdw())
		{
			atomPropertiesUnselected = atomPropertiesUnselected + "Vvdw,";
		}
		
		if (!parameters.isZv())
		{
			atomPropertiesUnselected = atomPropertiesUnselected + "Zv,";
		}
		
		if ((parameters.isaPolar() && (parameters.isEa()) && (parameters.isSae()) && (parameters.isVvdw())
				&& (parameters.isZv())) || (parameters.isNoneAtProp()))
		{
			atomPropertiesUnselected =  " none,"; 
		}
		
		String atomPropertiesUnselectedFinal = atomPropertiesUnselected.substring(0, atomPropertiesUnselected.length()-1);
		
			
		return atomPropertiesUnselectedFinal;
	}
	
	public String atomTypes(Params parameters)
	{
		String atomTypesSelected = "";
		String atomTypesSelectedFinal = "";
		
		if (parameters.isAllAtoms())
		{
			atomTypesSelected = atomTypesSelected +"All,";
					
		}
		
		if (parameters.iscSat())
		{
			atomTypesSelected = atomTypesSelected +"Csat,";
					
		}
		
		if (parameters.iscUns())
		{
			atomTypesSelected = atomTypesSelected +"Cuns,";
					
		}
		
		if (parameters.isHal())
		{
			atomTypesSelected = atomTypesSelected +"Hal,";
					
		}
		
		if (parameters.isHet())
		{
			atomTypesSelected = atomTypesSelected +"Het,";
					
		}
		
		if (parameters.isHetNoX())
		{
			atomTypesSelected = atomTypesSelected +"HetNoX,";
					
		}
		
		if (!atomTypesSelected.equals("")) {
			
			atomTypesSelectedFinal = atomTypesSelected.substring(0, atomTypesSelected.length()-1);
		}		
	
		return atomTypesSelectedFinal;
	}
	
	public String cutSmiles(String smiles)
	{
		String finalSmiles = "";
		
		String[] lineas = smiles.replaceAll(" ","").split("\\r?\\n");
		
		if (lineas.length > 50)
		{
			for (int i=0; i<50; i++) {    
				
				finalSmiles = finalSmiles+lineas[i]+"\r\n";
			}
		}
		else
		{
			finalSmiles = smiles;
		}
			
		return finalSmiles;
	}
}
