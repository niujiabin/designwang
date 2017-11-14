package design.job.entity;

/**
 * 成绩表
 */
public class Grade {

    public int id;

    public int student;

    public int score;

    public int subject;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }
}
