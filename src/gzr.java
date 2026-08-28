import com.google.common.collect.Maps;
import java.util.Map;

public class gzr extends gxe<ckd, hfw, ghs> {
   private static final Map<ckd.a, alk> a = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ckd.a.b, alk.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(ckd.a.a, alk.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gzr(gyk.a $$0) {
      super($$0, new ghs($$0.a(glf.bN)), new ghs($$0.a(glf.bO)), 0.7F);
      this.a(new hct(this, $$0.d()));
   }

   public alk a(hfw $$0) {
      return a.get($$0.a);
   }

   public hfw b() {
      return new hfw();
   }

   public void a(ckd $$0, hfw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
