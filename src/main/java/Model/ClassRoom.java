package Model;
import lombok.*;
import javax.persistence.*;
@Data
@Setter
@Getter
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classNo;
    // one class many student
}