import com.google.common.collect.Maps;
import java.util.Map;

public class fxj extends fxi<bxj, fhn<bxj>> {
   private static final Map<bxj.a, agm> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bxj.a.b, new agm("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bxj.a.a, new agm("textures/entity/cow/red_mooshroom.png"));
   });

   public fxj(fwc.a $$0) {
      super($$0, new fhn<>($$0.a(fks.aw)), 0.7F);
      this.a(new gaf<>(this, $$0.c()));
   }

   public agm a(bxj $$0) {
      return a.get($$0.w());
   }
}
