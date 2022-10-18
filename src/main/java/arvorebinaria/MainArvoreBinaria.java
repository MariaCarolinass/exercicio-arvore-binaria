package arvorebinaria;

/**
 *
 * @author soarescarol
 */
public class MainArvoreBinaria {

    public static void main(String[] args) {
        /* Montando uma árvore binária
            - Unir nós com dois ponteiros:
                - sub-árvore da esquerda
                - sub-árvore da direita
            - Atribuir campo para chave de busca e dados */
        
        Arvore arvore = new Arvore();
        arvore.InserirDados(15);
        arvore.InserirDados(8);
        arvore.InserirDados(2);
        arvore.InserirDados(12);
        arvore.InserirDados(20);
        arvore.InserirDados(30);
        arvore.InserirDados(23);
        
        arvore.ExibirDados();
        
    }

}
