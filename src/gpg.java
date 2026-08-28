import com.google.common.collect.Maps;
import java.util.Map;

public class gpg extends gmu<cgz, gvf, fxq> {
   private static final Map<cgz.a, alh> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cgz.a.b, alh.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cgz.a.a, alh.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gpg(gnz.a $$0) {
      super($$0, new fxq($$0.a(gba.bj)), new fxq($$0.a(gba.bk)), 0.7F);
      this.a(new gsh(this, $$0.d()));
   }

   public alh a(gvf $$0) {
      return a.get($$0.a);
   }

   public gvf c() {
      return new gvf();
   }

   public void a(cgz $$0, gvf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
