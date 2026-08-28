import com.google.common.collect.Maps;
import java.util.Map;

public class gyf extends gvs<cjq, hek, ggf> {
   private static final Map<cjq.a, alg> a = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjq.a.b, alg.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cjq.a.a, alg.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gyf(gwy.a $$0) {
      super($$0, new ggf($$0.a(gjs.bN)), new ggf($$0.a(gjs.bO)), 0.7F);
      this.a(new hbh(this, $$0.d()));
   }

   public alg a(hek $$0) {
      return a.get($$0.a);
   }

   public hek b() {
      return new hek();
   }

   public void a(cjq $$0, hek $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
