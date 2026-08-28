import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hku extends avh<hkv> {
   public static final hkv a = new hkv(Map.of());
   private static final akz b = akz.a("equipment");
   private Map<alf<dhf>, hkv> c = Map.of();

   public hku() {
      super(hkv.a, b);
   }

   protected void a(Map<alg, hkv> $$0, avd $$1, bqm $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> alf.a(dhg.a, (alg)$$0x.getKey()), Entry::getValue));
   }

   public hkv a(alf<dhf> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
