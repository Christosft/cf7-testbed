package gr.aueb.cf1.ch20.lambdas;

@FunctionalInterface
public interface ITeacherFilter {
    boolean filterId(Teacher teacher);
}
