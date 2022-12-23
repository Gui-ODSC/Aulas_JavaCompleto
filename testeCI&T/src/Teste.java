import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Challenge {
    public static void main(String[] args){
      Scanner ent = new Scanner(System.in);
      List<Integer> postoDeGasolina = new ArrayList<>();
      postoDeGasolina.add(2);
      postoDeGasolina.add(15);
      postoDeGasolina.add(22);
      postoDeGasolina.add(11);
      
      Integer combustivel = 2;
      Integer consumoMedio = 8;
      
      UltimaParada(combustivel, consumoMedio, postoDeGasolina);
    }
    static Integer UltimaParada(Integer combustivel, Integer consumoMedio, List<Integer> postoDeGasolina){
    	Integer cont = 0;
    	Integer distancia = combustivel * consumoMedio;
        for(Integer i = 0; i < postoDeGasolina.size(); i++){
          if (i < distancia) {
         	cont = i;
          }
        }
        if (cont != 0) {
        	return cont;
        }else {
        	 return -1;
        }
   } 
}
