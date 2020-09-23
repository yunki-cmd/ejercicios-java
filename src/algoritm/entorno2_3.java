package algoritm;

public class entorno2_3 {
    
    public  static void Funcion(int[] arr_datos, int minimo, int maximo)			
	{	int	i_sube;	
		int	i_baja;
		int aux;;
				
		for (i_sube = minimo, i_baja = maximo; i_sube < i_baja; i_sube++, i_baja--)		
		{	
			aux=arr_datos[i_baja];
			arr_datos[i_baja]=arr_datos[i_sube];
			arr_datos[i_sube] = aux;	
		}		
	}


    
public static void main(String[] args) {
    
    int datos[]={0,1,2,3,4,5,6,7,8,9};

    Funcion(datos, 2, 5);
    for (int i = 0; i < datos.length; i++) {
        System.out.print(datos[i]);
    }

}
			

}