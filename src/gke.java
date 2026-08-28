import com.google.common.collect.Maps;
import java.util.Map;

public class gke extends gkd<cfs, ftt<cfs>> {
   private static final Map<cfs.a, alf> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfs.a.b, new alf("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfs.a.a, new alf("textures/entity/cow/red_mooshroom.png"));
   });

   public gke(gix.a $$0) {
      super($$0, new ftt<>($$0.a(fwz.aC)), 0.7F);
      this.a(new gne<>(this, $$0.c()));
   }

   public alf a(cfs $$0) {
      return a.get($$0.u());
   }
}
