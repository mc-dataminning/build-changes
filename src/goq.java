import com.google.common.collect.Maps;
import java.util.Map;

public class goq extends gme<cgn, guo, fxb> {
   private static final Map<cgn.a, alc> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cgn.a.b, alc.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cgn.a.a, alc.b("textures/entity/cow/red_mooshroom.png"));
   });

   public goq(gnj.a $$0) {
      super($$0, new fxb($$0.a(gak.bj)), new fxb($$0.a(gak.bk)), 0.7F);
      this.a(new grr(this, $$0.d()));
   }

   public alc a(guo $$0) {
      return a.get($$0.a);
   }

   public guo c() {
      return new guo();
   }

   public void a(cgn $$0, guo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
