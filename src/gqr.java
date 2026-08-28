import com.google.common.collect.Maps;
import java.util.Map;

public class gqr extends gof<chl, gwr, fza> {
   private static final Map<chl.a, alj> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chl.a.b, alj.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(chl.a.a, alj.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gqr(gpk.a $$0) {
      super($$0, new fza($$0.a(gck.bx)), new fza($$0.a(gck.by)), 0.7F);
      this.a(new gtt(this, $$0.d()));
   }

   public alj a(gwr $$0) {
      return a.get($$0.a);
   }

   public gwr b() {
      return new gwr();
   }

   public void a(chl $$0, gwr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
   }
}
