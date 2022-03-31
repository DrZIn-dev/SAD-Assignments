package structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private final Set<HealthcareServiceable> members;

    HealthcareWorkerTeam() {
        members = new LinkedHashSet<HealthcareServiceable>();
    }

    public void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        members.remove(member);
    }

    public void service() {
        members.stream().forEach(member -> member.service());
    }

    public double getPrice() {
        double sumPrice = 0.0;
        for (HealthcareServiceable member : members) {
            sumPrice += member.getPrice();
        }
        return sumPrice;
    }

}
