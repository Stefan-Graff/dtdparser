package com.wutka.dtd;

/** Represents a mixed Element content (PCDATA + choice/sequence).
 * Mixed Element can contain #PCDATA, or it can contain
 * #PCDATA followed by a list of pipe-separated names.
 *
 * @author Mark Wutka
 * @version $Revision$ $Date$ by $Author$
 */
public class DTDMixed extends DTDContainer
{
    public DTDMixed()
    {
    }
}
