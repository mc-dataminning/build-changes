import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gag extends fwk<bzh, fjj<bzh>> {
   private static final Map<blj<?>, agt> a = Maps.newHashMap(
      ImmutableMap.of(blj.bs, new agt("textures/entity/horse/horse_zombie.png"), blj.aL, new agt("textures/entity/horse/horse_skeleton.png"))
   );

   public gag(fxo.a $$0, flw $$1) {
      super($$0, new fjj<>($$0.a($$1)), 1.0F);
   }

   public agt a(bzh $$0) {
      return a.get($$0.ai());
   }
}
