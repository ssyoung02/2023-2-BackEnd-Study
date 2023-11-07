@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Onetomany
    private List<Reservation> revervations;
    private  String name;
    @Onetomany
    private List<Medical_department> medical_departments;
}
}