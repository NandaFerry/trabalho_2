import java.util.Scanner;
// Fernanda Teixeira Ferry - RA: 117117395
public class Main {

    public static void main (String args[]){

        int a[] = {80,3,90,70,20,15,18,17};
        int b[] = {1,2,3,4,5,6,7,8,9,10};
        int c[] = {10,9,8,7,6,5,4,3,2,1};
        int busca[] = {70,3,18};
        int op = 0;

        Scanner input = new Scanner(System.in);

        ArvoreBinaria A = new ArvoreBinaria();
        ArvoreBinaria B = new ArvoreBinaria();
        ArvoreBinaria C = new ArvoreBinaria();

        A.inserir(a);
        System.out.print("A -> ");
        A.imprime();
        B.inserir(b);
        System.out.print("\n\nB -> ");
        B.imprime();
        C.inserir(c);
        System.out.print("\n\nC -> ");
        C.imprime();

        do{
            System.out.print("\n\nEscolha:\n\n[1] - Atividade 2\n[2] - Atividade 3\n[0] - Sair\n--> ");
            op = input.nextInt();
            switch (op){
                case 1:
                    System.out.println("\n************** ATIVIDADE 2 ************** \n");

                    System.out.println("\nBusca dos elementos (70,3,18) na árvore A:");
                    for (int i = 0; i < 3; i++){
                        System.out.println((A.buscar(busca[i], true) == null) ? busca[i]+" - Elemento não encontrado!" : busca[i] + " - Elemento encontrado!");
                    }

                    System.out.println("\nBusca dos elementos (70,3,18) na árvore B:");
                    for (int i = 0; i < 3; i++){
                        System.out.println((B.buscar(busca[i], true) == null) ? busca[i]+" - Elemento não encontrado!" : busca[i] + " - Elemento encontrado!");
                    }

                    System.out.println("\nBusca dos elementos (70,3,18) na árvore C:");
                    for (int i = 0; i < 3; i++){
                        System.out.println((C.buscar(busca[i], true) == null) ? busca[i]+" - Elemento não encontrado!" : busca[i] + " - Elemento encontrado!");
                    }

                    System.out.println("\nRemovendo o elemento 3 da árvore A:");
                    A.remover(3);
                    A.imprime();

                    System.out.println("\n\nRemovendo o elemento 3 da árvore B:");
                    B.remover(3);
                    B.imprime();

                    System.out.println("\n\nRemovendo o elemento 3 da árvore C:");
                    C.remover(3);
                    C.imprime();
                    break;
                case 2:
                    System.out.println("\n\n************** ATIVIDADE 3 ************** ");

                    System.out.println("\nElementos de A ordenados:");
                    A.imprime_ordem();

                    System.out.println("\n\nElementos de B ordenados:");
                    B.imprime_ordem();

                    System.out.println("\n\nElementos de C ordenados:");
                    C.imprime_ordem();
                    break;
                case 0:
                    System.out.println("\n\nOperações A: " + A.getOperacoes());
                    System.exit(0);
            }
        } while(op != 0);
    }
}
