@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class medical_department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;
    @Onetomany
    private List<Hospital> hospitals;
    private  String name;
}