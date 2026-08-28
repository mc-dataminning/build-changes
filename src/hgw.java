import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hgw extends aut<hgx> {
   public static final hgx a = new hgx(Map.of());
   private static final ako b = ako.a("equipment");
   private Map<aku<der>, hgx> c = Map.of();

   public hgw() {
      super(hgx.a, b);
   }

   protected void a(Map<akv, hgx> $$0, aup $$1, bos $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> aku.a(des.a, (akv)$$0x.getKey()), Entry::getValue));
   }

   public hgx a(aku<der> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
