import com.google.common.collect.Maps;
import java.util.Map;

public class ggy extends ggx<ccv, fqo<ccv>> {
   private static final Map<ccv.a, ajv> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ccv.a.b, new ajv("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(ccv.a.a, new ajv("textures/entity/cow/red_mooshroom.png"));
   });

   public ggy(gfr.a $$0) {
      super($$0, new fqo<>($$0.a(ftu.aC)), 0.7F);
      this.a(new gjx<>(this, $$0.c()));
   }

   public ajv a(ccv $$0) {
      return a.get($$0.u());
   }
}
