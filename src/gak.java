import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gak<T extends cby> extends fzv<T, flw<T>> {
   private static final Map<bnw<?>, aiy> a = Maps.newHashMap(
      ImmutableMap.of(bnw.y, new aiy("textures/entity/horse/donkey.png"), bnw.ar, new aiy("textures/entity/horse/mule.png"))
   );

   public gak(gba.a $$0, float $$1, fph $$2) {
      super($$0, new flw<>($$0.a($$2)), $$1);
   }

   public aiy a(T $$0) {
      return a.get($$0.ai());
   }
}
