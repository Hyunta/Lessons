package _03_behavioral_patterns._20_state._02_after;

import _03_behavioral_patterns._20_state._02_after.state.OnlineCourse;
import _03_behavioral_patterns._20_state._02_after.state.Private;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("arthur");
        Student hyunta = new Student("hyunta");
        hyunta.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("hello", student);

        onlineCourse.addStudent(hyunta);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
