import java.util.Map;
import java.util.stream.Collectors;

public class gcv implements AutoCloseable {
   public static final int a = gcs.H().stream().mapToInt(gcs::I).sum();
   private final Map<gcs, eyn> b = gcs.H().stream().collect(Collectors.toMap($$0 -> (gcs)$$0, $$0 -> new eyn($$0.I())));

   public eyn a(gcs $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(eyn::g);
   }

   public void b() {
      this.b.values().forEach(eyn::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(eyn::i);
   }
}
