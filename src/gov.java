import com.google.common.collect.Maps;
import java.util.Map;

public class gov extends gmj<cgq, gut, fxf> {
   private static final Map<cgq.a, ale> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cgq.a.b, ale.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cgq.a.a, ale.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gov(gno.a $$0) {
      super($$0, new fxf($$0.a(gap.bj)), new fxf($$0.a(gap.bk)), 0.7F);
      this.a(new grw(this, $$0.d()));
   }

   public ale a(gut $$0) {
      return a.get($$0.a);
   }

   public gut c() {
      return new gut();
   }

   public void a(cgq $$0, gut $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
