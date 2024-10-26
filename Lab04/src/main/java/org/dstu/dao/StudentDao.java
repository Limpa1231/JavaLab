package org.dstu.dao;

import org.dstu.domain.Student;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDao extends BaseDaoImpl<Student, Integer> {
    public StudentDao() {
        super(Student.class);
    }

    public List<Student> getAllByGroup(String groupName) {
        Query q = getSession().createQuery("FROM Student WHERE Student.grp = \"" + groupName + "\"");
        return q.list();
    }
}
