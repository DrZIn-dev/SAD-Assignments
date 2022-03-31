package structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker {
    private final HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
        this.worker = worker;
    }

    @Override
    public void service() {
        this.worker.service();
    }

    @Override
    public double getPrice() {
        return this.worker.getPrice();
    }
}
