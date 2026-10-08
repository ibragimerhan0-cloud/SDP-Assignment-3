package studyplan;

public class ClassroomStudyFormat implements StudyFormat {

    @Override
    public void studyTheory(String subject) {
        System.out.println("Read printed materials for " + subject + ".");
    }

    @Override
    public void practice(String subject) {
        System.out.println("Complete classroom exercises for " + subject + ".");
    }
}