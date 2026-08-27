import com.google.common.collect.Maps;
import java.util.Map;

public class gie extends gid<cec, fru<cec>> {
   private static final Map<cec.a, akh> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cec.a.b, new akh("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cec.a.a, new akh("textures/entity/cow/red_mooshroom.png"));
   });

   public gie(ggx.a $$0) {
      super($$0, new fru<>($$0.a(fva.aC)), 0.7F);
      this.a(new gld<>(this, $$0.c()));
   }

   public akh a(cec $$0) {
      return a.get($$0.u());
   }
}
