import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hhw extends aut<hhx> {
   public static final hhx a = new hhx(Map.of());
   private static final akn b = akn.a("equipment");
   private Map<akt<dfk>, hhx> c = Map.of();

   public hhw() {
      super(hhx.a, b);
   }

   protected void a(Map<aku, hhx> $$0, aup $$1, bpj $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> akt.a(dfl.a, (aku)$$0x.getKey()), Entry::getValue));
   }

   public hhx a(akt<dfk> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
