package org.dstu;

import org.dstu.domain.IProduction;
import org.dstu.domain.IUniversity;
import org.dstu.domain.Ship;
import org.dstu.domain.Plane;
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
        List<IProduction> transport = new ArrayList<>();
        for (String[] strArray: strings) {
            // Create ships and planes
            if (strArray[0].equals("0")) {
                transport.add( new Ship(strArray));
            } else {
                transport.add( new Plane(strArray));
            }
        }

        transport.forEach(IProduction::printInfo);

        Serializer.serialize(transport, args[1]);
        List<IProduction> newTransport = (List<IProduction>) Serializer.deserialize(args[1]);
        newTransport.forEach(IProduction::printInfo);
    }
}