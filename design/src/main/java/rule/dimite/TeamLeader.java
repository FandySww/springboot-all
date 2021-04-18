package rule.dimite;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNUmberOfCourses(){
        List<Course> courseList = new ArrayList<>();
        for(int i=0;i<20;i++){
            courseList.add(new Course());
        }
        System.out.println("目前已经发的课程是"+courseList.size());
    }
}
