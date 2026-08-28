import com.google.common.collect.Maps;
import java.util.Map;

public class glq extends glp<cfr, fvd<cfr>> {
   private static final Map<cfr.a, akr> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfr.a.b, akr.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfr.a.a, akr.b("textures/entity/cow/red_mooshroom.png"));
   });

   public glq(gkj.a $$0) {
      super($$0, new fvd<>($$0.a(fyj.aD)), 0.7F);
      this.a(new goq<>(this, $$0.c()));
   }

   public akr a(cfr $$0) {
      return a.get($$0.t());
   }
}
