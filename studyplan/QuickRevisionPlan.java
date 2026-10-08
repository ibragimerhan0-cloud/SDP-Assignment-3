package studyplan;

public class QuickRevisionPlan extends StudyPlan {

    public QuickRevisionPlan(String subject, StudyFormat studyFormat) {
        super(subject, studyFormat);
    }

    @Override
    public void study() {
        System.out.println("Quick revision: " + subject);

        studyFormat.studyTheory(subject);
    }
}