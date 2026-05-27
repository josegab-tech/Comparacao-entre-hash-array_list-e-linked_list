import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        HashMap<Integer,String> pessoaHash = new HashMap<>();
        int qtdElementos=100000;

        long tempoInicial = System.currentTimeMillis();

        for(int i=0;i<qtdElementos;i++)
            pessoaHash.put(i, "Pessoa "+i);

        for(int i=0;i<qtdElementos;i++)
            pessoaHash.containsKey(i);


        long tempoFinal = System.currentTimeMillis();

        double tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;

        System.out.printf("Hash Time (s): %.3f\n", tempoTotalSeg);



        ArrayList<Integer> pessoaArray = new ArrayList();
        tempoInicial = System.currentTimeMillis();

        for(int i=0;i<qtdElementos;i++)
            pessoaArray.add(i);

        for(int i=0;i<qtdElementos;i++)
            pessoaArray.contains(i);


        tempoFinal = System.currentTimeMillis();

        tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;

        System.out.printf("Array Time (s): %.3f\n", tempoTotalSeg);


        LinkedList<Integer> pessoaLista = new LinkedList<>();
        tempoInicial = System.currentTimeMillis();

        for(int i=0;i<qtdElementos;i++)
            pessoaLista.add(i);

        for(int i=0;i<qtdElementos;i++)
            pessoaLista.contains(i);


        tempoFinal = System.currentTimeMillis();

        tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;

        System.out.printf("Linked Time (s): %.3f\n", tempoTotalSeg);
    }
}
