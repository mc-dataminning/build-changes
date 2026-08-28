import com.google.common.collect.Maps;
import java.util.Map;

public class glk extends glj<cfp, fux<cfp>> {
   private static final Map<cfp.a, akq> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfp.a.b, akq.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfp.a.a, akq.b("textures/entity/cow/red_mooshroom.png"));
   });

   public glk(gkd.a $$0) {
      super($$0, new fux<>($$0.a(fyd.aD)), 0.7F);
      this.a(new gok<>(this, $$0.c()));
   }

   public akq a(cfp $$0) {
      return a.get($$0.t());
   }
}
