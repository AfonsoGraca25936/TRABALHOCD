//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
//::                                                                         ::
//::     Antonio Manuel Rodrigues Manso                                      ::
//::                                                                         ::
//::     I N S T I T U T O    P O L I T E C N I C O   D E   T O M A R        ::
//::     Escola Superior de Tecnologia de Tomar                              ::
//::     e-mail: manso@ipt.pt                                                ::
//::     url   : http://orion.ipt.pt/~manso                                  ::
//::                                                                         ::
//::     This software was build with the purpose of investigate and         ::
//::     learning.                                                           ::
//::                                                                         ::
//::                                                               (c)2026   ::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 //////////////////////////////////////////////////////////////////////////////

package core;

/**
 * Created on 07/10/2026, 17:18:56
 *
 * @author manso - computer
 */
public class Block {

    String previousHash;
    String data; 
    private int dificulty; // number of zeros
    int nonce;
    String currentHash;

    public Block(String previousHash, String data, int nonce, int dif, String currentHash) {
        this.previousHash = previousHash;
        this.data = data;
        this.nonce = nonce;
        this.dificulty = dif;
        this.currentHash = currentHash;
    }

    public boolean isValid() {
        return utils.SecurityUtils.getHash(
                previousHash + data + dificulty + nonce).equals(currentHash);

    }

    @Override
    public String toString() {
        return (isValid() ? "OK " : "CORRUPTED ")
                + "Block{" + "previousHash=" + previousHash + ", data=" + data + ", nonce=" + nonce + ", dificulty=" + dificulty + ", currentHash=" + currentHash + '}';
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getData() {
        return data;
    }

    public int getNonce() {
        return nonce;
    }

    public String getCurrentHash() {
        return currentHash;
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static final long serialVersionUID = 202610071718L;

    public int getDificulty() {
        return dificulty;
    }
    //:::::::::::::::::::::::::::  Copyright(c) M@nso  2026  :::::::::::::::::::

///////////////////////////////////////////////////////////////////////////
}
