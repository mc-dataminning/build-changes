import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fvz extends fse<bwq, ffo<bwq>> {
   private static final Map<biu<?>, aex> a = Maps.newHashMap(
      ImmutableMap.of(biu.bq, new aex("textures/entity/horse/horse_zombie.png"), biu.aK, new aex("textures/entity/horse/horse_skeleton.png"))
   );

   public fvz(fth.a $$0, fia $$1) {
      super($$0, new ffo<>($$0.a($$1)), 1.0F);
   }

   public aex a(bwq $$0) {
      return a.get($$0.ag());
   }
}
