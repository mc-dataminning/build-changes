import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gls extends ght<chl, fun<chl>> {
   private static final Map<btc<?>, alf> a = Maps.newHashMap(
      ImmutableMap.of(btc.bv, new alf("textures/entity/horse/horse_zombie.png"), btc.aO, new alf("textures/entity/horse/horse_skeleton.png"))
   );

   public gls(giz.a $$0, fxa $$1) {
      super($$0, new fun<>($$0.a($$1)), 1.0F);
   }

   public alf a(chl $$0) {
      return a.get($$0.ak());
   }
}
