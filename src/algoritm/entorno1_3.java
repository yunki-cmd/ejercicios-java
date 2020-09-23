package algoritm;

public class entorno1_3 {
    
    public static int[] tamano_array(int a){
    	int b[];
    	int c=a;
    	int aux=0;
        int num=2;
        do{
            if(c%num==0){
                c/=num;
                aux++;
            }else if(num<=(a/2)){
                num++;
            }
        }while(c>1);
        b=new int[aux];
        
        return b;
    }

    public static int divi(int a,int num){
        if(a%num==0){
            return a/=num;
        }
        return -1;
    }
    public static void guardar(int a[],int b){
    	int cons=b;
        int num=2;
        int aux=0;
        do{
        if(divi(b, num)!=-1){  
            a[aux]=divi(b, num);
            b=divi(b,num);
            aux++;
        }else if(num<cons/2){
            num++;
        }
        }while(b>1);

    }


    public static void main(String[] args) {
        int b=36;
        int a=12;
        int arra_a[];
        int arra_b[];
        arra_a=tamano_array(a);
        guardar(arra_a,a);
        arra_b=tamano_array(b);
        guardar(arra_b, b);
        for (int i = 0; i < arra_a.length; i++) {
			for (int j = 0; j < arra_b.length; j++) {
				if(arra_a[i]==arra_b[j]) {
					System.out.println(arra_a[i]);
				}
			}
		}
        
    }




}