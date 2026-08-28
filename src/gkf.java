import com.google.common.collect.Maps;
import java.util.Map;

public class gkf extends gke<cft, ftu<cft>> {
   private static final Map<cft.a, alf> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cft.a.b, new alf("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cft.a.a, new alf("textures/entity/cow/red_mooshroom.png"));
   });

   public gkf(giy.a $$0) {
      super($$0, new ftu<>($$0.a(fxa.aC)), 0.7F);
      this.a(new gnf<>(this, $$0.c()));
   }

   public alf a(cft $$0) {
      return a.get($$0.u());
   }
}
