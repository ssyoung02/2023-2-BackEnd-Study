@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  Datetime time;
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;
}
