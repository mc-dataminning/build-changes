import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hgy extends aut<hgz> {
   public static final hgz a = new hgz(Map.of());
   private static final ako b = ako.a("equipment");
   private Map<aku<det>, hgz> c = Map.of();

   public hgy() {
      super(hgz.a, b);
   }

   protected void a(Map<akv, hgz> $$0, aup $$1, bou $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> aku.a(deu.a, (akv)$$0x.getKey()), Entry::getValue));
   }

   public hgz a(aku<det> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
