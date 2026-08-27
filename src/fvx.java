import java.util.Map;
import java.util.stream.Collectors;

public class fvx implements AutoCloseable {
   public static final int a = fvu.F().stream().mapToInt(fvu::G).sum();
   private final Map<fvu, erv> b = fvu.F().stream().collect(Collectors.toMap($$0 -> (fvu)$$0, $$0 -> new erv($$0.G())));

   public erv a(fvu $$0) {
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
