package studyplan;

public class ExamPreparationPlan extends StudyPlan {

    public ExamPreparationPlan(String subject, StudyFormat studyFormat) {
        super(subject, studyFormat);
    }

    @Override
    public void study() {
        System.out.println("Exam preparation: " + subject);

        studyFormat.studyTheory(subject);
        studyFormat.practice(subject);
    }
}