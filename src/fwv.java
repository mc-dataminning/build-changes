import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fwv extends fta<bxt, fgi<bxt>> {
   private static final Map<bjx<?>, afw> a = Maps.newHashMap(
      ImmutableMap.of(bjx.bq, new afw("textures/entity/horse/horse_zombie.png"), bjx.aK, new afw("textures/entity/horse/horse_skeleton.png"))
   );

   public fwv(fud.a $$0, fiu $$1) {
      super($$0, new fgi<>($$0.a($$1)), 1.0F);
   }

   public afw a(bxt $$0) {
      return a.get($$0.ag());
   }
}
