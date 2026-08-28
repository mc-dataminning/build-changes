import com.google.common.collect.Maps;
import java.util.Map;

public class gkd extends gkc<cfr, fts<cfr>> {
   private static final Map<cfr.a, ale> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfr.a.b, new ale("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfr.a.a, new ale("textures/entity/cow/red_mooshroom.png"));
   });

   public gkd(giw.a $$0) {
      super($$0, new fts<>($$0.a(fwy.aC)), 0.7F);
      this.a(new gnd<>(this, $$0.c()));
   }

   public ale a(cfr $$0) {
      return a.get($$0.u());
   }
}
