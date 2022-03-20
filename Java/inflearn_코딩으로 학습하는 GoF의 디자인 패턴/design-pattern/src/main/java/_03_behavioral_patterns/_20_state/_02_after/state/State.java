package _03_behavioral_patterns._20_state._02_after.state;

import _03_behavioral_patterns._20_state._02_after.Student;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
