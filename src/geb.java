import java.util.Map;
import java.util.stream.Collectors;

public class geb implements AutoCloseable {
   public static final int a = gdy.H().stream().mapToInt(gdy::I).sum();
   private final Map<gdy, ezv> b = gdy.H().stream().collect(Collectors.toMap($$0 -> (gdy)$$0, $$0 -> new ezv($$0.I())));

   public ezv a(gdy $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(ezv::g);
   }

   public void b() {
      this.b.values().forEach(ezv::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(ezv::i);
   }
}
