import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gds extends fzv<cbz, fmt<cbz>> {
   private static final Map<bnw<?>, aiy> a = Maps.newHashMap(
      ImmutableMap.of(bnw.bt, new aiy("textures/entity/horse/horse_zombie.png"), bnw.aM, new aiy("textures/entity/horse/horse_skeleton.png"))
   );

   public gds(gba.a $$0, fph $$1) {
      super($$0, new fmt<>($$0.a($$1)), 1.0F);
   }

   public aiy a(cbz $$0) {
      return a.get($$0.ai());
   }
}
