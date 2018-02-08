package BusinessObjects.Procedure;

import BusinessObjects.Provider.Provider;

public class ProcedureImp implements Procedure {

    private Provider provider;

    private String procedureCode;

    private String procedureDescription;

    private double standardCharge;

    public ProcedureImp(){}

    public ProcedureImp(Provider provider, String procedureCode, String procedureDescription, double standardCharge){
        this.setProvider(provider);
        this.setProcedureCode(procedureCode);
        this.setProcedureDescription(procedureDescription);
        this.setStandardCharge(standardCharge);
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getProcedureCode() {
        return procedureCode;
    }

    public void setProcedureCode(String procedureCode) {
        this.procedureCode = procedureCode;
    }

    public String getProcedureDescription() {
        return procedureDescription;
    }

    public void setProcedureDescription(String procedureDescription) {
        this.procedureDescription = procedureDescription;
    }

    public double getStandardCharge() {
        return standardCharge;
    }

    public void setStandardCharge(double standardCharge) {
        this.standardCharge = standardCharge;
    }
}
