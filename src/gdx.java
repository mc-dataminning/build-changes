import java.util.Map;
import java.util.stream.Collectors;

public class gdx implements AutoCloseable {
   public static final int a = gdu.H().stream().mapToInt(gdu::I).sum();
   private final Map<gdu, ezr> b = gdu.H().stream().collect(Collectors.toMap($$0 -> (gdu)$$0, $$0 -> new ezr($$0.I())));

   public ezr a(gdu $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(ezr::g);
   }

   public void b() {
      this.b.values().forEach(ezr::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(ezr::i);
   }
}
