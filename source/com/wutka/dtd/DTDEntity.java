package com.wutka.dtd;

import java.io.*;

/** Represents an Entity defined in a DTD
 *
 * @author Mark Wutka
 * @version $Revision$ $Date$ by $Author$
 */
public class DTDEntity
{
    public String name;
    public boolean isParsed;
    public String value;
    public DTDExternalID externalID;
    public String ndata;

    public DTDEntity()
    {
    }

    public DTDEntity(String aName)
    {
        name = aName;
    }

/** Writes out an entity declaration for this entity */
    public void write(PrintWriter out)
        throws IOException
    {
        out.print("<!ENTITY ");
        if (isParsed)
        {
            out.print(" % ");
        }
        out.print(name);

        if (value != null)
        {
            out.print("\"");
            out.print(value);
            out.print("\"");
        }
        else
        {
            externalID.write(out);
            if (ndata != null)
            {
                out.print(" NDATA ");
                out.print(ndata);
            }
        }
        out.println(">");
    }
}
