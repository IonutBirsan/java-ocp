package ch13.ex3;

import org.example.ch13.ex3.StudentGradeEvaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeEvaluatorTest {

    @Test
    public void testAverageScore() {
        assert (StudentGradeEvaluator.calculateAverageScore(90, 80, 70) == 80.0);
        assert (StudentGradeEvaluator.calculateAverageScore(100, 100, 100) == 100.0);
        assert (StudentGradeEvaluator.calculateAverageScore(0, 0, 0) == 0.0);
        assert (StudentGradeEvaluator.calculateAverageScore(50, 60, 70) == 60.0);
        assert (StudentGradeEvaluator.calculateAverageScore(57, 86, 43) == 62.0);
        assertEquals(62.33, StudentGradeEvaluator.calculateAverageScore(57, 86, 44), 0.1);

    }

    @Test
    public void calculateGradeTest() {
        assertEquals('A', StudentGradeEvaluator.calculateGrade(90.0));
        assertEquals('A', StudentGradeEvaluator.calculateGrade(95.0));
        assertEquals('B', StudentGradeEvaluator.calculateGrade(80.0));
        assertEquals('C', StudentGradeEvaluator.calculateGrade(70.0));
        assertEquals('C', StudentGradeEvaluator.calculateGrade(73.0));
        assertEquals('D', StudentGradeEvaluator.calculateGrade(60.0));
        assertEquals('F', StudentGradeEvaluator.calculateGrade(50.0));
        assertEquals('F', StudentGradeEvaluator.calculateGrade(0.0));
    }

    @Test
    public void calculatePassingTest() {
        assertEquals("Pass", StudentGradeEvaluator.calculatePassing(90, 80.0));
        assertEquals("Pass", StudentGradeEvaluator.calculatePassing(75, 70.0));
        assertEquals("Pass", StudentGradeEvaluator.calculatePassing(100, 100.0));

        assertEquals("Re-exam", StudentGradeEvaluator.calculatePassing(69, 50.0));
        assertEquals("Re-exam", StudentGradeEvaluator.calculatePassing(50, 100));
        assertEquals("Re-exam", StudentGradeEvaluator.calculatePassing(0, 80.0));

        assertEquals("Fail", StudentGradeEvaluator.calculatePassing(69, 49.0));
        assertEquals("Fail", StudentGradeEvaluator.calculatePassing(0, 30.0));
        assertEquals("Fail", StudentGradeEvaluator.calculatePassing(70, 40.0));
    }


}
