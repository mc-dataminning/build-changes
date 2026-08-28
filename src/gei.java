import java.util.Map;
import java.util.stream.Collectors;

public class gei implements AutoCloseable {
   public static final int a = gef.H().stream().mapToInt(gef::I).sum();
   private final Map<gef, fab> b = gef.H().stream().collect(Collectors.toMap($$0 -> (gef)$$0, $$0 -> new fab($$0.I())));

   public fab a(gef $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(fab::g);
   }

   public void b() {
      this.b.values().forEach(fab::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(fab::i);
   }
}
