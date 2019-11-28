
package menuadatos;

import javax.swing.JOptionPane;

public class  MenuAdatos {
    
    public static void  main (String[] args) {
    
        Operaciones kathe = new Operaciones();
        Arreglo ka = new Arreglo();
        Matrices kat = new Matrices();
        Ordenamientos kath = new Ordenamientos();
        Listas li = new Listas();
        Pilas pi = new Pilas();
        Colas co = new Colas();
        Arboles ar = new Arboles();
        
        //Declaracion Variables
        int i;
        int opc=0;
        int a=1;
        int b=1;
        int opcion=0;
        int numero1=0;
        int numero2=0;
        
        //Ciclo y mensaje principal
        while(a==1){ 
            try{
                opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n"
                    + "1. Operaciones \n"
                    + "2. Arreglos \n"
                    + "3. Matrices \n"
                    + "4. Ordenamientos \n"
                    + "5. Listas \n"
                    + "6. Pilas \n"
                    + "7. Colas \n"
                    + "8. Arboles \n"
                    + "9. Grafos \n"
                    + "10. Salir"));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
            }
            
            //Primer Switch
            switch(opc){
                
                case 1:
                    int validar=0;
                    do{
                        try{
                            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero"));
                            validar=1;
                        }catch(Exception ex){
                            validar=0;
                            JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
                        }
                    }while (validar==0);                
                
                    //Cliclo dos
                    while(b==1){
                        try{
                            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion de desea: \n"
                            + "1. Suma \n"
                            + "2. Resta \n"
                            + "3. Multiplicacion \n"
                            + "4. Division \n"
                            + "5. Salir"));
                        }catch(Exception ex){
                            JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
                        }
                        
                        //Segundo Switch
                        switch(opcion){
                            
                            case 1:
                            JOptionPane.showMessageDialog(null, kathe.suma(numero1,numero2));
                            break;
            
                            case 2:
                            JOptionPane.showMessageDialog(null,kathe.resta(numero1,numero2));
                            break;
                
                            case 3:
                            JOptionPane.showMessageDialog(null,kathe.multiplicacion(numero1,numero2));
                            a=0;
                            break;
                
                            case 4:
                            JOptionPane.showMessageDialog(null,kathe.division(numero1,numero2));
                            break;
                            
                            case 5:
                            JOptionPane.showMessageDialog(null,"MENU PRINCIPAL");
                            b=0;
                            break;
                        }
                    }
                break;
                
                case 2:
                    ka.arreglo();
                break;
            
                case 3:
                    kat.matriz();
                break;
                
                case 4:
                    kath.ordenamientos();
                break;
                
                case 5:
                    li.listas();
                break;
                
                case 6:
                    pi.pilas();
                break;
                
                case 7:
                    co.colas();
                break;
                
                case 8:
                    ar.arboles();
                break;
                
                case 9:
                break;
                
                case 10:
                    JOptionPane.showMessageDialog(null,"HASTA PRONTO");
                    a=0;
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"OPCION NO VALIDA");
                break;
            }
        }
    }
}
