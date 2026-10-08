package studyplan;

public class OnlineStudyFormat implements StudyFormat {

    @Override
    public void studyTheory(String subject) {
        System.out.println("Read digital materials for " + subject + ".");
    }

    @Override
    public void practice(String subject) {
        System.out.println("Complete online exercises for " + subject + ".");
    }
}