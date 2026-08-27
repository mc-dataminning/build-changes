import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gdk extends fzn<cbv, fmm<cbv>> {
   private static final Map<bnu<?>, aiy> a = Maps.newHashMap(
      ImmutableMap.of(bnu.bt, new aiy("textures/entity/horse/horse_zombie.png"), bnu.aM, new aiy("textures/entity/horse/horse_skeleton.png"))
   );

   public gdk(gas.a $$0, fpa $$1) {
      super($$0, new fmm<>($$0.a($$1)), 1.0F);
   }

   public aiy a(cbv $$0) {
      return a.get($$0.ai());
   }
}
