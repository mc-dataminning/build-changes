import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fyp extends fuu<byq, fia<byq>> {
   private static final Map<bku<?>, agi> a = Maps.newHashMap(
      ImmutableMap.of(bku.bq, new agi("textures/entity/horse/horse_zombie.png"), bku.aK, new agi("textures/entity/horse/horse_skeleton.png"))
   );

   public fyp(fvx.a $$0, fkm $$1) {
      super($$0, new fia<>($$0.a($$1)), 1.0F);
   }

   public agi a(byq $$0) {
      return a.get($$0.ai());
   }
}
