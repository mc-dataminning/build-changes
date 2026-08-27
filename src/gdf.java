import com.google.common.collect.Maps;
import java.util.Map;

public class gdf extends gde<caz, fmx<caz>> {
   private static final Map<caz.a, ajc> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(caz.a.b, new ajc("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(caz.a.a, new ajc("textures/entity/cow/red_mooshroom.png"));
   });

   public gdf(gby.a $$0) {
      super($$0, new fmx<>($$0.a(fqe.ay)), 0.7F);
      this.a(new gge<>(this, $$0.c()));
   }

   public ajc a(caz $$0) {
      return a.get($$0.w());
   }
}
