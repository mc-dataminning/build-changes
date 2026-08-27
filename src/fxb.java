import java.util.Map;
import java.util.stream.Collectors;

public class fxb implements AutoCloseable {
   public static final int a = fwy.H().stream().mapToInt(fwy::I).sum();
   private final Map<fwy, esy> b = fwy.H().stream().collect(Collectors.toMap($$0 -> (fwy)$$0, $$0 -> new esy($$0.I())));

   public esy a(fwy $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(esy::g);
   }

   public void b() {
      this.b.values().forEach(esy::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(esy::i);
   }
}
