import java.util.Map;
import java.util.stream.Collectors;

public class gcv implements AutoCloseable {
   public static final int a = gcs.H().stream().mapToInt(gcs::I).sum();
   private final Map<gcs, eyp> b = gcs.H().stream().collect(Collectors.toMap($$0 -> (gcs)$$0, $$0 -> new eyp($$0.I())));

   public eyp a(gcs $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(eyp::g);
   }

   public void b() {
      this.b.values().forEach(eyp::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(eyp::i);
   }
}
