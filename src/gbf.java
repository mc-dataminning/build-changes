import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gbf extends fxj<bzx, fki<bzx>> {
   private static final Map<blz<?>, ahg> a = Maps.newHashMap(
      ImmutableMap.of(blz.bs, new ahg("textures/entity/horse/horse_zombie.png"), blz.aL, new ahg("textures/entity/horse/horse_skeleton.png"))
   );

   public gbf(fyn.a $$0, fmv $$1) {
      super($$0, new fki<>($$0.a($$1)), 1.0F);
   }

   public ahg a(bzx $$0) {
      return a.get($$0.ai());
   }
}
