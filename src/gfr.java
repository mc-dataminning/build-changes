import java.util.Map;
import java.util.stream.Collectors;

public class gfr implements AutoCloseable {
   public static final int a = gfo.I().stream().mapToInt(gfo::J).sum();
   private final Map<gfo, fax> b = gfo.I().stream().collect(Collectors.toMap($$0 -> (gfo)$$0, $$0 -> new fax($$0.J())));

   public fax a(gfo $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(fax::g);
   }

   public void b() {
      this.b.values().forEach(fax::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(fax::i);
   }
}
