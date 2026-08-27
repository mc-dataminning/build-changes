import java.util.Map;
import java.util.stream.Collectors;

public class gat implements AutoCloseable {
   public static final int a = gaq.H().stream().mapToInt(gaq::I).sum();
   private final Map<gaq, ewm> b = gaq.H().stream().collect(Collectors.toMap($$0 -> (gaq)$$0, $$0 -> new ewm($$0.I())));

   public ewm a(gaq $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(ewm::g);
   }

   public void b() {
      this.b.values().forEach(ewm::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(ewm::i);
   }
}
