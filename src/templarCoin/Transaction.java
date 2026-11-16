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

package templarCoin;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created on 07/10/2026, 17:59:06 
 * @author manso - computer
 */
public class Transaction implements Serializable{
    String from;
    String to;
    double value;

    public Transaction(String from, String to, double value) {
        this.from = from;
        this.to = to;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" + "from=" + from + ", to=" + to + ", value=" + value + '}';
    }
    
    
    public  String toBase64() throws IOException{
        return utils.Conversion.objectToString(this);
    }
    
    public  static Transaction fromBase64(String txt) throws Exception{
        return (Transaction) utils.Conversion.stringToObject(txt);
    } 

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getValue() {
        return value;
    }
    



    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static final long serialVersionUID = 202610071759L;
    //:::::::::::::::::::::::::::  Copyright(c) M@nso  2026  :::::::::::::::::::
    ///////////////////////////////////////////////////////////////////////////
}
