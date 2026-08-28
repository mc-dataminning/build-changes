import com.google.common.collect.Maps;
import java.util.Map;

public class gvm extends gsz<cit, hbp, gdq> {
   private static final Map<cit.a, ald> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cit.a.b, ald.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cit.a.a, ald.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gvm(guf.a $$0) {
      super($$0, new gdq($$0.a(ghc.bJ)), new gdq($$0.a(ghc.bK)), 0.7F);
      this.a(new gyo(this, $$0.d()));
   }

   public ald a(hbp $$0) {
      return a.get($$0.a);
   }

   public hbp b() {
      return new hbp();
   }

   public void a(cit $$0, hbp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
