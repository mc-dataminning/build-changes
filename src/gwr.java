import com.google.common.collect.Maps;
import java.util.Map;

public class gwr extends gue<cjb, hcu, get> {
   private static final Map<cjb.a, ale> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjb.a.b, ale.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cjb.a.a, ale.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gwr(gvk.a $$0) {
      super($$0, new get($$0.a(gif.bJ)), new get($$0.a(gif.bK)), 0.7F);
      this.a(new gzt(this, $$0.d()));
   }

   public ale a(hcu $$0) {
      return a.get($$0.a);
   }

   public hcu b() {
      return new hcu();
   }

   public void a(cjb $$0, hcu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
