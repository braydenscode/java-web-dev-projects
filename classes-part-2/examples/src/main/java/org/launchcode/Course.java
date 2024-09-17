package org.launchcode;

import java.util.Objects;

public class Course {
    private String title;
    private int credits;
    private String insctructor;

    public Course (String title, int credits, String insctructor) {
        this.title = title;
        this.credits = credits;
        this.insctructor = insctructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) && Objects.equals(insctructor, course.insctructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, insctructor);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                ", insctructor='" + insctructor + '\'' +
                '}';
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getInsctructor() {
        return insctructor;
    }

    public void setInsctructor(String insctructor) {
        this.insctructor = insctructor;
    }
}
