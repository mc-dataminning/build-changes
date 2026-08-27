import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gax extends fxb<bzr, fka<bzr>> {
   private static final Map<blt<?>, ahd> a = Maps.newHashMap(
      ImmutableMap.of(blt.bs, new ahd("textures/entity/horse/horse_zombie.png"), blt.aL, new ahd("textures/entity/horse/horse_skeleton.png"))
   );

   public gax(fyf.a $$0, fmn $$1) {
      super($$0, new fka<>($$0.a($$1)), 1.0F);
   }

   public ahd a(bzr $$0) {
      return a.get($$0.ai());
   }
}
