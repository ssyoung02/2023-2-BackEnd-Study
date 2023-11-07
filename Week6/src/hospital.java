@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Medical_departments medical_departments;
    private  String name;
}