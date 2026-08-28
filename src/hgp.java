import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hgp extends aut<hgq> {
   public static final hgq a = new hgq(Map.of());
   private static final akn b = akn.a("equipment");
   private Map<akt<des>, hgq> c = Map.of();

   public hgp() {
      super(hgq.a, b);
   }

   protected void a(Map<aku, hgq> $$0, aup $$1, bos $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> akt.a(det.a, (aku)$$0x.getKey()), Entry::getValue));
   }

   public hgq a(akt<des> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
