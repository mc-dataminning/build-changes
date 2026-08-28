import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gmw extends gix<chg, fvp<chg>> {
   private static final Map<bsw<?>, akq> a = Maps.newHashMap(
      ImmutableMap.of(bsw.bv, akq.b("textures/entity/horse/horse_zombie.png"), bsw.aO, akq.b("textures/entity/horse/horse_skeleton.png"))
   );

   public gmw(gkd.a $$0, fyc $$1) {
      super($$0, new fvp<>($$0.a($$1)), 1.0F);
   }

   public akq a(chg $$0) {
      return a.get($$0.am());
   }
}
