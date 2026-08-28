import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hgx extends aut<hgy> {
   public static final hgy a = new hgy(Map.of());
   private static final ako b = ako.a("equipment");
   private Map<aku<des>, hgy> c = Map.of();

   public hgx() {
      super(hgy.a, b);
   }

   protected void a(Map<akv, hgy> $$0, aup $$1, bot $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> aku.a(det.a, (akv)$$0x.getKey()), Entry::getValue));
   }

   public hgy a(aku<des> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
