package BusinessObjects.Procedure;

import BusinessObjects.Provider.Provider;

import java.io.Serializable;

/**
 *class that makes Procedures
 */
public class ProcedureImp implements Procedure, Serializable {

    private Provider provider;

    private String procedureCode;

    private String procedureDescription;

    private double standardCharge;

    /**
     * Default Constructor
     */
    public ProcedureImp(){}

    /**
     * Overloaded Constructor that take in provider, procureCode, ProcedureDecription, standard
     * @param provider sets the provider
     * @param procedureCode sets the procedureCode
     * @param procedureDescription sets the procedureDecription
     * @param standardCharge sets the standardCharge
     */
    public ProcedureImp(Provider provider, String procedureCode, String procedureDescription, double standardCharge){
        this.setProvider(provider);
        this.setProcedureCode(procedureCode);
        this.setProcedureDescription(procedureDescription);
        this.setStandardCharge(standardCharge);
    }

    /**
     * gets the set provider
     * @return - the set provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * sets the provider
     * @param provider - set provider
     */
    public void setProvider(Provider provider) {
        if(provider == null){
            throw new IllegalArgumentException("Cannot be null");
        }
        this.provider = provider;
    }

    /**
     * gets the set procedureCode
     * @return - gets the set procedureCode
     */
    public String getProcedureCode() {
        return procedureCode;
    }

    /**
     * sets the procedureCode
     * @param procedureCode - sets the procedureCode
     */
    public void setProcedureCode(String procedureCode) {
        if(procedureCode == null){
            throw new IllegalArgumentException("Cannot be null");
        }
        this.procedureCode = procedureCode;
    }

    /**
     * gets the set ProcedureDescription
     * @return - gets the set ProcedureDescription
     */
    public String getProcedureDescription() {
        return procedureDescription;
    }

    /**
     * sets the procedureDescription
     * @param procedureDescription - sets the procedureDescription
     */
    public void setProcedureDescription(String procedureDescription) {
        if(procedureDescription == null){
            throw new IllegalArgumentException("cannot be null");
        }
        this.procedureDescription = procedureDescription;
    }

    /**
     * gets the set standardCharge
     * @return - gets the set satndardCharge
     */
    public double getStandardCharge() {
        return standardCharge;
    }

    /**
     * sets the standardCharge
     * @param standardCharge - sets the standardCharge
     */
    public void setStandardCharge(double standardCharge) {
        if(standardCharge > 0){
            throw new IllegalArgumentException("cannot be less then zero");
        }
        this.standardCharge = standardCharge;
    }
}
