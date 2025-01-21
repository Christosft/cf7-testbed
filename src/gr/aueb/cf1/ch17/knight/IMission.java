package gr.aueb.cf1.ch17.knight;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
