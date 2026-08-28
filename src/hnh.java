import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hnh extends avl<hni> {
   public static final hni a = new hni(Map.of());
   private static final ald b = ald.a("equipment");
   private Map<alj<dih>, hni> c = Map.of();

   public hnh() {
      super(hni.a, b);
   }

   protected void a(Map<alk, hni> $$0, avh $$1, brd $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> alj.a(dii.a, (alk)$$0x.getKey()), Entry::getValue));
   }

   public hni a(alj<dih> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
