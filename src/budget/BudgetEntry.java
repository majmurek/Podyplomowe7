package budget;

import java.math.BigDecimal;

public class BudgetEntry {
    private String entryName;
    private BigDecimal amount;

    public String getEntryName() {
        return entryName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
