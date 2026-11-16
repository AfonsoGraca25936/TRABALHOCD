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

package services;

import core.Block;
import core.BlockChain;
import templarCoin.Transaction;

/**
 * Created on 07/10/2026, 18:16:43 
 * @author manso - computer
 */
public class TemplarServices {
    
    public static double getAmount(String user, BlockChain bc) throws Exception{
        double val = 0;
        for( Block b : bc.getChain()){
            Transaction t =  utils.Conversion.stringToObject(b.getData());
            if(t.getTo().equalsIgnoreCase(user))
                val+=t.getValue();
             if(t.getFrom().equalsIgnoreCase(user))
                val-=t.getValue();
            
        }
        return val;
    }



    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static final long serialVersionUID = 202610071816L;
    //:::::::::::::::::::::::::::  Copyright(c) M@nso  2026  :::::::::::::::::::
    ///////////////////////////////////////////////////////////////////////////
}
