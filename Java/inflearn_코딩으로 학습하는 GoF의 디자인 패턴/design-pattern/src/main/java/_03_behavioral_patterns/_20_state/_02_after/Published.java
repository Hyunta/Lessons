package _03_behavioral_patterns._20_state._02_after;

public class Published implements State {
    private OnlineCourse onlineCourse;

    public Published(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        onlineCourse.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        onlineCourse.getStudents().add(student);
    }
}
