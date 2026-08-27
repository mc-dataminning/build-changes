import java.util.Map;
import java.util.stream.Collectors;

public class fyd implements AutoCloseable {
   public static final int a = fya.H().stream().mapToInt(fya::I).sum();
   private final Map<fya, etw> b = fya.H().stream().collect(Collectors.toMap($$0 -> (fya)$$0, $$0 -> new etw($$0.I())));

   public etw a(fya $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(etw::g);
   }

   public void b() {
      this.b.values().forEach(etw::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(etw::i);
   }
}
