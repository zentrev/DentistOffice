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

    private double amountCharged;

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
     * @param amountCharged sets the amount charged
     */
    public ProcedureImp(Provider provider, String procedureCode, String procedureDescription, double standardCharge, double amountCharged){
        this.setProvider(provider);
        this.setProcedureCode(procedureCode);
        this.setProcedureDescription(procedureDescription);
        this.setStandardCharge(standardCharge);
        this.setAmountCharged(amountCharged);
    }

    /**
     * Overloaded Constructor that take in provider, procureCode, ProcedureDecription, standard
     * @param provider sets the provider
     * @param procedureCode sets the procedureCode
     * @param procedureDescription sets the procedureDecription
     * @param standardCharge sets the standardCharge
     */
    public ProcedureImp(Provider provider, String procedureCode, String procedureDescription, double standardCharge){
        this(provider,procedureCode,procedureDescription,standardCharge,standardCharge);
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
        if(standardCharge < 0){
            throw new IllegalArgumentException("cannot be less then zero");
        }
        this.standardCharge = standardCharge;
    }

    /**
     * gets the amountCharged
     * @return - gets the amountCharged
     */
    public double getAmountCharged() {
        return amountCharged;
    }

    /**
     * sets the amountCharged
     * @param amountCharged - set the amountCharged
     */
    public void setAmountCharged(double amountCharged) {
        if(amountCharged < 0){
            throw new IllegalArgumentException("cannot be less then zero");
        }
        this.amountCharged = amountCharged;
    }
    /**
     * Overrides default toString
     * @return - the Provider the procedureCode the ProcedureDescription the standard Charge and the AmountCharged.
     */
    @Override
    public String toString(){
        return "Provider: " + this.getProvider() + "\nProcedureCode: " + this.getProcedureCode() + "\nProcedureDescription: " + this.getProcedureDescription()
                + "\nStandardCharge: " + this.getStandardCharge() + "\nAmount Charged " + this.getAmountCharged()+"\n------------------------------";
    }

    /**
     * Overrides default equals
     * @param obj - takes in obj
     * @return - the same procedurecode
     */
    @Override
    public boolean equals(Object obj){
        ProcedureImp other = (ProcedureImp)obj;
        return this.getProcedureCode() == other.procedureCode;
    }
}
