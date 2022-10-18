package arvorebinaria;

/**
 *
 * @author soarescarol
 */
public class Arvore {
    
    private No raiz;
    private No noAtual;
    private No noAnterior;
    
    public Arvore() {
        // raiz iniciada com null
        raiz = null;
    }
    
    public void InserirDados(Integer numero) {
        No novoNo = new No();
        novoNo.no = numero;
        novoNo.arvDir = null;
        novoNo.arvEsq = null;
        
        if (raiz == null) {
            // raiz igual ao novo no
            raiz = novoNo;
        } else {
            noAtual = raiz;
            while (true) {
                noAnterior = noAtual;
                if (numero <= noAtual.no) {
                    // se o número for menor que a raiz,
                    // então o nó atual será adicionado a esquerda
                    noAtual = noAtual.arvEsq;
                    if (noAtual == null) {
                        // se o nó atual for igual a null,
                        // então criar novo nó anterior a esquerda
                        noAnterior.arvEsq = novoNo;
                        return;
                    } 
                } else {
                    // o número maior que a raiz adicionado 
                    // a direita do nó atual
                    noAtual = noAtual.arvDir;
                    if (noAtual == null) {
                        // se o nó atual for igual a null,
                        // então criar novo nó anterior a direita
                        noAnterior.arvDir = novoNo;
                        return;
                    }
                }
            }
        
        }
        
    }
    
    public void ExibirDados() {
        OrdenarDados(raiz);
    }

    private void OrdenarDados(No atual) {
        if (atual != null) {
            OrdenarDados(atual.arvEsq);
            System.out.print(atual.no + " ");
            OrdenarDados(atual.arvDir);
        }
    }
    
    public void BuscarDados(Integer numero) {
        
    }
    
    public void RemoverDados(Integer numero) {
        
    }
    
}
