import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hke extends avf<hkf> {
   public static final hkf a = new hkf(Map.of());
   private static final akx b = akx.a("equipment");
   private Map<ald<dgz>, hkf> c = Map.of();

   public hke() {
      super(hkf.a, b);
   }

   protected void a(Map<ale, hkf> $$0, avb $$1, bqj $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> ald.a(dha.a, (ale)$$0x.getKey()), Entry::getValue));
   }

   public hkf a(ald<dgz> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
