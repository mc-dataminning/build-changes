import java.util.Map;
import java.util.stream.Collectors;

public class gdz implements AutoCloseable {
   public static final int a = gdw.H().stream().mapToInt(gdw::I).sum();
   private final Map<gdw, ezt> b = gdw.H().stream().collect(Collectors.toMap($$0 -> (gdw)$$0, $$0 -> new ezt($$0.I())));

   public ezt a(gdw $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(ezt::g);
   }

   public void b() {
      this.b.values().forEach(ezt::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(ezt::i);
   }
}
