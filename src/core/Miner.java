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
 * Created on 07/10/2026, 17:32:15
 *
 * @author manso - computer
 */
public class Miner {

//    public static void main(String[] args) {
//        String msg = "Hello Blockchain world";
//        int dif = 5;
//        int nonce = getNonce(msg, dif);
//        System.out.println("nonce" + nonce);
//
//    }

    public static int getNonce(String data, int dif) {
        String zeros = String.format("%0" + dif + "d", 0);
        int nonce = 0;
        while (true) {
            String hash = utils.SecurityUtils.getHash(data + nonce);
             if (hash.startsWith(zeros)) {
                System.out.println(nonce + " " + hash);
                return nonce;
            }
            nonce++;

        }

    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static final long serialVersionUID = 202610071732L;
    //:::::::::::::::::::::::::::  Copyright(c) M@nso  2026  :::::::::::::::::::

///////////////////////////////////////////////////////////////////////////
}
