import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hlo extends avh<hlp> {
   public static final hlp a = new hlp(Map.of());
   private static final akz b = akz.a("equipment");
   private Map<alf<dhr>, hlp> c = Map.of();

   public hlo() {
      super(hlp.a, b);
   }

   protected void a(Map<alg, hlp> $$0, avd $$1, bqq $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> alf.a(dhs.a, (alg)$$0x.getKey()), Entry::getValue));
   }

   public hlp a(alf<dhr> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
