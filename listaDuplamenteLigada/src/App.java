public class App {


    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        No no= new No("A", null, null);
        lista.adicionar(no);
        lista.adicionar(new No("B", null ,null));
        lista.adicionar(new No("C", null ,null));
        lista.adicionar(new No("D", null ,null));
        lista.imprimir();


















    }


}
