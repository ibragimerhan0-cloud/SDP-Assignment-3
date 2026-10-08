package studyplan;

public class Main {

    public static void main(String[] args) {

        StudyFormat online = new OnlineStudyFormat();
        StudyFormat classroom = new ClassroomStudyFormat();

        StudyPlan examPlan = new ExamPreparationPlan("Java", online);

        System.out.println("=== Exam preparation: online ===");
        examPlan.study();

        System.out.println();

        System.out.println("=== Same exam plan: classroom ===");
        examPlan.setStudyFormat(classroom);
        examPlan.study();

        System.out.println();

        StudyPlan revisionPlan = new QuickRevisionPlan("Java", classroom);

        System.out.println("=== Quick revision: classroom ===");
        revisionPlan.study();

        System.out.println();

        System.out.println("=== Same revision plan: online ===");
        revisionPlan.setStudyFormat(online);
        revisionPlan.study();
    }
}