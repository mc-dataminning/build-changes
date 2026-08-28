import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hnf extends avj<hng> {
   public static final hng a = new hng(Map.of());
   private static final alb b = alb.a("equipment");
   private Map<alh<dif>, hng> c = Map.of();

   public hnf() {
      super(hng.a, b);
   }

   protected void a(Map<ali, hng> $$0, avf $$1, brb $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> alh.a(dig.a, (ali)$$0x.getKey()), Entry::getValue));
   }

   public hng a(alh<dif> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
