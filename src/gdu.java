import java.util.Map;
import java.util.stream.Collectors;

public class gdu implements AutoCloseable {
   public static final int a = gdr.H().stream().mapToInt(gdr::I).sum();
   private final Map<gdr, ezo> b = gdr.H().stream().collect(Collectors.toMap($$0 -> (gdr)$$0, $$0 -> new ezo($$0.I())));

   public ezo a(gdr $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(ezo::g);
   }

   public void b() {
      this.b.values().forEach(ezo::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(ezo::i);
   }
}
