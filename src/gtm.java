import com.google.common.collect.Maps;
import java.util.Map;

public class gtm extends gqz<chm, gzq, gbs> {
   private static final Map<chm.a, akv> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chm.a.b, akv.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(chm.a.a, akv.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gtm(gsf.a $$0) {
      super($$0, new gbs($$0.a(gfd.bB)), new gbs($$0.a(gfd.bC)), 0.7F);
      this.a(new gwp(this, $$0.d()));
   }

   public akv a(gzq $$0) {
      return a.get($$0.a);
   }

   public gzq b() {
      return new gzq();
   }

   public void a(chm $$0, gzq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
