package algoritm;





public class entorno2_3sinmodi {

    public static void Fun(int[] arr_datos, int minimo, int maximo)						
    {	int	i_sube;				
        int	i_baja;				
                            
        for (i_sube = minimo, i_baja = maximo; i_sube < i_baja; i_sube++, i_baja--)					
        {	arr_datos[i_baja] = arr_datos[i_sube];				
            arr_datos[i_sube] = arr_datos[i_baja];				
        }					
    }						
    




    public static void main(String[] args) {
        int mi=2,max=6;
        int arreay[]={1,2,3,4,5,6,7};

        Fun(arreay, mi, max);

        for (int i = 0; i < arreay.length; i++) {
            System.out.print(arreay[i]);
        }
    }
}