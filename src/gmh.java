import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gmh extends gii<cgw, fvb<cgw>> {
   private static final Map<bsn<?>, akk> a = Maps.newHashMap(
      ImmutableMap.of(bsn.bv, new akk("textures/entity/horse/horse_zombie.png"), bsn.aO, new akk("textures/entity/horse/horse_skeleton.png"))
   );

   public gmh(gjo.a $$0, fxo $$1) {
      super($$0, new fvb<>($$0.a($$1)), 1.0F);
   }

   public akk a(cgw $$0) {
      return a.get($$0.am());
   }
}
