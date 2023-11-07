@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class pateint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Onetomany
    private List<Reservation> revervations;
    private  String name;
}