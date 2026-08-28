import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hlv extends avh<hlw> {
   public static final hlw a = new hlw(Map.of());
   private static final akz b = akz.a("equipment");
   private Map<alf<dhu>, hlw> c = Map.of();

   public hlv() {
      super(hlw.a, b);
   }

   protected void a(Map<alg, hlw> $$0, avd $$1, bqq $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> alf.a(dhv.a, (alg)$$0x.getKey()), Entry::getValue));
   }

   public hlw a(alf<dhu> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
