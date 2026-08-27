import java.util.Map;
import java.util.stream.Collectors;

public class gbp implements AutoCloseable {
   public static final int a = gbm.H().stream().mapToInt(gbm::I).sum();
   private final Map<gbm, exi> b = gbm.H().stream().collect(Collectors.toMap($$0 -> (gbm)$$0, $$0 -> new exi($$0.I())));

   public exi a(gbm $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(exi::g);
   }

   public void b() {
      this.b.values().forEach(exi::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(exi::i);
   }
}
