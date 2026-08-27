import java.util.Map;
import java.util.stream.Collectors;

public class fwe implements AutoCloseable {
   public static final int a = fwb.F().stream().mapToInt(fwb::G).sum();
   private final Map<fwb, esc> b = fwb.F().stream().collect(Collectors.toMap($$0 -> (fwb)$$0, $$0 -> new esc($$0.G())));

   public esc a(fwb $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(esc::g);
   }

   public void b() {
      this.b.values().forEach(esc::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(esc::i);
   }
}
