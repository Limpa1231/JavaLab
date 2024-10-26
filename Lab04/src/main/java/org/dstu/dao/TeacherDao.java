package org.dstu.dao;

import org.dstu.domain.Teacher;

public class TeacherDao extends BaseDaoImpl <Teacher, Integer> {
    public TeacherDao() {
        super(Teacher.class);
    }
}
