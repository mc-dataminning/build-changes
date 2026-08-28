import com.google.common.collect.Maps;
import java.util.Map;

public class gqh extends gnv<chi, gwg, fyr> {
   private static final Map<chi.a, all> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chi.a.b, all.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(chi.a.a, all.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gqh(gpa.a $$0) {
      super($$0, new fyr($$0.a(gcb.bj)), new fyr($$0.a(gcb.bk)), 0.7F);
      this.a(new gti(this, $$0.d()));
   }

   public all a(gwg $$0) {
      return a.get($$0.a);
   }

   public gwg c() {
      return new gwg();
   }

   public void a(chi $$0, gwg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
