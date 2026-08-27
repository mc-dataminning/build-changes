import java.util.Map;
import java.util.stream.Collectors;

public class fvw implements AutoCloseable {
   public static final int a = fvt.F().stream().mapToInt(fvt::G).sum();
   private final Map<fvt, erv> b = fvt.F().stream().collect(Collectors.toMap($$0 -> (fvt)$$0, $$0 -> new erv($$0.G())));

   public erv a(fvt $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(erv::g);
   }

   public void b() {
      this.b.values().forEach(erv::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(erv::i);
   }
}
