import com.google.common.collect.Maps;
import java.util.Map;

public class fzm extends fzl<byf, fji<byf>> {
   private static final Map<byf.a, ahd> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(byf.a.b, new ahd("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(byf.a.a, new ahd("textures/entity/cow/red_mooshroom.png"));
   });

   public fzm(fyf.a $$0) {
      super($$0, new fji<>($$0.a(fmo.az)), 0.7F);
      this.a(new gcl<>(this, $$0.c()));
   }

   public ahd a(byf $$0) {
      return a.get($$0.w());
   }
}
