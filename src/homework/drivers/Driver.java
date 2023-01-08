package homework.drivers;

public class Driver {
    protected Integer experience;
    protected String fullName;
    protected Boolean drivingLicence;

    public Driver(Integer experience, String fullName, Boolean drivingLicence) {
        this.experience = experience;
        this.fullName = fullName;
        this.drivingLicence = drivingLicence;
    }

    public Integer getExperience() {
        return experience;
    }

    public String getFullName() {
        return fullName;
    }

    public Boolean getDrivingLicence() {
        return drivingLicence;
    }

    public void startMovingDriver() {

    }
    private void stopMovingDriver() {

    }

    @Override
    public String toString() {
        return fullName;
    }

}
