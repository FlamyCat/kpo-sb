package hse.kpo.observers;

import hse.kpo.domains.customer.Customer;
import hse.kpo.domains.reports.Report;
import hse.kpo.enums.ProductionTypes;

public interface SalesObserver {
    void onSale(Customer customer, ProductionTypes productType, int vin);

    void checkCustomers();

    Report buildReport();
}
