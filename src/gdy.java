import java.util.Map;
import java.util.stream.Collectors;

public class gdy implements AutoCloseable {
   public static final int a = gdv.H().stream().mapToInt(gdv::I).sum();
   private final Map<gdv, ezs> b = gdv.H().stream().collect(Collectors.toMap($$0 -> (gdv)$$0, $$0 -> new ezs($$0.I())));

   public ezs a(gdv $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(ezs::g);
   }

   public void b() {
      this.b.values().forEach(ezs::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(ezs::i);
   }
}
