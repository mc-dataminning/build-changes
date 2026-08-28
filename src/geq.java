import java.util.Map;
import java.util.stream.Collectors;

public class geq implements AutoCloseable {
   public static final int a = gen.H().stream().mapToInt(gen::I).sum();
   private final Map<gen, faj> b = gen.H().stream().collect(Collectors.toMap($$0 -> (gen)$$0, $$0 -> new faj($$0.I())));

   public faj a(gen $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(faj::g);
   }

   public void b() {
      this.b.values().forEach(faj::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(faj::i);
   }
}
