import java.util.Map;
import java.util.stream.Collectors;

public class gak implements AutoCloseable {
   public static final int a = gah.H().stream().mapToInt(gah::I).sum();
   private final Map<gah, ewd> b = gah.H().stream().collect(Collectors.toMap($$0 -> (gah)$$0, $$0 -> new ewd($$0.I())));

   public ewd a(gah $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(ewd::g);
   }

   public void b() {
      this.b.values().forEach(ewd::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(ewd::i);
   }
}
