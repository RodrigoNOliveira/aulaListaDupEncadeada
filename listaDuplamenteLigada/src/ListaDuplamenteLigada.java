public class ListaDuplamenteLigada {

   private No cabeca;
   private No cauda;


  //metodo que adiciona no final da lista
   public void adicionar(No novoElemento){
         if(cabeca== null){
            this.cabeca = novoElemento;
            this.cauda = cabeca;
         }
         else {
            cauda.setProx(novoElemento);
            novoElemento.setAnt(cauda);
            cauda= novoElemento;

         }
      }



   public void imprimir(){
      No aux = cabeca;
      while (aux != null){
         System.out.print(aux.getDado() + " -> ");
         aux =  aux.getProx();
      }
      System.out.print("Fim\n\n");

      aux = cauda;
      while (aux != null){
         System.out.print(aux.getDado() + " -> ");
         aux =  aux.getAnt();
      }
      System.out.print("Inicio\n\n");
   }










}
