package Task;/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
//package ;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * IKIN HASANOV's response to Homework [x], Module [x].
 *
 *   Task:
 *
 *
 * @version 1.10
 * @Since [DD] [MMM] [YYYY]
 * @class
 * @author Ilkin Hasanov
 */
public class GraphicDesigner extends Employee {
    @Override
    public int getSalary() {
        int fullYears = (int) ChronoUnit.YEARS.between(super.getEntranceDay(), LocalDate.now());
        return 10000 * fullYears;
    }
}
