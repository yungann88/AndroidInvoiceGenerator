package uek.krakow.pl.androidinvoicegenerator.generator.invoicemodel;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "w_tym_23")
public class Tax23 {

    @Element(name = "brutto")
    public String brutto=" ";
    @Element(name = "VAT")
    public String VAT=" ";
    @Element(name = "netto")
    public String netto=" ";

}