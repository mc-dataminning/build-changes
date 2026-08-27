import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gkm extends ggn<cgk, fth<cgk>> {
   private static final Map<bsc<?>, akn> a = Maps.newHashMap(
      ImmutableMap.of(bsc.bv, new akn("textures/entity/horse/horse_zombie.png"), bsc.aO, new akn("textures/entity/horse/horse_skeleton.png"))
   );

   public gkm(ght.a $$0, fvu $$1) {
      super($$0, new fth<>($$0.a($$1)), 1.0F);
   }

   public akn a(cgk $$0) {
      return a.get($$0.ak());
   }
}
