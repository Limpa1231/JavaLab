import org.dstu.dao.AeroflotDao;
import org.dstu.dao.ShipDao;
import org.dstu.dao.PlaneDao;
import org.dstu.domain.Aeroflot;
import org.dstu.domain.Ship;
import org.dstu.domain.Plane;
import org.dstu.util.HibernateUtil;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.metamodel.EntityType;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Session session = HibernateUtil.getSession();
        ShipDao shipDao = new ShipDao();
        Ship ship = new Ship();
        ship.setName("Виктория");
        ship.setType("Крейсер");
        ship.setOwner("Акименко Юрий Николаевич");
        ship.setBuilder("2012-01-06, г.Морозовск");
        ship.setFlag("Россия");
        shipDao.save(shipDao);

        AeroflotDao aeroflotDao = new AeroflotDao();

        Aeroflot aeroflot = new Aeroflot();
        aeroflot.setDeparturePoint("ИСТ");
        aeroflot.setFlightNumber(4);
        aeroflot.setDepartureDate("2024-10-20");
        aeroflot.setDepartureTime("12:20:20");
        aeroflot.setDestinationCity("Москва");
        aeroflot.setTypeOfAircraft("Авиа");
        aeroflot.setNumberOfPassengers(363);
        aeroflot.setAvailableSeats(10);
        int savedId = aeroflotDao.save(aeroflotDao);
        System.out.println(savedId);

        PlaneDao planeDao = new PlaneDao();
        Plane plane = new Plane();
        plane.setModel("Привалов");
        plane.setManufacturer("Максим");
        plane.setYearOfManufacture("2003-04-12");
        plane.setStatus("Прибыл");
        plane.setLastMaintenanceDate("2024-09-29");
        plane.setAeroflot(aeroflot);

        planeDao.save(planeDao);

        try {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }
//        StudentDao studentDao = new StudentDao();
//
//        Student student = new Student();
//        student.setLastName("Иванов");
//        student.setFirstName("Иван");
//        student.setMiddleName("Иванович");
//        student.setGrp("МИН11");
//        student.setTranscriptNum(322223);
//        student.setProgramme("ИСТ в научных исследованиях");
//        studentDao.save(student);
//
//        ChairDao chairDao = new ChairDao();
//
//        Chair ist = new Chair();
//        ist.setName("ИСТ");
//        ist.setGraduating(true);
//        int savedId = chairDao.save(ist);
//        System.out.println(savedId);
//
//        TeacherDao teacherDao = new TeacherDao();
//        Teacher teacher = new Teacher();
//        teacher.setLastName("Привалов");
//        teacher.setFirstName("Максим");
//        teacher.setExperience(23);
//        teacher.setGrade("ктн");
//        teacher.setChair(ist);
//
//        teacherDao.save(teacher);
//
//        Teacher teacher2 = new Teacher();
//        teacher2.setLastName("Левченков");
//        teacher2.setFirstName("Александр");
//        teacher2.setExperience(40);
//        teacher2.setGrade("ктн");
//        teacher2.setChair(ist);
//        teacherDao.save(teacher2);
    }

}