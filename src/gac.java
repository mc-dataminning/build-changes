import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gac<T extends cbu> extends fzn<T, flp<T>> {
   private static final Map<bnu<?>, aiy> a = Maps.newHashMap(
      ImmutableMap.of(bnu.y, new aiy("textures/entity/horse/donkey.png"), bnu.ar, new aiy("textures/entity/horse/mule.png"))
   );

   public gac(gas.a $$0, float $$1, fpa $$2) {
      super($$0, new flp<>($$0.a($$2)), $$1);
   }

   public aiy a(T $$0) {
      return a.get($$0.ai());
   }
}
