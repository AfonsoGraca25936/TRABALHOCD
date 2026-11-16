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

import java.io.IOException;
import java.util.ArrayList;
import templarCoin.Transaction;

/**
 * Created on 07/10/2026, 17:45:54
 *
 * @author manso - computer
 */
public class BlockChain {


    ArrayList<Block> chain = new ArrayList<>();

    public BlockChain() throws IOException {
        String prev = "000000";
        Transaction genesis = new Transaction("MASTER", "System", 1000);
        String data = genesis.toBase64();
        int dif = 2;
        int nonce = Miner.getNonce(prev + data + dif, dif);
        String current = utils.SecurityUtils.getHash(prev + data + dif + nonce);
        Block b = new Block(prev, data, nonce, dif, current);
        chain.add(b);

    }

    public void addData(String data) {
        String prev = chain.getLast().currentHash;
        int dif = chain.getLast().getDificulty();
        int nonce = Miner.getNonce(prev + data + dif, dif);
        String current = utils.SecurityUtils.getHash(prev + data + dif + nonce);
        Block b = new Block(prev, data, nonce, dif, current);
        chain.add(b);

    }
    
    public Block getLastBlock(){
        return chain.getLast();
    }

    public String toString() {
        StringBuffer txt = new StringBuffer("BlockChain");
        for (Block block : chain) {
            txt.append("\n" + block.toString());
        }
        return txt.toString();
    }

    public ArrayList<Block> getChain() {
        return chain;
    }
    
    

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static final long serialVersionUID = 202610071745L;
    //:::::::::::::::::::::::::::  Copyright(c) M@nso  2026  :::::::::::::::::::


///////////////////////////////////////////////////////////////////////////
}
