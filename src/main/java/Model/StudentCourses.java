package Model;
import lombok.*;

import javax.persistence.Entity;

@Data
@Setter
@Getter
@Entity
public class StudentCourses {
   private Long id;
   private int grades;


}
