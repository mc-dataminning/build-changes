import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hmv extends avs<hmw> {
   public static final hmw a = new hmw(Map.of());
   private static final alk b = alk.a("equipment");
   private Map<alq<dir>, hmw> c = Map.of();

   public hmv() {
      super(hmw.a, b);
   }

   protected void a(Map<alr, hmw> $$0, avo $$1, brm $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> alq.a(dis.a, (alr)$$0x.getKey()), Entry::getValue));
   }

   public hmw a(alq<dir> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
