import com.google.common.collect.Maps;
import java.util.Map;

public class gma extends glz<cer, fvj<cer>> {
   private static final Map<cer.a, akt> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cer.a.b, new akt("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cer.a.a, new akt("textures/entity/cow/red_mooshroom.png"));
   });

   public gma(gkq.a $$0) {
      super($$0, new fvj<>($$0.a(fyr.aG)), 0.7F);
      this.a(new gpc<>(this, $$0.c()));
   }

   public akt a(cer $$0) {
      return a.get($$0.t());
   }
}
