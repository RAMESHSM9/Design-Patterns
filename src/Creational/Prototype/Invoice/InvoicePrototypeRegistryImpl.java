package Prototype.Invoice;

import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements  InvoicePrototypeRegistry {

    HashMap<InvoiceType, Invoice> invoices;
    public InvoicePrototypeRegistryImpl() {
        invoices = new HashMap<>();
    }
    @Override
    public void addPrototype(Invoice user) {

        if(user.getType().equals(InvoiceType.SALES))
        {
            invoices.put(InvoiceType.SALES, user);
        }
        else if(user.getType().equals(InvoiceType.PURCHASE))
        {
            invoices.put(InvoiceType.PURCHASE, user);
        }
        else if(user.getType().equals(InvoiceType.SERVICE))
        {
            invoices.put(InvoiceType.SERVICE, user);
        }

        throw  new RuntimeException("Unkown Invoice Type");

    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        if(invoices.containsKey(type))
        {
            return invoices.get(type);
        }
        return null;
    }

    @Override
    public Invoice clone(InvoiceType type) {
        if(invoices.containsKey(type))
        {
            return invoices.get(type).cloneObject();
        }
        return null;
    }
}
