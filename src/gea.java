import java.util.Map;
import java.util.stream.Collectors;

public class gea implements AutoCloseable {
   public static final int a = gdx.H().stream().mapToInt(gdx::I).sum();
   private final Map<gdx, ezu> b = gdx.H().stream().collect(Collectors.toMap($$0 -> (gdx)$$0, $$0 -> new ezu($$0.I())));

   public ezu a(gdx $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(ezu::g);
   }

   public void b() {
      this.b.values().forEach(ezu::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(ezu::i);
   }
}
