import java.util.Map;
import java.util.stream.Collectors;

public class gbz implements AutoCloseable {
   public static final int a = gbw.H().stream().mapToInt(gbw::I).sum();
   private final Map<gbw, exs> b = gbw.H().stream().collect(Collectors.toMap($$0 -> (gbw)$$0, $$0 -> new exs($$0.I())));

   public exs a(gbw $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(exs::g);
   }

   public void b() {
      this.b.values().forEach(exs::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(exs::i);
   }
}
