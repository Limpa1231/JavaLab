package org.dstu;

import org.dstu.domain.IUniversity;
import org.dstu.domain.Student;
import org.dstu.domain.Teacher;
import org.dstu.tools.MyCsvReader;
import org.dstu.tools.Serializer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Need input and output file arguments!");
            return;
        }

        List<String[]> strings = MyCsvReader.readCsv(args[0], ";");
        System.out.println(strings.size());
        List<IUniversity> people = new ArrayList<>();
        for (String[] strArray: strings) {
            // Create teachers and students
            if (strArray[0].equals("0")) {
                people.add(new Student(strArray));
            } else {
                people.add(new Teacher(strArray));
            }
        }

        people.forEach(IUniversity::printInfo);

        Serializer.serialize(people, args[1]);
        List<IUniversity> newPeople = (List<IUniversity>) Serializer.deserialize(args[1]);
        newPeople.forEach(IUniversity::printInfo);
    }
}