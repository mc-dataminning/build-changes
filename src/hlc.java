import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hlc extends avh<hld> {
   public static final hld a = new hld(Map.of());
   private static final akz b = akz.a("equipment");
   private Map<alf<dhk>, hld> c = Map.of();

   public hlc() {
      super(hld.a, b);
   }

   protected void a(Map<alg, hld> $$0, avd $$1, bqo $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> alf.a(dhl.a, (alg)$$0x.getKey()), Entry::getValue));
   }

   public hld a(alf<dhk> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
