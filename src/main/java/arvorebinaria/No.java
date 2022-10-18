package arvorebinaria;

/**
 *
 * @author soarescarol
 */
public class No {
    
    public Integer no; // valor do nó
    public No arvEsq; // sub-árvore da esquerda
    public No arvDir; // sub-árvore da direita
    
    public No() {
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public No getArvEsq() {
        return arvEsq;
    }

    public void setArvEsq(No arvEsq) {
        this.arvEsq = arvEsq;
    }

    public No getArvDir() {
        return arvDir;
    }

    public void setArvDir(No arvDir) {
        this.arvDir = arvDir;
    }
    
}
