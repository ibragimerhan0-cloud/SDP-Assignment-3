package studyplan;

public abstract class StudyPlan {

    protected final String subject;
    protected StudyFormat studyFormat;

    protected StudyPlan(String subject, StudyFormat studyFormat) {
        this.subject = subject;
        this.studyFormat = studyFormat;
    }

    public void setStudyFormat(StudyFormat studyFormat) {
        this.studyFormat = studyFormat;
    }

    public abstract void study();
}