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

package test;

import core.BlockChain;
import services.TemplarServices;
import templarCoin.Transaction;

/**
 * Created on 07/10/2026, 18:20:39
 *
 * @author manso - computer
 */
public class TestTransaction {

    public static void main(String[] args) throws Exception {
        BlockChain b = new BlockChain();
        Transaction t1 = new Transaction("System", "ana", 10);
        b.addData(t1.toBase64());

        t1 = new Transaction("ana", "maria", 5);
        b.addData(t1.toBase64());
        t1 = new Transaction("ana", "joao", 2);
        b.addData(t1.toBase64());
        t1 = new Transaction("maria", "manuela", 1);
        b.addData(t1.toBase64());

        System.out.println(b);
        System.out.println("Saldo da Maria = " + TemplarServices.getAmount("maria", b));
        System.out.println("Saldo da System = " + TemplarServices.getAmount("System", b));

    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static final long serialVersionUID = 202610071820L;
    //:::::::::::::::::::::::::::  Copyright(c) M@nso  2026  :::::::::::::::::::

///////////////////////////////////////////////////////////////////////////
}
