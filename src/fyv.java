import com.google.common.collect.Maps;
import java.util.Map;

public class fyv extends fyu<bxv, fir<bxv>> {
   private static final Map<bxv.a, agt> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bxv.a.b, new agt("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bxv.a.a, new agt("textures/entity/cow/red_mooshroom.png"));
   });

   public fyv(fxo.a $$0) {
      super($$0, new fir<>($$0.a(flx.az)), 0.7F);
      this.a(new gbu<>(this, $$0.c()));
   }

   public agt a(bxv $$0) {
      return a.get($$0.w());
   }
}
