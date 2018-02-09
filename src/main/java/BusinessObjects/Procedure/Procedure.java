package BusinessObjects.Procedure;

import BusinessObjects.Provider.Provider;

public interface Procedure {

    /**
     * gets the set Provider
     * @return the set Provider
     */
    public Provider getProvider();

    /**
     * sets the Provider
     * @param provider - sets the Provider
     */
    public void setProvider(Provider provider);

    /**
     * gets the set ProcedureCode
     * @return - gests the set ProcedureCode
     */
    public String getProcedureCode();

    /**
     * sets the ProcedureCode
     * @param procedureCode - set the ProcedureCode
     */
    public void setProcedureCode(String procedureCode);

    /**
     * gets the set ProcedureDesecription
     * @return - gets the set ProcedureDescription
     */
    public String getProcedureDescription();

    /**
     * sets the ProcedureDescription
     * @param procedureDescription - sets the ProcedureDescription
     */
    public void setProcedureDescription(String procedureDescription);

    /**
     * gets the set StandardCharge
     * @return - gets the set StandardCharge
     */
    public double getStandardCharge();

    /**
     * sets the StandardCharge
     * @param standardCharge - sets the StandardCharge
     */
    public void setStandardCharge(double standardCharge);

    /**
     * gets the amount charged
     * @return
     */
    public double getAmountCharged();

    /**
     * sets the amount charged
     * @param amountCharged - set the amountCharged
     */
    public void setAmountCharged(double amountCharged);

    /**
     * Overrides default toString
     * @return - the Provider the procedureCode the ProcedureDescription the standard Charge and the AmountCharged.
     */
    @Override
    public String toString();

    /**
     * Overrides default equals
     * @param obj - takes in obj
     * @return - the same procedurecode
     */
    @Override
    public boolean equals(Object obj);
}
