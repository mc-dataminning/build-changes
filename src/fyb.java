import java.util.Map;
import java.util.stream.Collectors;

public class fyb implements AutoCloseable {
   public static final int a = fxy.H().stream().mapToInt(fxy::I).sum();
   private final Map<fxy, etu> b = fxy.H().stream().collect(Collectors.toMap($$0 -> (fxy)$$0, $$0 -> new etu($$0.I())));

   public etu a(fxy $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(etu::g);
   }

   public void b() {
      this.b.values().forEach(etu::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(etu::i);
   }
}
