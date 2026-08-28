import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class glz extends gia<cgs, fut<cgs>> {
   private static final Map<bsj<?>, akk> a = Maps.newHashMap(
      ImmutableMap.of(bsj.bv, new akk("textures/entity/horse/horse_zombie.png"), bsj.aO, new akk("textures/entity/horse/horse_skeleton.png"))
   );

   public glz(gjg.a $$0, fxg $$1) {
      super($$0, new fut<>($$0.a($$1)), 1.0F);
   }

   public akk a(cgs $$0) {
      return a.get($$0.ak());
   }
}
