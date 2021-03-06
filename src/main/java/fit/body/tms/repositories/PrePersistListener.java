package fit.body.tms.repositories;

import fit.body.tms.models.Training;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class PrePersistListener {

    @PrePersist
    public void setTrainingDefaults(Training training) {
        if (training.getStartTime() == null) {
            training.setStartTime(LocalDateTime.now());
        }
        if (training.getDuration() == null) {
            training.setDuration(0);
        }
    }
}
