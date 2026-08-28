import com.google.common.collect.Maps;
import java.util.Map;

public class gtl extends gqy<chl, gzp, gbr> {
   private static final Map<chl.a, akv> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chl.a.b, akv.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(chl.a.a, akv.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gtl(gse.a $$0) {
      super($$0, new gbr($$0.a(gfc.bB)), new gbr($$0.a(gfc.bC)), 0.7F);
      this.a(new gwo(this, $$0.d()));
   }

   public akv a(gzp $$0) {
      return a.get($$0.a);
   }

   public gzp b() {
      return new gzp();
   }

   public void a(chl $$0, gzp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
