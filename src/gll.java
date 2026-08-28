import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gll extends ghm<che, fug<che>> {
   private static final Map<bsv<?>, alb> a = Maps.newHashMap(
      ImmutableMap.of(bsv.bv, new alb("textures/entity/horse/horse_zombie.png"), bsv.aO, new alb("textures/entity/horse/horse_skeleton.png"))
   );

   public gll(gis.a $$0, fwt $$1) {
      super($$0, new fug<>($$0.a($$1)), 1.0F);
   }

   public alb a(che $$0) {
      return a.get($$0.ak());
   }
}
