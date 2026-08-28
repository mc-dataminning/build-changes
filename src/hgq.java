import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hgq extends aus<hgr> {
   public static final hgr a = new hgr(Map.of());
   private static final akn b = akn.a("equipment");
   private Map<akt<deq>, hgr> c = Map.of();

   public hgq() {
      super(hgr.a, b);
   }

   protected void a(Map<aku, hgr> $$0, auo $$1, bor $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> akt.a(der.a, (aku)$$0x.getKey()), Entry::getValue));
   }

   public hgr a(akt<deq> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
