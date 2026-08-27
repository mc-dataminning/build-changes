import com.google.common.collect.Maps;
import java.util.Map;

public class fvk extends fvj<bwh, ffq<bwh>> {
   private static final Map<bwh.a, afw> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bwh.a.b, new afw("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bwh.a.a, new afw("textures/entity/cow/red_mooshroom.png"));
   });

   public fvk(fud.a $$0) {
      super($$0, new ffq<>($$0.a(fiv.aw)), 0.7F);
      this.a(new fyg<>(this, $$0.c()));
   }

   public afw a(bwh $$0) {
      return a.get($$0.t());
   }
}
