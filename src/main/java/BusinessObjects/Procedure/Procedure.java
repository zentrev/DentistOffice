package BusinessObjects.Procedure;

import BusinessObjects.Provider.Provider;

public interface Procedure {

    public Provider getProvider();

    public void setProvider(Provider provider);

    public String getProcedureCode();

    public void setProcedureCode(String procedureCode);

    public String getProcedureDescription();

    public void setProcedureDescription(String procedureDescription);

    public double getStandardCharge();

    public void setStandardCharge(double standardCharge);
}
